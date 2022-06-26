package com.roopesh;

public class BinaryTree {
    public Node root;

    private class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public insert(int val) {
        if(root == null) {
            this.root = new Node(val);
        }

        if(val < root.val) {
            while(root.left == null) {
                if(val < root.val) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
        }
    }
}
