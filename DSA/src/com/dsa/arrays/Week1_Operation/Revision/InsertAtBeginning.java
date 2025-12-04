package com.dsa.arrays.Week1_Operation.Revision;

import java.util.Arrays;

public class InsertAtBeginning {
    public static int insertAtBeginning(int[] arr, int capacity, int currentSize, int element) {
        // step 1 : check space in array
        if (currentSize >= capacity) {
            return -1;
        }

        // step 2 : shift elements fro end to until index 0
        // loop to shift elements
        for (int i = currentSize - 1; i >= 0; i--) {

            // step 3 : logic to shift elements
            arr[i + 1] = arr[i];

        }
        // step 4 : insert element at index 0
        arr[0] = element;
        // step 5 : increase current size
        currentSize++;

        // step 6 : return currentsixe after inserting
        return currentSize;
    }

    public static void main(String[] args) {
        // TestCase 1 : normal insert
        System.out.println(" Test case : 1 Normal Test");
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        int capacity1 = 5;
        int size1 = 3;
        int element1 = 5;

        System.out.println("Before: " + Arrays.toString(Arrays.copyOf(arr1, size1)));
        System.out.println("Size : " + size1);

        int result1 = insertAtBeginning(arr1, capacity1, size1, element1);
        if (result1 != -1) {
            System.out.println("After: " + Arrays.toString(Arrays.copyOf(arr1, result1)));
            System.out.println("New size: " + result1); // ← ADD THIS LINE!

        } else {
            System.out.println("Failed");
        }
        System.out.println("----------------------------------------------");
        // Test case : 2 : array full
        System.out.println("array is full : ");

        int[] arr2 = new int[3];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        int capacity2 = 3;
        int size2 = 3;
        int element2 = 5;

        System.out.println("Before : " + Arrays.toString(Arrays.copyOf(arr2, size2)));
        System.out.println("Size 2 : " + size2);

        int result2 = insertAtBeginning(arr2, capacity2, size2, element2);
        if (result2 != -1) {
            System.out.println("After : " + Arrays.toString(Arrays.copyOf(arr2, result2)));
            System.out.println("New size: " + result2);
        } else {
            System.out.println("Failed : Array is full!");
        }
        System.out.println("----------------------------------------------");

        // Test case : 3 -- single element array
        System.out.println("Test case: 3 - single element array");
        int[] arr3 = new int[3];
        arr3[0] = 10;
        int capacity3 = 3;
        int size3 = 1;
        int element3 = 40;

        System.out.println("Before: " + Arrays.toString(Arrays.copyOf(arr3, size3)));
        System.out.println("Size: " + size3);

        int result3 = insertAtBeginning(arr3, capacity3, size3, element3);
        if (result3 != -1) {
            System.out.println("After: " + Arrays.toString(Arrays.copyOf(arr3, result3)));
            System.out.println("New Size: " + result3);
        } else {
            System.out.println("Failed: Array is full!");

        }

    }
}
