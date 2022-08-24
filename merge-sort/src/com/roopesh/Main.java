package com.roopesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 3, 2};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int size = first.length + second.length;
        int[] merged = new int[size];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end) {
            if(arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        while(j < end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }
}
