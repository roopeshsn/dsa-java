package com.roopesh;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd2(12, 30));
    }

    static int hcf(int num1, int num2) {
        int min = Math.min(num1, num2);
        while(min > 2) {
            if(num1 % min == 0 && num2 % min == 0) {
                return min;
            }
            min--;
        }
        return 0;
    }

    static int gcd2(int x, int y) {
        while(x != y) {
            if(x < y) {
                y = y-x;
            } else {
                x = x-y;
            }
        }
        return x;
    }
}
