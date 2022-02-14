package com.roopesh.array;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = findIndex(arr, 5, 0);
        System.out.println(ans);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length - 1) {
            return arr[index] == target ? index : -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index+1);
        // return arr[index] == target || findIndex(arr, target, index+1);
    }
}
