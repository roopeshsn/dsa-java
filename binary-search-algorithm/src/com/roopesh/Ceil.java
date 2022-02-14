package com.roopesh;

public class Ceil {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ans = ceil(arr, 16);
        System.out.println(ans);
    }
    static int ceil(int [] arr, int target){
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
        return arr[start];
    }
}
