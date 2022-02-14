package com.roopesh.strings;

public class Stream {
    public static void main(String[] args) {
        String ans = skip("bacadh");
        System.out.println(ans);
    }

    public static void skip(String mutated, String original) {
        if(original.isEmpty()) {
            System.out.println(mutated);
            return;
        }
        char ch = original.charAt(0);
        if(ch == 'a') {
            skip(mutated, original.substring(1));
        } else {
            skip(mutated+ch, original.substring(1));
        }
    }

    public static String skip(String original) {
        if(original.isEmpty()) {
            return "";
        }
        char ch = original.charAt(0);
        if(ch == 'a') {
            return skip(original.substring(1));
        } else {
            return ch + skip(original.substring(1));
        }
    }
}
