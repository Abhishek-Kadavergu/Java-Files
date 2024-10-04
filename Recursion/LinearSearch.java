package com.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-13,-10,-8,-3,2,4,6,8};
        System.out.println(sorted(arr,0,-86));
    }
    static int sorted(int[] arr, int index,int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return sorted(arr, index+1, target);
    }
}
