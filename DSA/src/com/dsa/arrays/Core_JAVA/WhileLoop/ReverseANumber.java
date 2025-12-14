package com.dsa.arrays.Core_JAVA.WhileLoop;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 1234;
        int reverseNumber = 0;
        System.out.println("Number to reverse is: " + number);
        while (number > 0) {
            // first exract last number
            int lastNumber = number % 10;
            // store that number to reverseNumber
            reverseNumber = reverseNumber * 10 + lastNumber;

            // update number
            number = number / 10;
        }
        System.out.println("Reversed Number is : " + reverseNumber);
    }

}
