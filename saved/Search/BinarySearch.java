package com.saved.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -9, 0, 1, 2, 4, 7, 9, 18, 22};
        int target = -12;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end ) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else
                end = mid - 1;
        }
        return -1;
    }
}
