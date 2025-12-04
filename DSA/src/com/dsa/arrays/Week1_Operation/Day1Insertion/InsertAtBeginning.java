package com.dsa.arrays.Week1_Operation.Day1Insertion;

public class InsertAtBeginning {
    public static int insertBeginning(int[] arr, int capacity, int currentSize, int element) {
        //
        if (currentSize >= capacity) {
            System.out.println("Array is full");
            return -1;
        }
        for (int i = currentSize - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];

        }
        arr[0] = element;

        currentSize++;
        return currentSize;
    }

}
