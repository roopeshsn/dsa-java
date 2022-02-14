package com.roopesh.easy;

public class Nto1 {
    public static void main(String[] args) {
        printBoth(5); // 5 4 3 2 1
    }

    public static void printNto1(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
    }

    public static void print(int n) {
        if(n == 0) {
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

    public static void printBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n + " ");
        printBoth(n-1);
        System.out.println(n + " ");
    }
}
