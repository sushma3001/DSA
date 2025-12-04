package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

import java.util.Arrays;

/**
 * Problem: Return all indices where the target appears in array
 * Input: int[] arr, int target
 * Output: int[] of index positions (empty array if none)
 * 
 * Step 1: Clarify the Problem
 * Given a list of elements so we need to find the occurences of target elements
 * and display its indices
 * 
 * Step 2: Input & Output
 * Input : int[] arr , int target
 * Output: indices of all occurences
 * 
 * Step 3: Constraints
 * Sorted : NO
 * Size: Small
 * Duplicates: Yes
 * 
 * Step 4: Edge Cases
 * 1. Normal Test case -> all indices of target occurence
 * 2. Normal Test case ->return new int[] {}
 * 3. Empty array ->return new int[] {}
 * 4. Null array -> return new int[] {}
 * 
 * 
 * Step 5: Core Logic
 * So first we need to find count of all occurences and late we need to create a
 * exact count of new array and using one more loop we need to insert it to all
 * repeted elements indices
 * 
 * Step 6: Technique + Why
 * Linear Search : because its unsorted and small and duplicate values
 * 
 * Step 7: Pseudocode
 * START
 * IF arr is null OR arr.length == 0 → return []
 * count = 0
 * FOR i from 0 to arr.length - 1
 * IF arr[i] == target → count++
 * END FOR
 * result = new int[count]
 * idx = 0
 * FOR i from 0 to arr.length - 1
 * IF arr[i] == target
 * result[idx] = i
 * idx++
 * END FOR
 * return result
 * END
 * Step 8: Time & Space Complexity
 * TC: O(n)
 * SC: O(n)
 * 
 */
public class FindAllOccurrences {
    public static int[] findAll(int[] arr, int target) {
        // Step 1: Edge Cases
        if (arr == null || arr.length == 0) {
            return new int[] {};
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // second loop to add that count of indices
        int idx = 0;
        int[] newArray = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                newArray[idx] = i;
                idx++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        // 1️ Normal Case - Multiple occurrences
        int[] arr1 = { 2, 5, 7, 5, 9 };
        int target = 5;
        System.out.println("Case 1: multiple hits: " + Arrays.toString(findAll(arr1, target)));

        // 2️. Target occurs only once
        int[] arr2 = { 4, 6, 9, 11 };
        System.out.println("Case 2 (single hit): " +
                Arrays.toString(findAll(arr2, 6))); // [1]

        // 3️ All elements same as target
        int[] arr3 = { 3, 3, 3, 3 };
        System.out.println("Case 3 (all same): " +
                Arrays.toString(findAll(arr3, 3))); // [0,1,2,3]

        // 4️ Target not found
        int[] arr4 = { 1, 2, 4, 6 };
        System.out.println("Case 4 (not found): " +
                Arrays.toString(findAll(arr4, 10))); // []

        // 5️ Empty array
        int[] arr5 = {};
        System.out.println("Case 5 (empty array): " +
                Arrays.toString(findAll(arr5, 5))); // []

        // 6️ Null array
        int[] arr6 = null;
        System.out.println("Case 6 (null array): " +
                Arrays.toString(findAll(arr6, 5))); // []

    }

}
