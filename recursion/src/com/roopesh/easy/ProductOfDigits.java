package com.roopesh.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 55;
        int ans = product(n);
        System.out.println(ans); // 24
    }

    public static int product(int n) {
        if(n <= 0) { // (n % 10 == n) return n
            return 1;
        }
        return product(n / 10) * (n % 10);
    }
}
