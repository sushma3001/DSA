package com.dsa.arrays.Core_JAVA.FORLOOP;

public class ForLoopPractice {
    public static void main(String[] args) {
        // challange 1 : Print 1 to 10
        System.out.println("Challange 1 : Print 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");
        System.out.println("Challange 2 : Print 1 to 20 only even numbers");

        // challange 2: 2 ways
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);

        }
        System.out.println("------------------------------------------------");

        // or
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------------------------------");

        System.out.println("challange 3: Print countDown 10 to 0");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Challenge 4: Write a loop that prints the multiplication table of 5 (5×1 through 5×10):");
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Challenge 5: Sum of 1 to 100 (hint: you need a variable to accumulate the sum)");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;

        }
        System.out.println("Sum : " + sum);

        System.out.println("------------------------------------------------------");
        System.out.println("Challange 6: ");

    }
}
