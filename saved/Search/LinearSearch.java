package com.saved.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,34,62, 18, 12};
        int target = 34;
        int result = linearsearch(arr,target);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        }
        else {
            System.out.println("Item not found in the array...");
        }
    }

    static int linearsearch(int[]arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
