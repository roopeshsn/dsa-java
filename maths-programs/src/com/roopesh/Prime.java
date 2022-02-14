package com.roopesh;

import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        primeRange(1, 10);
    }

    static void primeRange(int from, int to) {
        ArrayList <Integer> prime = new ArrayList<>();
        ArrayList <Integer> nonPrime = new ArrayList<>();

        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= i; j++) {
                if(i%j == 0) {
                    nonPrime.add(i);
                } else {
                    prime.add(i);
                }
            }
        }
    }
}
