package com.roopesh.easy;

public class Digits {
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n) {
        if(n <= 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }
}
