package com.roopesh;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check whether it's a Armstrong number or not = ");
        int num = input.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
    }

    static boolean isArmstrong(int num) {
        int original = num;
        if(num < 1){
            return false;
        }
        if(num <= 9){
            return true;
        }
        int count = getCount(num);
        int rem = 0;
        int sum = 0;
        int power = 0;
        while(num > 0){
            rem = num % 10;
            power = (int) Math.pow(rem, count);
            sum += power;
            num = num / 10;
        }
        return original == sum;
    }

    static int getCount(int num) {
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
