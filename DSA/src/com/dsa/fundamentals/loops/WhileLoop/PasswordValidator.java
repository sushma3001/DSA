package com.dsa.fundamentals.loops.WhileLoop;

import java.util.Scanner;

/**
 * 1.first take user input as password
 * 2.declare variable for validate checker
 * 3.using while loop
 * check wheather the password length is equal to 8 characters if TRUE exit
 * or repeat until it becomes true and display invalid count
 */
public class PasswordValidator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Password: ");
            String password = sc.next();
            int invalidCount = 0;
            while (password.length() < 8) {
                System.out.println("Password is invalid");
                invalidCount++;
                System.out.print("Enter again: ");
                password = sc.next();

            }
            System.out.println("You made Invalid Inputs : " + invalidCount);

        }

    }

}
