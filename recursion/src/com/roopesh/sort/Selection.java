package com.roopesh.sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr, int end, int start, int max) {
        if(end == 0) {
            return;
        }

        if(start < end) {
            if(arr[start] > arr[max]) {
                selection(arr, end, start+1, start);
            } else {
                selection(arr, end, start+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1] = temp;
            selection(arr, end-1, 0, 0);
        }
    }

    public static int findMin(int[] arr, int start, int end) {
        int min = arr[start];
        int idx = 0;
        for (int i = start; i < end; i++) {
            if(arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
