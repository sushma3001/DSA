package com.dsa.arrays.concepts;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Regular for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        System.out.println("--------------------------------------------");
        // printing all elements using enhanced for loop
        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println("--------------------------------------------");

        // Print sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println("sum of all array elements: " + sum);

    }

}
