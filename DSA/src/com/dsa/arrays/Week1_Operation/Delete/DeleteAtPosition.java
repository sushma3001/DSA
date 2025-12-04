package com.dsa.arrays.Week1_Operation.Delete;

import java.util.Arrays;

/**
 * So here problem is to insert at position
 * here we need variables as array , position , current size
 */
public class DeleteAtPosition {
    public static int deleteAtPosition(int[] arr, int currentSize, int position) {
        // Step 1 : check array is null or valid position
        if (currentSize <= 0) {
            return -1;
        }

        if (position < 0 || position >= currentSize) {
            return -1;
        }

        // step 2 : logic to traverse loop
        for (int i = position; i < currentSize - 1; i++) {
            // step 3 : logic to shift elements
            arr[i] = arr[i + 1];

        }

        // step 4: update currentSize
        currentSize--;
        // step 5 : return currentSize
        return currentSize;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1: delete from specific position");
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        int currentSize3 = 4;
        int position = 3;

        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr, currentSize3)));
        System.out.println("Array size before deletion: " + currentSize3);

        int result = deleteAtPosition(arr, currentSize3, position);
        if (result != -1) {
            System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, result)));
            System.out.println("Array size after deletion: " + result);
        } else {
            System.out.println("Array is empty or invalid");
        }
        System.out.println("-------------------------------------------------------");
        // Test case 2:
        System.out.println("Delete at Beginning");
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        int currentSize4 = 4;
        int position1 = 0;
        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr1, currentSize4)));
        System.out.println("Array size before deletion: " + currentSize4);

        int result1 = deleteAtPosition(arr1, currentSize4, position1);
        if (result1 != -1) {
            System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr1, result1)));
            System.out.println("Array size after deletion: " + result1);
        } else {
            System.out.println("Array is empty or invalid");
        }

        System.out.println("-------------------------------------------------------");

        // Test case 3:
        System.out.println("Delete at End");
        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        int currentSize1 = 4;
        int position2 = currentSize1 - 1;
        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr2, currentSize1)));
        System.out.println("Array size before deletion: " + currentSize1);

        int result2 = deleteAtPosition(arr2, currentSize1, position2);
        if (result2 != -1) {
            System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr2, result2)));
            System.out.println("Array size after deletion: " + result2);
        } else {
            System.out.println("Array is empty or invalid");
        }
        System.out.println("-------------------------------------------------------");

        // Test case 4:
        System.out.println("Delete Invalid Position: ");
        int[] arr3 = new int[5];
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;
        int currentSize5 = 4;
        int position3 = 6;
        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr3, currentSize5)));
        System.out.println("Array size before deletion: " + currentSize5);

        int result3 = deleteAtPosition(arr3, currentSize5, position3);
        if (result3 != -1) {
            System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr3, result3)));
            System.out.println("Array size after deletion: " + result3);
        } else {
            System.out.println("Array is empty or invalid");
        }

    }

}
