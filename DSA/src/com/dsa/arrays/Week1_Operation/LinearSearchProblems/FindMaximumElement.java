package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

public class FindMaximumElement {
    public static int findMax(int[] arr) {
        // edge case :
        if (arr == null || arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // 1️⃣ Normal Case
        int[] arr1 = { 10, 20, 30, 40, 50 };
        System.out.println("Max: " + findMax(arr1)); // 50

        // 2️⃣ Single Element
        int[] arr2 = { 20 };
        System.out.println("Max: " + findMax(arr2)); // 20

        // 3️⃣ All Elements Same
        int[] arr3 = { 7, 7, 7, 7 };
        System.out.println("Max: " + findMax(arr3)); // 7

        // 4️⃣ All Negative Numbers
        int[] arr4 = { -1, -5, -8, -19 };
        System.out.println("Max: " + findMax(arr4)); // -1

        // 5️⃣ Max at Start
        int[] arr5 = { 99, 10, 20, 30 };
        System.out.println("Max: " + findMax(arr5)); // 99

        // 6️⃣ Empty Array
        int[] arr6 = {};
        System.out.println("Max: " + findMax(arr6)); // Integer.MAX_VALUE

        // 7️⃣ Null Array
        int[] arr7 = null;
        System.out.println("Max: " + findMax(arr7)); // Integer.MAX_VALUE
    }

}
