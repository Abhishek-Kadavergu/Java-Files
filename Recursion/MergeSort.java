package com.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,3,1};
        int[] newarr = mergeSort(arr);
        System.out.println(Arrays.toString(newarr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr,0,middle);
        int[] rightHalf = Arrays.copyOfRange(arr, middle, arr.length);

        int[] sortedLeft = mergeSort(leftHalf);
        int[] sortedRight = mergeSort(rightHalf);

        return merge(sortedLeft,sortedRight);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length] ;
        int i = 0, j = 0, k =0;

        while(i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                result[k] = first[i];
                i++;
            }else {
                result[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }
        return result;
    }
}




