package com.roopesh;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int ans = binarySearch(arr, 16);
        int ans = orderAgnosticBinarySearch(arr, 15);
        System.out.println(ans);
    }

    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if(arr.length == 0 ){
            return -1;
        }

        while(start < end) {
            mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
