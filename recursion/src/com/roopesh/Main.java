package com.roopesh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Integer> ans = fiboInArray(100);
        // int ans = fiboR(4);
        int[] arr = {1, 3, 4, 15, 16, 21, 23, 66, 99};
        int target = 100;
        int start = 0;
        int end = arr.length - 1;
        int ans = binarySearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int fiboR(int n) {
        if(n < 2) {
            return n;
        }
        return fiboR(n-1) + fiboR(n-2);
    }

    static int fibo(int n) {
        int i = 0;
        int first = 0;
        int second = 1;
        int sum = 0;
        while(i < n) {
            sum = first + second;
            first = second;
            second = sum;
            i++;
        }
        return sum;
    }

    static ArrayList<Integer> fiboInArray(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ans.add(first);
            sum = first + second;
            first = second;
            second = sum;
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if(start > end) {
            return -1;
        }
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] > target) {
            return binarySearch(arr, target, start, mid-1);
        }
        return binarySearch(arr, target, mid+1, end);
    }
}
