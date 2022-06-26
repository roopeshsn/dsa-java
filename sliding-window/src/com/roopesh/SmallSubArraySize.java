package com.roopesh;

public class SmallSubArraySize {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 3, 4};
        int ans = findMinSize(arr, 5);
        System.out.println(ans);
    }

    public static int findMinSize(int[] arr, int k) {
        int minSize = Integer.MAX_VALUE;
        int currentRunningSum = 0;
        int start = 0;
        int end = 0;

        for (end = 0; end < arr.length; end++) {
            currentRunningSum += arr[end];

            while(currentRunningSum >= k) {
                minSize = Math.min(minSize, end - start + 1);
                currentRunningSum -= arr[start];
                start++;
            }
        }

        return minSize;
    }
}
