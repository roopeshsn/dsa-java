package com.roopesh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value that a loop should run = ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}






