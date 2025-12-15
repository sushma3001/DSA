
package com.dsa.arrays.ArrayProblems;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = { 12, 7, 15, 20, 9, 14, 8, 3 };
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        System.out.println("even numbers count is: " + evenCount);
        System.out.println("Odd number count is: " + oddCount);
    }

}
