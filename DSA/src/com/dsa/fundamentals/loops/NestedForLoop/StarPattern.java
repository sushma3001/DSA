package com.dsa.fundamentals.loops.NestedForLoop;

public class StarPattern {

    public static void main(String[] args) {
        // outer loop for rows it decides how many times inner loop should work
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
