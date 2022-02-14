package com.roopesh;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        int[] count = {0, 0};
        sieve(n, primes, count);
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println(Arrays.toString(count));
    }

    public static void sieve(int n, boolean[] primes, int[] count) {
        for (int i = 2; i * i <= n; i++) {
            count[0]++;
            if(!primes[i]) {
                count[1]++;
                for (int j = i * 2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
    }
}
