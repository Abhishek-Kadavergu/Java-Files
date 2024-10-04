package com.saved;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Fibonacci series: ");
        int n = in.nextInt();
        int first = 0, second = 1;



        for (int i=1; i<=n; i++){
            System.out.print(first + ",");
            int next = first  + second;
            first = second;
            second = next;
        }
        in.close();
    }
}
