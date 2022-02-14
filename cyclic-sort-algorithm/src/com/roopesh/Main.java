package com.roopesh;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,3,2,1};
        // int ans = missingNumber(arr);
        // ArrayList<Integer> ans = findAllMissingNumbers(arr);
        int ans = findDuplicateNumber(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllMissingNumbers(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // push missing numbers to an array
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static int missingNumber(int[] arr) {
        int idx = 0;
        while(idx < arr.length) {
            int correct = arr[idx];
            if(arr[idx] < arr.length && arr[idx] != arr[correct]){
                swap(arr, idx, correct);
            } else {
                idx++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(i != arr[i]) {
                return i;
            }
        }
        return arr.length;
    }

//    static int findDuplicateNumber(int[] arr) {
//        int i = 0;
//        while(i < arr.length) {
//            int correct = arr[i] - 1;
//            if(arr[i] != arr[correct]) {
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        for(int index = 0; index < arr.length; index++) {
//            if(arr[index] != i + 1) {
//                return arr[index + 1];
//            }
//        }
//        return arr.length;
//    }

    static int findDuplicateNumber(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
