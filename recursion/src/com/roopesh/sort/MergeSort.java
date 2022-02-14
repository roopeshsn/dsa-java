package com.roopesh.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] sorted = new int[first.length + second.length];
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                sorted[k] = first[i];
                i++;
            } else {
                sorted[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length) {
            sorted[k] = first[i];
            i++;
            k++;
        }
        while(j < first.length) {
            sorted[k] = first[j];
            j++;
            k++;
        }
        return sorted;
    }
}
