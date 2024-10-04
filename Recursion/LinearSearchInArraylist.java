package com.Recursion;

import java.util.ArrayList;

public class LinearSearchInArraylist {
    public static void main(String[] a) {
        int[] arr = {1,2,3,3,9,29};
        System.out.println(findnumbers(arr,3,0,new ArrayList<>()));

    }
    static ArrayList<Integer> findnumbers (int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        return findnumbers(arr,target,index+1,list);
    }
}
