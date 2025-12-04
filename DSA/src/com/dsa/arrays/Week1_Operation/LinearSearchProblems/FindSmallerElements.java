package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

import java.util.Arrays;

/**
 * Problem :Given an integer array arr and a number target, return a new array
 * containing all elements that are strictly smaller than the target, in the
 * same order.
 * 
 * If no such elements exist, return an empty array.
 * 
 * Input : int[] arr → The list of integers
 * Output : int[] → Array containing all elements < target
 * (Return [] if none found)
 * 
 * Example :arr = [4, 2, 9, 1, 7]
 * target = 5
 * 
 * Output : [4, 2, 1]
 * 
 * 
 * 
 * int target → The value to compare with
 * Step 1: Clarify the Problem
 * Given a list of integer array and we need to find the numbers which are less
 * than target
 * …
 * 
 * Step 2: Input & Output
 * Input : int[] arr , int target
 * Output: int[] → array of all values < target
 * 
 * …
 * 
 * Step 3: Constraints
 * Sorted : No
 * Size : small
 * Duplicates: Yes (possible)
 * …
 * 
 * Step 4: Edge Cases
 * 1. Normal test case -> return all numbers less than target
 * 2. No elements less than target -> return new int[] {}
 * 3. Null array ->return new int[] {}
 * 4. Empty array -> return new int[] {}
 * 
 * 
 * …
 * 
 * Step 5: Core Logic
 * so here we have 2 for loop lets start from 1st for loop
 * 1. initialize variable called count and initialize =0 and start from left to
 * right means index 0 to end of the length and we need to compare element in
 * array is less than target if yes increase count.
 * 2. Use a second loop to copy only those elements that are < target.
 * now create a new array with the size of count and later add that all
 * elements to new array
 * 
 * …
 * 
 * Step 6: Technique + Why
 * Linear Search — array is unsorted and values must be checked one by one.
 * …
 * 
 * Step 7: Pseudocode
 * 
 * START
 * IF arr is null OR arr.length == 0 → return []
 * count = 0
 * FOR i from 0 to arr.length - 1
 * IF arr[i] < target → count++
 * END FOR
 * result = new int[count]
 * idx = 0
 * FOR i from 0 to arr.length - 1
 * IF arr[i] <= target
 * result[idx] = arr[i]
 * idx++
 * END FOR
 * return result
 * END
 * …
 * 
 * Step 8: Time & Space Complexity
 * …
 * TC : O(n)
 * SC : O(n)
 * 
 */

public class FindSmallerElements {
    public static int[] getSmaller(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return new int[] {};
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                count++;
            }
        }
        int idx = 0;
        int[] newArray = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                newArray[idx] = arr[i];
                idx++;

            }
        }
        return newArray;

    }

    public static void main(String[] args) {
        // 1. Normal test case:
        int[] arr = { 2, 5, 7, 5, 9 };
        int target = 7;
        System.out.println("case 1: " + Arrays.toString(getSmaller(arr, target)));

        // 2️⃣ Single Element (target match)
        int[] arr2 = { 5 };
        System.out.println("Case 2: " + Arrays.toString(getSmaller(arr2, 5)));

        // 3️⃣ Target at first position
        int[] arr3 = { 5, 10, 20 };
        System.out.println("Case 3: " + Arrays.toString(getSmaller(arr3, 5)));

        // 4️⃣ Target at last position
        int[] arr4 = { 10, 20, 5 };
        System.out.println("Case 4: " + Arrays.toString(getSmaller(arr4, 5)));

        // 5️⃣ Target not found
        int[] arr5 = { 1, 2, 3, 4 };
        System.out.println("Case 5: " + Arrays.toString(getSmaller(arr5, 10)));

        // 6️⃣ Empty array
        int[] arr6 = {};
        System.out.println("Case 6: " + Arrays.toString(getSmaller(arr6, 5)));

        // 7️⃣ Null array
        int[] arr7 = null;
        System.out.println("Case 7: " + Arrays.toString(getSmaller(arr7, 5)));

        // 8️⃣ All elements same
        int[] arr8 = { 5, 5, 5, 5 };
        System.out.println("Case 8: " + Arrays.toString(getSmaller(arr8, 5)));

        // 9️⃣ Negative + Positive
        int[] arr9 = { -3, -1, 0, 2, 5 };
        System.out.println("Case 9: " + Arrays.toString(getSmaller(arr9, 1)));

        // 🔟 Duplicates
        int[] arr10 = { 5, 3, 5, 7, 5 };
        System.out.println("Case 10: " + Arrays.toString(getSmaller(arr10, 5)));

        System.out.println("------------------------------------------");
    }

}
