package com.roopesh.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr, int end, int start) {
        if(end == 0) {
            return;
        }

        if(start < end) {
            if(arr[start] > arr[start+1]) {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            bubble(arr, end, start+1);
        } else {
            bubble(arr, end-1, 0);
        }
    }
}
