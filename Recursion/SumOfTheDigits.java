package com.Recursion;

public class SumOfTheDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(181555));

    }
    static int sumOfDigits(int no) {
        if ( no == 0) {
            return 0;
        }

        return (no % 10) + sumOfDigits(no / 10);
    }
}
