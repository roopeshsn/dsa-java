package com.roopesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> demo = new ArrayList<>();
        demo.add(0);
        outer.add(demo);
//        List<List<Integer>> ans = subset(arr);
        List<Integer> internal = new ArrayList<>(outer.get(0));
        System.out.println(internal);
        System.out.println(outer.get(0));
        internal.add(1);
        outer.add(internal);
        for (List<Integer> list : outer) {
            System.out.println(list);
        }
    }

//    static List<List<Integer>> subset(int[] arr) {
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for (int num : arr) {
//            int n = outer.size();
//            for (int i = 0; i < n; i++) {
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(num);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }
}