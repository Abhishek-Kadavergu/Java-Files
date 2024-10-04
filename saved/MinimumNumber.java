package com.saved;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10,23,26,12,3};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int minNo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNo) {
                minNo = arr[i];
            }
        }
        return minNo;
    }
}
