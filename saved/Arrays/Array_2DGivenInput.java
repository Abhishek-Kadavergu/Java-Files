package com.saved.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2DGivenInput {
    public static void main(String[] args) {
        //printing the array
        int [][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("printing using enhanced for loop...");
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
    }

    public static class Array_2DRandomInput {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the no of rows: ");
            int rows = in.nextInt();
            System.out.print("Enter the no of columns: ");
            int columns = in.nextInt();
            int[][] arr = new int[rows][columns];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    //System.out.print("["+ i + " " + j + "] =");
                    arr[i][j] = (int) (Math.random()*50);
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
}
