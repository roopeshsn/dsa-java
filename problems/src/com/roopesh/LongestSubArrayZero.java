package com.roopesh;

import java.util.HashMap;

public class LongestSubArrayZero {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int result = findZero(arr);
        System.out.println(result);
    }

    private static int findZero(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                if(maxLength < i) {
                    maxLength = i+1;
                }
            } else if (map.containsKey(sum)){
                if(maxLength < (i - map.get(sum))) {
                    maxLength = i - map.get(sum);
                }
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(map);
        return maxLength;
    }
}
