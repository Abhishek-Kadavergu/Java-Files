package com.saved.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args) {

        //1 for given input
        System.out.println("First method...");
        int arr [] = {1,33,23,522,18};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //2 taking input from the user
        System.out.println("Second method...");
        System.out.println("//give 5 input numbers");
        int [] sums = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < sums.length; i++) {
            sums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(sums));

        //3 taking input from random
        System.out.println("Third method...");
        int [] no = new int[10];
        for (int i = 0; i < no.length; i++) {
            int randomNumber = (int) (Math.random() * 50);
            no [i] = randomNumber;
        }
        for (int i : no) {
            System.out.print(i + " ");
        }

    }
}
