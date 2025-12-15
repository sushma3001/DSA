package com.dsa.fundamentals.loops.WhileLoop;

import java.util.Scanner;

/**
 * 1. take user input as number
 * 2. Sum to store sum of all numbers
 * 3. using while loop check wheather the number entered is 0 or any if it is 0
 * stop summing up and
 * 4. else keep on adding and show final sum
 */

public class SumUntilZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            int sum = 0;

            while (number != 0) {
                sum += number;
                System.out.print("Enter number again: ");
                number = sc.nextInt();

            }
            System.out.println("Sum of numbers are: " + sum);

        }

    }

}
