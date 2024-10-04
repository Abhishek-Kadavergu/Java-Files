package com.Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {-13,-10,-8,-3,2,4,6};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index) {
        if (index == arr.length ) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return sorted(arr, index+1);
    }
}
