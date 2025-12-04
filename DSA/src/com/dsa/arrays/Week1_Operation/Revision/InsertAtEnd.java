package com.dsa.arrays.Week1_Operation.Revision;

import java.util.Arrays;

public class InsertAtEnd {
    public static int insertAtEnding(int[] arr, int capacity, int currentSize, int element) {
        // step 1 : check wheather we have space or not
        if (currentSize >= capacity) {
            return -1;
        }

        // step 2 : insert element at first empty space
        arr[currentSize] = element;

        // step 3 : update currentSize after inserting it helps me to while inseting
        // next time
        currentSize++;

        // step 4 : return it after insertion it uses as output
        return currentSize;

    }

    public static void main(String[] args) {
        // Test case 1 : normal insertion
        // array to check normal insertion
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        int size1 = 3;
        int capacity1 = 5;

        System.out.println("Array before insertion: " + Arrays.toString(Arrays.copyOf(numbers, size1)));
        System.out.println("  Size: " + size1);

        int result1 = insertAtEnding(numbers, capacity1, size1, 40);

        if (result1 != -1) {
            System.out.println("Array after insertion: " + Arrays.toString(Arrays.copyOf(numbers, result1)));
            System.out.println("New size: " + result1);

        } else {
            System.out.println("Failed : array is full");
        }
        System.out.println("---------------------------------------------------------");

        // testcase 2 : Array Full
        int[] numbers1 = new int[3];
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        int size2 = 3;
        int capacity2 = 3;

        System.out.println("Array Before insertion : " + Arrays.toString(Arrays.copyOf(numbers1, size2)));
        System.out.println("Size: " + size2);

        int testCase2 = insertAtEnding(numbers1, capacity2, size2, 40);
        if (testCase2 != -1) {
            System.out.println("Array After insertion : " + Arrays.toString(Arrays.copyOf(numbers1, testCase2)));
        } else {
            System.out.println("Failed : array is full");

        }

        System.out.println("---------------------------------------------------------");

        // Test case 3 :Empty array
        int[] numbers2 = new int[3];

        int size3 = 0;
        int capacity3 = 3;

        System.out.println("Array Before insertion : " + Arrays.toString(Arrays.copyOf(numbers2, size3)));
        System.out.println("Size: " + size3);

        int testCase3 = insertAtEnding(numbers2, capacity3, size3, 40);
        if (testCase3 != -1) {
            System.out.println("Array After insertion : " + Arrays.toString(Arrays.copyOf(numbers2, testCase3)));
        } else {
            System.out.println("Failed : array is full");

        }

    }

}
