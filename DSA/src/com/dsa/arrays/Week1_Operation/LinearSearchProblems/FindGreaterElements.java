package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

import java.util.Arrays;

public class FindGreaterElements {
    public static int[] getBigger(int[] arr, int target) {
        // edge case: if array is empty and null
        if (arr == null || arr.length == 0) {
            return new int[] {};

        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }
        int idx = 0;
        int[] result = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] testArrays = {
                { 4, 7, 1, 10, 3 },
                { 8, 9, 12 },
                { 1, 2, 3 },
                { 9 },
                { 3 },
                { 5, 9, 5, 11, 5 },
                { -2, 0, 6, -5, 10 },
                {},
                null
        };

        int[] targets = { 5, 5, 5, 5, 5, 5, 1, 5, 5 };
        int[][] expectedOut = {
                { 7, 10 },
                { 8, 9, 12 },
                {},
                { 9 },
                {},
                { 9, 11 },
                { 6, 10 },
                {},
                {}
        };

        System.out.println("------------------ TEST CASES ------------------");

        for (int i = 0; i < testArrays.length; i++) {

            System.out.println("Test Case " + (i + 1) + ":");
            System.out.println("Input Array      : " + Arrays.toString(testArrays[i]));
            System.out.println("Target Value     : " + targets[i]);

            int[] output = getBigger(testArrays[i], targets[i]);
            System.out.println("Output Array     : " + Arrays.toString(output));
            System.out.println("Expected Output  : " + Arrays.toString(expectedOut[i]));

            boolean isPass = Arrays.equals(output, expectedOut[i]);
            System.out.println("Test Result      : " + (isPass ? "PASS ✔" : "FAIL ❌"));
            System.out.println("------------------------------------------------");
        }
    }

}
