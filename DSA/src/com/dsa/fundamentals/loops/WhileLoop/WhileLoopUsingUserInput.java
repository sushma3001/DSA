package com.dsa.fundamentals.loops.WhileLoop;

import java.util.Scanner;

public class WhileLoopUsingUserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number in a range 1 to 10 : ");
            int number = sc.nextInt();
            int invalidCount = 0;

            while (number < 1 && number > 10) {
                System.out.println("Invalid number");
                invalidCount++;
                System.out.print("Enter again: ");
                number = sc.nextInt();
            }
            System.out.println("You made Invalid Inputs : " + invalidCount);
        }

    }
}
