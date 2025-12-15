package com.dsa.arrays.concepts;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] ages = { 25, 30, 22, 35, 28, 40 };

        // print complete array
        System.out.println("Complete array: " + Arrays.toString(ages));

        // first and last element
        System.out.println("First element: " + ages[0]);
        System.out.println("Last element: " + ages[ages.length - 1]);

        // change 4th element that is 3rd index becouse it starts from 0
        ages[3] = 36;

        // printing after change
        System.out.println("Array after changing element: " + Arrays.toString(ages));
    }

}
