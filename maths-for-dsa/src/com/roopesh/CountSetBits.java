package com.roopesh;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 199;
        System.out.println(Integer.toBinaryString(4));
        int ans = setBits(n);
        System.out.println(ans);
    }

    private static int setBits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
