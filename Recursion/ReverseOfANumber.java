package com.Recursion;

public class ReverseOfANumber {
    public static void main(String[] args) {
        System.out.println(reverse(115,0));
    }
    static int reverse(int no,int rev) {
        if (no == 0) {
            return rev;
        }
        rev = rev * 10 + (no % 10);
        return reverse(no / 10, rev);
    }
}