package com.dsa.arrays.Core_JAVA.WhileLoop;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number to find factorial: ");
            int number = sc.nextInt();
            int factorial = 1;
            int i = number;

            if (number < 0) {
                System.out.println("Invalid number");

            } else {
                while (i > 0) {
                    factorial = factorial * i;
                    i--;
                }
                System.out.println("Final factorial value: " + factorial);

            }
        }

    }
}
