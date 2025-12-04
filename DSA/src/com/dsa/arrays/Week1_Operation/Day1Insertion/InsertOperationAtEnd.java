package com.dsa.arrays.Week1_Operation.Day1Insertion;

import java.util.Arrays;

public class InsertOperationAtEnd {
    public static int insertAtEnd(int[] arr, int currentSize, int capacity, int element) {
        if (currentSize >= capacity) {
            System.out.println("\n Array is full");
            return -1;
        }

        arr[currentSize] = element;
        currentSize++;
        return currentSize;
    }

    public static void main(String[] args) {
        // TEST CASE 1: Normal Insert
        System.out.println("=== TEST CASE 1: Normal Insert ===");
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        int size1 = 3;

        System.out.println("Before: " + Arrays.toString(Arrays.copyOf(arr1, size1)));
        int newSize1 = insertAtEnd(arr1, size1, 5, 40);

        if (newSize1 != -1) {
            System.out.println("After: " + Arrays.toString(Arrays.copyOf(arr1, newSize1)));
            System.out.println("New size: " + newSize1);
        } else {
            System.out.println("Failed: Array is full!");
        }

        // TEST CASE 2: Array Full
        System.out.println("\n=== TEST CASE 2: Array Full ===");
        int[] arr2 = new int[3];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        int size2 = 3;

        System.out.println("Before: " + Arrays.toString(Arrays.copyOf(arr2, size2)));
        int newSize2 = insertAtEnd(arr2, size2, 3, 40);

        if (newSize2 != -1) {
            System.out.println("After: " + Arrays.toString(Arrays.copyOf(arr2, newSize2)));
        } else {
            System.out.println("Failed: Array is full!");
        }

        // TEST CASE 3: Empty Array
        System.out.println("\n=== TEST CASE 3: Empty Array ===");
        int[] arr3 = new int[3];
        int size3 = 0;

        System.out.println("Before: Empty array");
        int newSize3 = insertAtEnd(arr3, size3, 3, 100);

        if (newSize3 != -1) {
            System.out.println("After: " + Arrays.toString(Arrays.copyOf(arr3, newSize3)));
            System.out.println("New size: " + newSize3);
        } else {
            System.out.println("Failed: Array is full!");
        }

        // TEST CASE 4: Multiple Inserts
        System.out.println("\n=== TEST CASE 4: Multiple Inserts ===");
        int[] arr4 = new int[5];
        arr4[0] = 10;
        arr4[1] = 20;
        int size4 = 2;

        System.out.println("Initial array: " + Arrays.toString(Arrays.copyOf(arr4, size4)));
        System.out.println("Capacity: 5, Current size: " + size4);

        // Insert 3
        System.out.println("\nInserting 3...");
        size4 = insertAtEnd(arr4, size4, 5, 3);
        if (size4 != -1) {
            System.out.println("After insert: " + Arrays.toString(Arrays.copyOf(arr4, size4)));
        } else {
            System.out.println("Failed!");
        }

        // Insert 4
        System.out.println("\nInserting 4...");
        size4 = insertAtEnd(arr4, size4, 5, 4);
        if (size4 != -1) {
            System.out.println("After insert: " + Arrays.toString(Arrays.copyOf(arr4, size4)));
        } else {
            System.out.println("Failed!");
        }

        // Insert 5
        System.out.println("\nInserting 5...");
        size4 = insertAtEnd(arr4, size4, 5, 5);
        if (size4 != -1) {
            System.out.println("After insert: " + Arrays.toString(Arrays.copyOf(arr4, size4)));
            System.out.println("Array is now FULL!");
        } else {
            System.out.println("Failed!");
        }

        // Try to insert 6 (should fail)
        System.out.println("\nTrying to insert 6 (array is full)...");
        int result = insertAtEnd(arr4, size4, 5, 6);
        if (result != -1) {
            System.out.println("After insert: " + Arrays.toString(Arrays.copyOf(arr4, result)));
        } else {
            System.out.println("Failed: Array is full! ✓");
        }
    }

}
