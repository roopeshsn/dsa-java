package com.roopesh;

import java.util.Arrays;

import static com.roopesh.QuickSort.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, 8, 7, 6};
//        int result = quickSelect(arr, 2);
//        System.out.println(result);
        quicksort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
