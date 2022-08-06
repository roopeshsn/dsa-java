package com.roopesh;

import static com.roopesh.QuickSort.quicksort;

public class QuickSelect {
    static int quickSelect(int[] arr, int k) {
        int len = arr.length;
        quicksort(arr);
        return arr[len - k];
    }
}
