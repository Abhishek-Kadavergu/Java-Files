package com.Recursion;

public class ProductOfTheDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(235));

    }
    static int sumOfDigits(int no) {
        if ( no == 0) {
            return 1;
        }

        return (no % 10) * sumOfDigits(no / 10);
    }
}
