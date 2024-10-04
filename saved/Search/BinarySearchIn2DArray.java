package com.saved.Search;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4,5},
                {6,8,9,11},
                {12,14,17,19},
                {20,22,24,30}
        };
        System.out.println(Arrays.toString(search(arr,24)));
    }
    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr[0].length - 1;

        while (r < arr[0].length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }
            if (arr[r][c] < target) {
                r++;
            }else {
                c--;
            }
        }return new int[] {-1,-1};
    }
}
