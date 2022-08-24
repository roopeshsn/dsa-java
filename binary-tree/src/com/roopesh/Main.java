package com.roopesh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        // int[] arr = {10, 5, 20, 3, 6, 15, 25, 1};
        int[] arr = {10, 5, 20, 3, 6, 12};
        Node root = tree.constructBSTFromArray(arr);
        Node temp = tree.search(root, 3);
        System.out.println(temp.key);

    }
}