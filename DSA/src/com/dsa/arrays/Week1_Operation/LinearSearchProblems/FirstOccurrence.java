package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

/**
 * Problem : find first occurence of a target number in an array where duplicate
 * exists
 * 
 * Input : arr = [2 , 5 , 7 , 5 , 9]
 * Target :5
 * Output : 1
 * 
 * 
 * Step 1: Clarify the problem
 * Given an array of integers with duplicates, return the index of the first
 * occurrence of the target or -1 if not found.
 * 
 * 
 * Step 2: input and output
 * Input: int[] arr, int target
 * Output: int index (first matching position) or -1
 * 
 * Step 3: Constraints
 * Sorted : No
 * Size : small
 * Duplicates : YES
 * 
 * 
 * Step 4: Edge cases
 * 1️⃣ Empty array → return -1
 * 2️⃣ Null array → return -1
 * 3️⃣ Target not present → return -1
 * 4️⃣ Single element array → 0 if match else -1
 * 
 * Step 5: Core logic
 * Traverse the array from left to right.
 * When target is found, return that index immediately.
 * Stop without checking further elements.
 * 
 * Step 6 :Technique + why
 * Linear search ,array is unsorted and size is small
 * 
 * 
 * Step 7: PSEUODO CODE
 * START
 * 
 * IF arr is null OR length is 0
 * RETURN -1
 * ENDIF
 * 
 * FOR i = 0 to (length of array - 1)
 * IF arr[i] == target
 * RETURN i
 * ENDIF
 * ENDFOR
 * 
 * RETURN -1
 * 
 * END
 * 
 * TC : O(n) in worst case , O(1) in best case if u find first element , SC
 * :O(1) stores only 1 index variable
 * 
 * 
 */
public class FirstOccurrence {
    public static int firstOccurrence(int[] arr, int target) {
        // step 1 : edge cases
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // step 2: logic to find first occurence , when you find first occurence return
        // immedietly
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Normal Test case 1: ");
        int[] arr = { 2, 5, 7, 5, 9 };
        int target = 5;
        int result = firstOccurrence(arr, target);
        System.out.println("First occurence of " + target + " is in " + result);

        System.out.println("-----------------------------------------------------");
        System.out.println("Normal Test case 2: ");
        int[] arr1 = { 5, 5, 5, 5 };
        int target1 = 5;
        int result1 = firstOccurrence(arr1, target1);
        System.out.println("First occurence of " + target1 + " is in " + result1);

        System.out.println("-----------------------------------------------------");
        System.out.println("Normal Test case 3: ");
        int[] arr2 = { 1, 2, 3, 4 };
        int target2 = 3;
        int result2 = firstOccurrence(arr2, target2);
        System.out.println("First occurence of " + target2 + " is in " + result2);

        System.out.println("-----------------------------------------------------");
        System.out.println("Normal Test case 4: ");
        int[] arr3 = {};
        int target3 = 3;
        int result3 = firstOccurrence(arr3, target3);
        System.out.println("First occurence of " + target3 + " is in " + result3);

        System.out.println("-----------------------------------------------------");
        System.out.println("Normal Test case 5: ");
        int[] arr4 = { 1, 2, 3, 4 };
        int target4 = 9;
        int result4 = firstOccurrence(arr4, target4);
        System.out.println("First occurence of " + target4 + " is in " + result4);

    }
}
