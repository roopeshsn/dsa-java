package com.roopesh;

public class Patterns {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5Alt(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
            if(row == n) {
                for (int row2 = 1; row2 < n; row2++) {
                    for (int col2 = 1; col2 < n-row2+1; col2++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInrow = row > n ? 2*n - row : row;
            for (int col = 1; col <= totalColsInrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
