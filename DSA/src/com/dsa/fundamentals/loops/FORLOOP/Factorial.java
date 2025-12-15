package com.dsa.fundamentals.loops.FORLOOP;

// So we need to find factorial means if n is 5 it should be 5 * 4 * 3 * 2 * 1 = 120

public class Factorial {
    public static void main(String[] args) {
        int factorial = 7;
        int result = 1;
        for (int i = factorial; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);

    }
}
