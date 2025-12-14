package com.dsa.arrays.Core_JAVA.WhileLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number = 1998;
        int sum = 0;

        while (number > 0) {
            // Get last digit of a number
            int lastDigit = number % 10;
            // add that last digit to sum
            sum += lastDigit;
            // Remove last digit from number
            number = number / 10;
        }
        System.out.println("Sum of number is: " + sum);

    }

}
