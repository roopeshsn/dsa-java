package com.roopesh;

import static com.roopesh.kthLargest.kthlargest;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int result = kthlargest(arr, 2);
        System.out.println(result);
    }
}
