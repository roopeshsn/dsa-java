package com.roopesh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {21, 3, 15, 23, 77, -1, 10, 99, -7};
//        int[][] arr2D = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int[] ans = searchIn2D(arr2D, 6);
//        System.out.println(Arrays.toString(ans));
        // mars exploration | Rover original data "SOSSOS"
        Scanner in = new Scanner(System.in);
        String receivedMsg = in.nextLine();
        int msgLength = receivedMsg.length();
        String msgPattern = "SOS";
        String originalMsg = "";

        for(int i = 0; i < msgLength; i = i+3){
            originalMsg += msgPattern;
        }

        char[] originalMsgToArray = originalMsg.toCharArray();
        char[] receivedMsgToArray = receivedMsg.toCharArray();
        int count = 0;

        for(int j = 0; j < msgLength; j++){
            if(originalMsgToArray.length != receivedMsgToArray.length){
                count = -1;
                break;
            }
            if(originalMsgToArray[j] != receivedMsgToArray[j]){
                count++;
            }
        }

        System.out.println(count);
    }

    // linear search algorithm
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int idx = 0; idx < arr.length; idx++){
            if(target == arr[idx]){
                return idx;
            }
        }
        return -1;
    }

    // linear search in 2d array
    static int[] searchIn2D(int[][] arr2D, int target){
        if(arr2D.length == 0){
            return new int[]{-1, -1};
        }
        for(int row = 0; row < arr2D.length; row++){
            for(int col = 0; col < arr2D[row].length; col++){
                if(arr2D[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
