package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

/**
 * Problem:Given an integer array, return the number of times a target value
 * appears in the array.
 * If the target does not exist, return 0.
 * 
 * Input: int[] arr: the array of integers
 * int target: the value to count
 * 
 * Output : int count: number of occurrences of target in the array
 * 
 * Step 1: Clarify the problem
 * - Count how many times the target value appears in the array and return that
 * count. If not found, return 0.
 * 
 * 
 * Step 2: Input & Output
 * - Input : int[] arr, int target
 * - Output: count of target element
 * 
 * Step 3: Constraints
 * - Sorted : No
 * - Size : small
 * - Duplicates : Yes
 * 
 * Step 4: Edge cases
 * - Null array → return 0
 * - Empty array → return 0
 * - Target not found → return 0
 * - Single element → 1 if match else 0
 * 
 * 
 * Step 5: Core Logic
 * - Traverse the array from index 0 to end. Each time arr[i] == target,
 * increment count. After loop ends, return count.
 * 
 * Step 6: Technique + Why
 * Linear Search : its unsorted and size very small
 * 
 * Step 7: Pseudocode
 * - START
 * - IF arr is null OR arr.length == 0
 * - RETURN 0
 * - END IF
 * - count = 0
 * - FOR i = 0 to arr.length - 1
 * - IF arr[i] == target
 * - count++
 * - END IF
 * - END FOR
 * - RETURN count
 * - END
 * 
 * 
 * 
 * Step 8: TC & SC
 * TC : O(n) in all cases because you need to search complete array)
 * SC : O(1) it stores only count
 * 
 */

public class CountOccurrences {
    public static int countOccurence(int[] arr, int target) {

        // Step 1: edge cases for null and empty
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Step 2: logic to count occurence and return
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("1. Normal Test case ");
        int[] testCase1 = { 2, 5, 7, 5, 9 };
        int target = 5;
        System.out.println(countOccurence(testCase1, target));
        System.out.println("----------------------------------------------------------");

        System.out.println("2. Absent Test case ");
        int[] testCase2 = { 2, 5, 7, 5, 9 };
        int target2 = 10;
        System.out.println(countOccurence(testCase2, target2));

        System.out.println("----------------------------------------------------------");

        System.out.println("3. Single count test case: ");
        int[] testCase3 = { 2, 5, 7, 4, 9 };
        int target3 = 5;
        System.out.println(countOccurence(testCase3, target3));

        System.out.println("----------------------------------------------------------");

        System.out.println("4. null test case: ");
        int[] testCase4 = null;
        int target4 = 5;
        System.out.println(countOccurence(testCase4, target4));

        System.out.println("----------------------------------------------------------");

        System.out.println("5. Empty test case: ");
        int[] testCase5 = {};
        int target5 = 5;
        System.out.println(countOccurence(testCase5, target5));

    }

}
