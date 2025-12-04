package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

public class FindMinimumElement {
    public static int findMin(int[] arr) {

        // step 1:edge case
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(findMin(arr));

        // single element
        int[] arr1 = { 20 };
        System.out.println(findMin(arr1));

        // All elements same
        int[] arr2 = { 5, 5, 5, 5 };
        System.out.println(findMin(arr2));

        // All negative
        int[] arr3 = { -1, -5, -8, -19 };
        System.out.println(findMin(arr3));

        // empty array
        int[] arr4 = {};
        System.out.println(findMin(arr4));

        // null array
        int[] arr5 = null;
        System.out.println(findMin(arr5));

    }

}
