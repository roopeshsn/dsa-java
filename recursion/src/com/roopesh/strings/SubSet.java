package com.roopesh.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetWithDuplicates(arr);
        System.out.println(ans);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for(int num: arr) {
//            List<Integer> internal = new ArrayList<>(0);
//            internal.add(num);
//            outer.add(internal);
//        }
//        System.out.println(outer);
//        List<Integer> internal1 = new ArrayList<>(5);
//        System.out.println(internal1);
    }

    static List<List<Integer>> subsetWithDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
