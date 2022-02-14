package com.roopesh.easy;

public class ReverseANumber {
    public static void main(String[] args) {
        int ans = reverse(1532);
        System.out.println(ans);
    }

    public static int reverse(int n) {
        int digits = countDigit(n);
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, digits-1) + helper(n / 10, digits-1);
    }

    public static int countDigit(int n) {
        if(n <= 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }
}
