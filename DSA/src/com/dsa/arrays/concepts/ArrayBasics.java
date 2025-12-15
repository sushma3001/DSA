package com.dsa.arrays.concepts;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // creating size with 5
        int[] arr = new int[5];

        // printing array
        System.out.println("Array is: " + Arrays.toString(arr));

        // print 3rd element
        System.out.println("value in index 2 is: " + arr[2]);

        // set arr[2] = 99
        arr[2] = 99;

        // Print the array again to see the change
        System.out.println("Array is after changing: " + Arrays.toString(arr));
        System.out.println("--------------------------------------------------------------------");
        // Second way
        int[] marks = { 10, 20, 30, 40, 50 };
        System.out.println("Marks of students are: " + Arrays.toString(marks));
        System.out.println("First student marks: " + marks[0]);
        System.out.println("First student marks: " + marks[4]);
        System.out.println("--------------------------------------------------------------------");

        int[] scores = { 10, 15, 20, 25, 30 };
        System.out.println("All the scores are: " + Arrays.toString(scores));
        System.out.println("Array length is: " + scores.length);
        System.out.println("Last element in an array: " + scores[scores.length - 1]);

    }

}
