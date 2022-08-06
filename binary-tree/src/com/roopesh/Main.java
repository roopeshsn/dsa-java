package com.roopesh;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(21);
        tree.print();
    }
}

class BST {
    Node root;
    public BST() {
        root = null;
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

    public void print() {
        inorder(root);
    }

    public void inorder(Node temp) {
        if (temp == null) {
            return;
        }

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }
}

class Node {
    int key;
    Node left;
    Node right;

    public Node(int val) {
        key = val;
        left = null;
        right = null;
    }
}


