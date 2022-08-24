package com.roopesh;

public class NKnights {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = search(arr, 5);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
