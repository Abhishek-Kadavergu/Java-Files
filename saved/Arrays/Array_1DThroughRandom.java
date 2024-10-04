package com.saved.Arrays;

import java.util.Scanner;

public class Array_1DThroughRandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of elemets: ");
        int noOf = in.nextInt();
        int[] arr = new int[noOf];
                for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 50);
            arr[i] = rand;
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
