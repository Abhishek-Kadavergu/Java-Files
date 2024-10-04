package com.Recursion;

import java.util.ArrayList;

public class PadSubstring {
    public static void main(String[] args) {
//        pad("","1");
        System.out.println(padreturn("",""));
        System.out.println(padCount("", "12"));
    }
    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) *3; i <  digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> padreturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) *3; i <  digit * 3; i++) {
            char ch = (char) ('a' + i);

            list.addAll(padreturn(p+ch,up.substring(1)));
        }
        return list;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) *3; i <  digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }
}
