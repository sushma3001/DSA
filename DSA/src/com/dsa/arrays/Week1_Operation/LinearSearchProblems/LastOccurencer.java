package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

/**
 * Problem : find last occurence of a target number in an array where duplicate
 * exists
 * 
 * Input : [2, 5, 7 , 5 , 9]
 * Target :5
 * Output :3
 * 
 * Step 1: Given an integer array that may contain duplicates, return the index
 * of the last occurrence of a target element or -1 if not found.
 * 
 * Step 2: Input and Output
 * input : int[] arr , int target
 * Output: index of last occurence of target element
 * 
 * Step 3:Contraints
 * Sorted : no
 * size : small
 * duplicates : YES
 * 
 * Step 4: Edge case
 * Empty array return -> -1
 * Null array return -> -1
 * Target not found -> return -1
 * Single value array -> return 0 if found else -1
 * 
 * Step 5: Core logic
 * start from right to left and when u find first target number return
 * immedietly its index
 * if not return -1 if not found
 * 
 * Step 6: Technique and why
 * Linear search : its unsorted array and its very small
 * 
 * Step 7: PSEUODO CODE
 * START
 * FOR int i=arr.length -1 to 0
 * if(arr[i] == target)
 * return i
 * END IF
 * END FOR
 * return -1;
 * 
 * Step 8: Algorithm
 * step 1: edge cases: if(arr == null) or if(arr.length -1 = 0) return -1
 * Step 2: for(int i = arr.length; i=0;i--)
 * Step 3: if(arr[i] == target) return i;
 * Step 4: if not return -1;
 * 
 * 
 * Step 9: TC and SC
 * TC: O(n) in worst case if foud last or mid
 * O(1) in best case if you find first
 * 
 * SC : O(1 ) stores only one index of a target found
 * 
 * 
 * 
 * 
 */
public class LastOccurencer {
    public static int lastOccurence(int[] arr, int target) {
        // step 1 : Edge case:
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Step 2: main logic to find last occurence
        // start from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // step 3: compare each element with target
            if (arr[i] == target) {
                // step 4: return immedietly becouse it is last occurence
                return i;

            }

        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println("1. Normal Test case: ");
        int[] arr = { 2, 5, 7, 5, 9 };
        int target = 5;

        int result = lastOccurence(arr, target);
        System.out.println("Last occurence of " + target + " index is: " + result);

        System.out.println("------------------------------------------------");

        System.out.println("2. All same numbers: ");
        int[] arr1 = { 5, 5, 5, 5 };
        int target1 = 5;

        int result1 = lastOccurence(arr1, target1);
        System.out.println("Last occurence of " + target1 + " index is: " + result1);

        System.out.println("------------------------------------------------");

        System.out.println("3. Third Test case: ");
        int[] arr2 = { 1, 2, 3, 4 };
        int target2 = 3;

        int result2 = lastOccurence(arr2, target2);
        System.out.println("Last occurence of " + target2 + " index is: " + result2);

        System.out.println("------------------------------------------------");

        System.out.println("4. Empty  array:  ");
        int[] arr3 = {};
        int target3 = 3;

        int result3 = lastOccurence(arr3, target3);
        System.out.println("Last occurence of " + target3 + " index is: " + result3);

        System.out.println("------------------------------------------------");

        System.out.println("3. Third Test case: ");
        int[] arr4 = { 1, 2, 3 };
        int target4 = 9;

        int result4 = lastOccurence(arr4, target4);
        System.out.println("Last occurence of " + target4 + " index is: " + result4);

        System.out.println("------------------------------------------------");

    }

}
