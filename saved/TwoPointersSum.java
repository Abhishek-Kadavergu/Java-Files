package com.saved;

public class TwoPointersSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetSum = 10;

        boolean found = findPairWithSum(arr, targetSum);
        if (found) {
            System.out.println("Pair with the given sum found!");
        } else {
            System.out.println("No pair with the given sum found.");
        }
    }

    public static boolean findPairWithSum(int[] arr, int targetSum) {
        int left = 0; // Pointer starting from the beginning
        int right = arr.length - 1; // Pointer starting from the end

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == targetSum) {
                System.out.println("Pair: (" + arr[left] + ", " + arr[right] + ")");
                return true;
            } else if (currentSum < targetSum) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }

        return false;
    }
}
