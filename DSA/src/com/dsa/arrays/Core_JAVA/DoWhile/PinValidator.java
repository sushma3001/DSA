package com.dsa.arrays.Core_JAVA.DoWhile;

import java.util.Scanner;

/**
 * 1. set correct PIN to 1234
 * 2. set attempt counter to 0
 * 3. DO:
 * a. Ask user to enter pin
 * b. read the pin
 * c. increment counter
 * d. if PIN is correct:
 * - print "Granted "
 * e. Else if PIN is wrong:
 * - Print "Incorrect PIN. Try again. "
 * 4. WHILE : PIN is Wrong AND attempts < 3
 * 5. After loop:
 * - If attempts reached 3 and PIN still wrong:
 * - Print "Account locked!"
 */
public class PinValidator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int correctPin = 1234;
            int attempts = 0;
            int pin;
            do {

                System.out.print("Enter user pin: ");
                pin = sc.nextInt();
                attempts++;
                if (pin == correctPin) {
                    System.out.print("Granted...");
                    System.out.println("It took you " + attempts + " attempts.");
                } else {
                    System.out.print("Incorrect PIN. Try again\n");

                }

            } while (pin != correctPin && attempts < 3);
            if (attempts >= 3 && pin != correctPin) {
                System.out.println("Account locked!");

            }
        }

    }

}
