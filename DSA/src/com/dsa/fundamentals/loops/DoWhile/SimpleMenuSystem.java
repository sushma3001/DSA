package com.dsa.fundamentals.loops.DoWhile;

import java.util.Scanner;

public class SimpleMenuSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Menu: ");
                System.out.println("1. Say Hello");
                System.out.println("2. Say Goodbye");
                System.out.println("3. Exit");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Hello!");
                } else if (choice == 2) {
                    System.out.println("Goodbye!");
                } else if (choice == 3) {
                    System.out.println("Exiting program!");
                } else {
                    System.out.println("Invalid choice");
                }
                System.out.println("----------------------------------------");

            } while (choice != 3);
        }

    }

}
