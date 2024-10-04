package com.rowan;

import java.util.*;

public class Write {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4,28,-23,-2,3,6,74,4,7,4,3,36,6,335,3,3,3,};
        quicksort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while(arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(arr,low,end);
        quicksort(arr,start,high);
    }
}
