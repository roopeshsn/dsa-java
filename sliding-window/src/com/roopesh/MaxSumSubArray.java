package com.roopesh;

import java.util.ArrayList;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1 , 7, 5};
        ArrayList<Integer> ans = findAllMax(arr, 3);
        System.out.println(ans);
    }

    public static int findMaxSum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];

            // because the size of window is 3
            if(i >= k-1) {
                max = Math.max(max, currentRunningSum);
                currentRunningSum -= arr[i - (k - 1)];
            }
        }

        return max;
    }

    // find all the maximum value in every sliding window

    public static ArrayList<Integer> findAllMax(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int currentRunningSum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];

            // because the size of window is 3
            if(i >= k-1) {
                max = Math.max(max, currentRunningSum);
                list.add(max);
                currentRunningSum -= arr[i - (k - 1)];
            }
        }

        return list;
    }
}
