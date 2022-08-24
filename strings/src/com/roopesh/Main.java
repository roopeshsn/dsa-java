package com.roopesh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String str = "abc";
        subseqAscii("", str);
    }

    public static void subseq1(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq1(ch+p, up.substring(1));
        subseq1(p, up.substring(1));
    }

    public static void subseqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(ch+p, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    }

    public static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char current = up.charAt(0);

        if(current == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p+current, up.substring(1));
        }
    }



    public static String skip1(String up) {
        if(up.isEmpty()) {
            return "";
        }

        char current = up.charAt(0);

        if(current == 'b') {
            return skip1(up.substring(1));
        } else {
            return current + skip1(up.substring(1));
        }
    }

    public static String skip3(String up) {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("apple")) {
            return skip1(up.substring(5));
        } else {
            return up.charAt(0) + skip3(up.substring(1));
        }
    }
}
