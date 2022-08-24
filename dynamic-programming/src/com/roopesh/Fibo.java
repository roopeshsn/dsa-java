package com.roopesh;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibo {
    public static int fibo(int n) {
        int[] list = new int[100];
        int res = fiboHelper(n, list);
        System.out.println(Arrays.toString(list));
        return res;
    }

    public static int fiboHelper(int n, int[] list) {
        if(n < 2) {
            return n;
        }

        if(list[n] != 0) {
            return list[n];
        }

        int left = fiboHelper(n-1, list);
        int right = fiboHelper(n-2, list);
        int sum = left + right;
        list[n] = sum;
        return sum;
    }

    public static int fiboSimple(int n) {
        int temp = 0;
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
