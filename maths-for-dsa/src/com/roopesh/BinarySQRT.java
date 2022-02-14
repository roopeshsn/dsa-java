package com.roopesh;

public class BinarySQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        double ans = findSqrt(n, p);
        System.out.println(ans);
    }

    public static double findSqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        double increment = 0.1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid * mid == n) {
                root = mid;
                break;
            }
            if(mid * mid > n) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        for (int i = 0; i < p; i++) {
            while(root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}
