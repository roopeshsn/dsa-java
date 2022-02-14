package com.roopesh.easy;

public class CountSteps {
    public static void main(String[] args) {
        int ans = noOfSteps(14);
        System.out.println(ans);
    }

    static int noOfSteps(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int steps) {
        if(n == 0) {
            return steps;
        }

        if(n % 2 == 0) {
            return helper(n/2, steps+1);
        } else {
            return helper(n-1, steps+1);
        }
    }
}
