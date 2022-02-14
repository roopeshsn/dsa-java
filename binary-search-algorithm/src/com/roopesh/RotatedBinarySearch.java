package com.roopesh;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivot(arr);
        if(pivot == -1) {
            return binarySearch(arr, target, start, end);
        }
        if(arr[pivot] == target) {
            return pivot;
        }
        if(target >= arr[0]) {
            return binarySearch(arr, target, start, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, end);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] arr, int target, int start, int end){
        if(arr.length == 0 ){
            return -1;
        }
        while(start < end) {
            int mid = start + (end - start) / 2;
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
}
