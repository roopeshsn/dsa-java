package com.roopesh;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 6;
        int base = 2;
        int ans = (int) (Math.log(6) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}
