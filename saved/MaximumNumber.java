package com.saved;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,45,34,64,23,18};
        int max = 0;
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
