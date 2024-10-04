package com.saved;

import java.util.Arrays;

public class ReverseOfAnArray {
    public static void main(String[] args) {
        int [] arr = {2,4,18,12,22};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            swap(arr,first,last);
            first++;
            last--;
        }
    }

    static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
