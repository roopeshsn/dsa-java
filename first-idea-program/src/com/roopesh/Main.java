package com.roopesh;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 15, 99, 31, 7, 21, 101};
        int maximum = max(arr);
        System.out.println(maximum);
    }
    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    static int max(int[] arr){
        int max = arr[0];
        int idx = 1;
        while(idx < arr.length){
            if(max < arr[idx]){
                max = arr[idx];
            }
            idx++;
        }
        return max;
    }
}
