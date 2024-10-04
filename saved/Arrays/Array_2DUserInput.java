package com.saved.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2DUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("["+ i + " " + j + "] =");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        //printing using for loop

        for(int[] i : arr) {
            for ( int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}