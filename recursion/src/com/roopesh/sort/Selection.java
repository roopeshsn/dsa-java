//package com.roopesh.sort;
//
//public class Selection {
//    public static void main(String[] args) {
//        int[] arr = {3, 2, 4, 1};
//        selection(arr, arr.length, 0, 0);
//    }
//
//    public static void selection(int[] arr, int e, int s, int m) {
//        if(e == 0) {
//            return;
//        }
//
//        if(s < e) {
//            if(arr[s] > arr[s+1]) {
//                selection(arr, e, s, s);
//            }
//            selection(arr, e, s+1);
//        } else {
//            selection(arr, e-1, 0);
//        }
//    }
//
//    public static int findMin(int[] arr, int start, int end) {
//        int min = arr[start];
//        int idx = 0;
//        for (int i = start; i < end; i++) {
//            if(arr[i] < min) {
//                min = arr[i];
//                idx = i;
//            }
//        }
//        return idx;
//    }
//}
