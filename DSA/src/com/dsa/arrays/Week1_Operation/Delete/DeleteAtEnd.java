package com.dsa.arrays.Week1_Operation.Delete;

import java.util.Arrays;

public class DeleteAtEnd {
    public static int deleteAtEnd(int[] arr, int currentSize) {
        if (currentSize <= 0) {
            return -1;
        }
        currentSize--;
        return currentSize;
    }

    public static void main(String[] args) {
        // Test case:1 - normal delete
        System.out.println("Test case 1 : Normal test case ");
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        int currentSize = 3;

        System.out.println("Array before deletion" + Arrays.toString(Arrays.copyOf(arr1, currentSize)));
        System.out.println("Current Size : " + currentSize);

        int result = deleteAtEnd(arr1, currentSize);
        if (result != -1) {
            System.out.println("Array after deletion " + Arrays.toString(Arrays.copyOf(arr1, result)));
            System.out.println("Current Size : " + result);
        } else {
            System.out.println("Failed to delete : Array is empty ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

        // Test case : 2 - single element array

        System.out.println("Test case : 2 - single element array ");

        int[] arr2 = new int[3];
        arr2[0] = 10;
        int currentSize1 = 1;

        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr2, currentSize1)));
        System.out.println("Array size before insertion: " + currentSize1);

        int result1 = deleteAtEnd(arr2, currentSize1);

        if (result1 != -1) {
            System.out.println("Array after deletion: " +
                    Arrays.toString(Arrays.copyOf(arr2, result1)));
            System.out.println("Array size after deletion: " + result1);
        } else {
            System.out.println("Array size is null");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        // Test case 3:empty array
        System.out.println("Test case : 3 - empty array");
        int[] arr3 = new int[3];
        int currentSize2 = 0;

        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr3, currentSize2)));
        System.out.println("Array size before insertion: " + currentSize2);

        int result2 = deleteAtEnd(arr3, currentSize2);

        if (result2 != -1) {
            System.out.println("Array after deletion: " +
                    Arrays.toString(Arrays.copyOf(arr3, result2)));
            System.out.println("Array size after deletion: " + result2);
        } else {
            System.out.println("Array size is null");
        }

    }
}
