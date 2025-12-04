package com.dsa.arrays.Week1_Operation.Revision;

import java.util.Arrays;

public class InsertAtPosition {
    public static int insertAtPosition(int[] arr, int capacity, int currentSize, int position, int element) {
        // step 1 : check do we have space or not and position is valid or not
        if (currentSize >= capacity) {
            return -1;
        }

        if (position < 0 || position > currentSize) {
            return -1;
        }

        // step 2 : shift elements right backwar
        for (int i = currentSize - 1; i >= position; i--) {

            arr[i + 1] = arr[i];
        }
        // step 3 : inset at position
        arr[position] = element;

        // step 4 : increase current size
        currentSize++;

        // return current index as output
        return currentSize;
    }

    public static void main(String[] args) {
        // Test case 1: normal insert at specific position
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        int capacity1 = 5;
        int size1 = 4;
        int position1 = 2;
        int element = 45;

        System.out.println("Before: " + Arrays.toString(Arrays.copyOf(arr, size1)));
        System.out.println("Size before update: " + size1);

        int result1 = insertAtPosition(arr, capacity1, size1, position1, element);
        if (result1 != -1) {
            System.out.println("After: " + Arrays.toString(Arrays.copyOf(arr, result1)));
            System.out.println("size after update: " + result1);
        } else {
            System.out.println("Failed to insert ");
        }
        System.out.println("-------------------------------------------------------------------");
        // Test case 2: insert at beginning insex 0
        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        int capacity2 = 5;
        int size2 = 3;
        int position = 0;
        int element1 = 5;
        System.out.println("Before insertion : " + Arrays.toString(Arrays.copyOf(arr2, size2)));
        System.out.println("Size before update: " + size2);

        int result2 = insertAtPosition(arr2, capacity2, size2, position, element1);
        if (result2 != -1) {
            System.out.println("After insertion: " + Arrays.toString(Arrays.copyOf(arr2, result2)));
            System.out.println("Size after update: " + result2);
        } else {
            System.out.println("Failed to insert");
        }

        System.out.println("----------------------------------------------------------");

        // Test case 3 : insert at end
        int[] arr3 = new int[5];
        arr3[0] = 10;
        arr3[1] = 20;
        int capacity3 = 5;
        int size3 = 2;
        int position3 = 2;
        int element3 = 30;

        System.out.println("Before insertion : " + Arrays.toString(Arrays.copyOf(arr3, size3)));
        System.out.println("Size before insertion: " + size3);
        int result3 = insertAtPosition(arr3, capacity3, size3, position3, element3);

        if (result3 != -1) {
            System.out.println("After insertion: " + Arrays.toString(Arrays.copyOf(arr3, result3)));
            System.out.println("Size after update: " + result3);
        } else {
            System.out.println("Failed to insert");
        }
        // Test case 4: invalid position
        int[] arr4 = new int[3];
        arr4[0] = 10;
        arr4[1] = 20;
        arr4[2] = 30;
        int capacity4 = 3;
        int size4 = 3;
        int position4 = 4;
        int element5 = 40;

        System.out.println("Before insertion : " + Arrays.toString(Arrays.copyOf(arr4, size4)));
        System.out.println("Size before insertion: " + size4);
        int result4 = insertAtPosition(arr4, capacity4, size4, position4, element5);

        if (result4 != -1) {
            System.out.println("After insertion: " + Arrays.toString(Arrays.copyOf(arr4, result4)));
            System.out.println("Size after update: " + result4);
        } else {
            System.out.println("Failed to insert");
        }

    }

}
