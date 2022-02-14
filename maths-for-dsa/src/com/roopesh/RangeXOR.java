package com.roopesh;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        int ans = xor(a, b);
        System.out.println(ans);
    }

    public static int xor(int a, int b){
        if((b % 4) == 0) {
            return b;
        }
        if((b % 4) == 1) {
            return 1;
        }
        if((b % 4) == 2) {
            return b + 1;
        }
        return 0;
    }
}
