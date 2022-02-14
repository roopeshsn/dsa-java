package com.roopesh;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        int mid = 0;

        // ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end) {
            mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAscending) {
                if(arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


