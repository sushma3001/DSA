package com.dsa.arrays.Week1_Operation.LinearSearchProblems;

// Step 1: Clarify the problem

// Check if target exists between start and end indices (inclusive). Return true if found, else false.

// Step 2: Input & Output
// Input: int[] arr, int target, int start, int end
// Output: boolean → true if found, false otherwise

// Step 3: Constraints
// - Array can be sorted or unsorted
// - Duplicates can exist
// - Indices must be valid within array bounds

// Step 4: Edge Cases
// - Null array → return false
// - Empty array → return false
// - Invalid range (start < 0 or end >= arr.length or start > end) → return false

// Step 5: Core Logic
// Loop from start to end (inclusive). If arr[i] == target at any position, return true. If loop ends, return false.

// Step 6: Technique + Why
// Linear Search → small unsorted array, scanning specific portion

// Step 7: Pseudocode
// START
// IF arr is null OR length == 0 → return false
// IF start < 0 OR end >= arr.length OR start > end → return false
// FOR i = start to end
//     IF arr[i] == target
//         return true
// END FOR
// return false
// END

// Step 8: Time & Space Complexity
// Time Complexity: O(n) → worst case full range scan
// Space Complexity: O(1) → no extra space used

public class SearchInRange {
    public static boolean existsInRange(int[] arr, int target, int start, int end) {
        // edge case:
        if (arr == null || arr.length == 0) {
            return false;
        }
        if (start < 0 || end >= arr.length || start > end) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 7, 5, 9 };

        System.out.println("\n--------- PROFESSIONAL TEST CASES ---------");

        test(arr, 5, 1, 3); // true -> found in range
        test(arr, 2, 1, 4); // false -> exists but outside range
        test(arr, 9, 4, 4); // true -> exact last index
        test(arr, 7, 3, 1); // false -> invalid range
        test(arr, 5, -1, 2); // false -> start < 0
        test(arr, 5, 0, 10); // false -> end > array bound
        test(new int[] {}, 5, 0, 0); // false -> empty array
        test(null, 5, 0, 1); // false -> null array
    }

    private static void test(int[] arr, int target, int start, int end) {
        System.out.println(
                "Input: arr = " + java.util.Arrays.toString(arr) +
                        ", target = " + target +
                        ", range = [" + start + ", " + end + "]" +
                        " → Output: " + existsInRange(arr, target, start, end));
    }

}
