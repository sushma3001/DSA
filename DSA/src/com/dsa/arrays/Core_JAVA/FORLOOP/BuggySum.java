package com.dsa.arrays.Core_JAVA.FORLOOP;

public class BuggySum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 5; i++) {
            sum = sum + i;
            System.out.println("Added " + i);
        }

        System.out.println("Sum should be 15, but got: " + sum);
    }
}
