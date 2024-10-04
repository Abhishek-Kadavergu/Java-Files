package com.Recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int no) {
        if (no == 1) {
            return 1;
        }
        return no * (factorial(no - 1));
    }
}