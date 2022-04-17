package com.roopesh;

public class Patterns {
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int row = n; row > 0; row--) {
//            for (int col = row; col > 0; col--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
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
        for (int row = 0; row < 2*n; row++) {
            int totalColsInrow = row > n ? 2*n - row: row;
            for (int col = 0; col < totalColsInrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfSpaces = n - row;
            for (int s = 1; s <= numberOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int numberOfSpaces = row-1;
            for (int s = 1; s <= numberOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int row = 0; row <= n; row++) {
//            int numberOfSpaces = row-1;
//
            int totalNumberOfCols;
            if(n-row == n || n-row == 1) {
                totalNumberOfCols = n-1;
            } else {
                totalNumberOfCols = n-row-1;
            }
            int numberOfSpaces;
            if(n-row == n || n-row == 1) {
                numberOfSpaces = 0;
            } else {
                numberOfSpaces = n-totalNumberOfCols;
            }
            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalNumberOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
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

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
