package com.dsa.arrays.Week1_Operation.Day1Insertion;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== TESTING JAVA SETUP ===\n");

        // Test 1: Array declaration
        int[] arr = new int[5];
        System.out.println("✓ Array declaration works" + Arrays.toString(arr));

        // Test 2: Array initialization
        int[] arr2 = { 10, 20, 30, 40, 50 };
        System.out.println("✓ Array initialization works");

        // Test 3: Print array
        System.out.println("✓ Array printing: " + Arrays.toString(arr2));

        // Test 4: Loop through array
        System.out.print("✓ Array looping: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        try ( // Test 5: Scanner input
                Scanner sc = new Scanner(System.in)) {
            System.out.print("\n✓ Scanner test - Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);

            System.out.println("\n=== ALL TESTS PASSED ===");
            System.out.println("Setup working! Ready for Day 1.");
        }
    }
}
