package com.Recursion;

public class removingALetter {
    public static void main(String[] args) {
        removeing("","bacacd ");
        System.out.println(removing2("aacdbbzzaza"));

    }
    static void removeing(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            removeing(p, up.substring(1));
        }else {
            removeing(p + ch,up.substring(1));
        }
    }

    static String removing2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return removing2(up.substring(1));
        }
        else {
            return ch + removing2(up.substring(1));
        }
    }
}
