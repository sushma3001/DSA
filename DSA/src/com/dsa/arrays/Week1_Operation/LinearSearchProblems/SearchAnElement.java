package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

import java.util.Arrays;

/**
 * Problem : Find Index Of target element
 * 
 * Example:Input: arr = [1, 3, 6, 8, 10], target = 6 → Output: 2
 * 
 * Step 0: clarify problem:
 * given an list of elements as array and i want to find index of target element
 * in an array and return it , if not return -1
 * 
 * Step 1:Input and Output
 * Input : an array of elements and target
 * Output : index of a target element or return -1 if not found
 * 
 * Step 2: Constraints
 * Is array sorted : Yes
 * Size of an array is : Small
 * 
 * 
 * Step 3: Edge cases ->
 * 1. empty array - return -1
 * 2. Target not present -> return -1
 * 3. Single element array -> return index 0 if match
 * 
 * Step 4:Core Logic
 * - start from index 0 check each element one by one until you find a target
 * means until end of an array
 * - compare each element with target element
 * - if match found return index
 * - if match not found return -1
 * 
 * 
 * Step 5:Technique and y
 * Technique : Linear Search
 * Reason :Array is small, sequential searching is enough
 * 
 * 
 * Step 4 : PSEUDOCODE
 * START
 * FOR int i=0 to arr.length - 1
 * if arr[i] == target
 * RETRUN i;
 * END IF
 * END FOR
 * RETURN -1;
 * END
 * 
 * Step 5 : TC and SC
 * Best case: O(1) - found at first place
 * Worst case: O(n) - found at last or not found
 * Average case: O(n) - found at middle
 * Space complexity: O(1) no extra space stores only one index
 * 
 */
public class SearchAnElement {
    public static int linearSearch(int[] arr, int target) {
        // step 1: check for null array
        if (arr == null) {
            return -1;

        }
        // step 2: check for empty array
        if (arr.length == 0) {
            return -1;
        }
        // Step 3: logic for finding index of an target element
        // Logic to traverse each and every element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Normal test case: ");
        int[] arr = { 1, 3, 6, 8, 10 };
        int target = 6;
        System.out.println("Array is: " + Arrays.toString(arr));
        int targetIndex = linearSearch(arr, target);
        System.out.println("Target index of " + target + " is " + targetIndex);

        System.out.println("------------------------------------------------");
        System.out.println("Duplicate handling: ");
        int[] arr1 = { 1, 3, 6, 6, 8 };
        int target1 = 6;
        System.out.println("Array is: " + Arrays.toString(arr1));
        int targetIndex1 = linearSearch(arr1, target1);
        System.out.println("Target index of " + target1 + " is " + targetIndex1);
        System.out.println("-------------------------------------------------");

        System.out.println("Negative values: ");
        int[] arr2 = { -4, -1, 0, 5 };
        int target2 = -1;
        System.out.println("Array is: " + Arrays.toString(arr2));
        int targetIndex2 = linearSearch(arr2, target2);
        System.out.println("Target index of " + target2 + " is " + targetIndex2);

    }

}
