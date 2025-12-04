package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

import java.util.Arrays;

public class SearchExists {
    public static boolean exists(int[] arr, int target) {
        // 1. Edge case:
        if (arr == null || arr.length == 0) {
            return false;
        }
        // 2. logic to traverse each element andreturn true if found else false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: Present at start");
        int[] arr1 = { 10, 20, 30, 40, 50 };
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println(exists(arr1, 10)); // true

        System.out.println("Test 2: Present at end");
        System.out.println(exists(arr1, 50)); // true

        System.out.println("Test 3: Not present");
        System.out.println(exists(arr1, 90)); // false

        System.out.println("Test 4: Empty array");
        int[] arr2 = {};
        System.out.println(exists(arr2, 20)); // false

        System.out.println("Test 5: Null array");
        System.out.println(exists(null, 20)); // false
    }
}
