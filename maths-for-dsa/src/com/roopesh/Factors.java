package com.roopesh;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factor3(n);
    }

    // O(n)
    public static void factor1(int n) {
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0) {
                System.out.println(i);
            }
        }
    }

    // Time complexity: O(sqrt(n))
    public static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if((n % i) == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // Time complexity + Space complexity: O(sqrt(n))
    public static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if((n % i) == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
