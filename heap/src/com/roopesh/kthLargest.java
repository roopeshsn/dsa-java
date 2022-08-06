package com.roopesh;

public class kthLargest {
    public static int kthlargest(int[] arr, int k) {
        MaxHeap heap = new MaxHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }
        int result = 0;
        for (int j = 0; j < k; j++) {
            result = heap.extractMax();
        }
        return result;
    }
}
