package com.dsa.arrays.concepts;

import java.util.Arrays;

public class ArrayFillDemo {
    public static void main(String[] args) {
        // create array size 6
        // Task 1: Create array size 5, fill with -1
        int[] arr = new int[6];
        System.out.println("Array before filling: " + Arrays.toString(arr));
        Arrays.fill(arr, -1);
        System.out.println("Array after filling: " + Arrays.toString(arr));

        // Task 2: Create array {1,2,3,4,5}, fill index 1 to 3 with 99

        int[] arr2 = { 1, 2, 3, 4, 5 };
        Arrays.fill(arr2, 1, 4, 99);
        System.out.println("Partial fill: " + Arrays.toString(arr2));

    }

}
