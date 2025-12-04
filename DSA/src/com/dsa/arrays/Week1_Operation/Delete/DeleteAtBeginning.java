package com.dsa.arrays.Week1_Operation.Delete;

import java.util.Arrays;

public class DeleteAtBeginning {
    public static int deleteAtBeginning(int[] arr, int currentSize) {
        // step 1 - check is array null or not
        if (currentSize <= 0) {
            return -1;
        }

        // step 2 : loop to shift elements
        for (int i = 0; i < currentSize - 1; i++) {
            // step 3 : logic to shift elements
            arr[i] = arr[i + 1];
        }
        // step 4 : update current size
        currentSize--;
        // step 5 : return current size after deleting element
        return currentSize;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1 : Normal delete");
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int currentSize = 3;

        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr, currentSize)));
        System.out.println("Size before deletion: " + currentSize);

        int result = deleteAtBeginning(arr, currentSize);
        if (result != -1) {
            System.out.println("After deleting :" + Arrays.toString(Arrays.copyOf(arr, result)));
            System.out.println("After deletion: " + result);
        }
        System.out.println("------------------------------------------------");
        // Test case 2 : single element
        System.out.println("Test case 2 : single element");
        int[] arr2 = new int[3];
        arr2[0] = 10;

        int currentSize1 = 1;
        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr2, currentSize1)));
        System.out.println("Size before deletion: " + currentSize1);

        int result1 = deleteAtBeginning(arr2, currentSize1);
        if (result1 != -1) {
            System.out.println("After deleting :" + Arrays.toString(Arrays.copyOf(arr2, result1)));
            System.out.println("After deletion: " + result1);
        }

        System.out.println("------------------------------------------");
        System.out.println("Test case 3: empty array");

        int[] arr3 = new int[3];
        int currentSize2 = 0;

        System.out.println("Array before deletion: " + Arrays.toString(Arrays.copyOf(arr3, currentSize2)));
        System.out.println("Size before deletion: " + currentSize2);

        int result2 = deleteAtBeginning(arr3, currentSize2);
        if (result2 != -1) {
            System.out.println("After deleting :" + Arrays.toString(Arrays.copyOf(arr3, result2)));
            System.out.println("After deletion: " + result2);
        } else {
            System.out.println("Array is empty");
        }

    }

}
