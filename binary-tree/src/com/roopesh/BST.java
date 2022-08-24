package com.roopesh;

import java.util.*;

public class BST {
    Node root;
    public BST() {
        root = null;
    }

    public Node constructBSTFromArray(int[] arr) {
        root = new Node(arr[0]);
        Node temp = root;

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        return root;

//        while (temp != null) {
//            Node newNode = new Node(arr[i]);
//            if(arr[i] < temp.key) {
//                if(temp.left == null) {
//                    temp.left = newNode;
//                    return;
//                }
//                temp = temp.left;
//            } else {
//                if(temp.right == null) {
//                    temp.right = newNode;
//                    return;
//                }
//                temp = temp.right;
//            }
//        }
    }

    public void insert(int val) {
        if(root == null) {
            root = new Node(10);
        }

        Node current = root;
        Node newNode = new Node(val);
        while(true) {
            if(val == current.key) {
                return;
            }
            if(val < current.key) {
                if(current.left == null) {
                    current.left = newNode;
                    return;
                } else {
                    current = current.left;
                }
            } else {
                if(current.right == null) {
                    current.right = newNode;
                    return;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public Node search(Node root, int target) {
        while(root != null) {
            if (root.key == target) {
                return root;
            }
            if (root.key > target) {
                root = root.left;
            }
            if (root.key < target) {
                root = root.right;
            }
        }
        return null;
    }

    public void print() {
        // calling inorder recursive function which will print the values
        inorder(root);
    }

    public void inorder(Node temp) {
        // left -> root -> right
        if (temp == null) {
            return;
        }

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    public ArrayList<Integer> inorderRet(Node temp) {
        ArrayList<Integer> list = new ArrayList<>();
        if (temp == null) {
            return list;
        }

        ArrayList<Integer> left = inorderRet(temp.left);
        list.add(temp.key);
        ArrayList<Integer> right = inorderRet(temp.right);
        list.addAll(left);
        list.addAll(right);
        return list;
    }

    public List<Integer> inorderIter() {
        List<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        Node temp = root;

        while(true) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                if(stack.isEmpty()) {
                    break;
                }
                temp = stack.pop();
                list.add(temp.key);
                temp = temp.right;
            }
        }

        return list;
    }

    // Level-order traversal (Breadth First Search -> BST)
    // level order traversal could be implemented through Queue DS
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();

        // 2-D list
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null) {
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> internalList = new LinkedList<Integer>();

            for (int i = 0; i < size; i++) {
                // poll -> retrives and removes the head
                // peek -> retrives but won't remove
                assert queue.peek() != null;
                if(queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                internalList.add(queue.poll().key);
            }
            list.add(internalList);
        }

        return list;
    }

    // print adjacent nodes to the given node
    // This could be acheived through level order traversal
    public List<Integer> findAdj(int target) {
        List<Integer> list = new LinkedList<Integer>();
        List<List<Integer>> BFS = this.levelOrder(root);
        System.out.println(BFS);
        return list;
    }

    public int maxDepth(Node temp) {
        if(temp == null) {
            return 0;
        }
        int left = maxDepth(temp.left);
        int right = maxDepth(temp.right);
        return 1 + Math.max(left, right);
    }

    public int maxDepthBFSIter(Node temp) {
        if(temp == null) {
            return 0;
        }

        int level = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);

        while(!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                temp = queue.poll();
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
            level += 1;
        }

        return level;
    }

    public boolean isBalancedTree(Node temp) {
        if(balanced(temp) != -1) {
            return true;
        }
        return false;
    }

    public int balanced(Node temp) {
        if(temp == null) {
            return 0;
        }
        int left = balanced(temp.left);

        if(left == -1) {
            return -1;
        }

        int right = balanced(temp.right);

        if(right == -1) {
            return -1;
        }

        if(!(Math.abs(left - right) <= 1)) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }

    public int[] diameter(Node temp) {
        int[] d = new int[1];
        dia(temp, d);
        return d;
    }

    public int dia(Node temp, int[] maximum) {
        if(temp == null) {
            return 0;
        }
        int left = dia(temp.left, maximum);
        int right = dia(temp.right, maximum);
        maximum[0] = Math.max(maximum[0], left + right);
        return 1 + Math.max(left, right);
    }

    public int maxWidth(Node root) {
        if(root == null) {
            return 0;
        }
        int max = 0;
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()) {
            int size = queue.size();
            int min = queue.peek().val;
            int start = 0;
            int end = 0;

            for (int i = 0; i < size; i++) {
                int curr = queue.peek().val - min;
                Node currNode = queue.poll().node;
                if(i == 0) {
                    start = curr;
                }
                if(i == size - 1) {
                    end = curr;
                }
                if(currNode.left != null) {
                    queue.add(new Pair(currNode.left, 2*i+1));
                }
                if(currNode.right != null) {
                    queue.add(new Pair(currNode.right, 2*i+2));
                }
            }

            max = Math.max(max, end-start+1);
        }

        return max;
    }
}