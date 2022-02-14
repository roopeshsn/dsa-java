package com.roopesh.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> ans = subsequence("", "abc");
        System.out.println(ans);
       // List<List<Integer>> ans = new ArrayList<ArrayList<>>(2);
        // System.out.println(ans);
    }

    public static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // Representing the combinations in an array using recursion
    public static ArrayList<String> subsequence(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence(p+ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
