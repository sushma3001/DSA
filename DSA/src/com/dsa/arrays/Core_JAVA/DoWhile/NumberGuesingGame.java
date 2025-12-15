package com.dsa.arrays.Core_JAVA.DoWhile;

import java.util.Scanner;

/**
 * 1. Set up variable called secretNumber
 * 2. set variable COUNT to track how many times guessed
 * 3. ask for the user input and read it
 * 4. if number is too high than secretNumber print high
 * else if number is too low than pint low than secretNumber
 * else if number is equal to secret number
 * else invalid please enter correct number
 * 5. count ++
 * 6. it runs until you enter correct secret number
 * 
 */
public class NumberGuesingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 50) + 1;
        int count = 0;
        int guess;

        do {
            System.out.print("Guess a random number within range 1 to 50: ");
            guess = sc.nextInt();
            count++;
            if (guess > secretNumber) {
                System.out.println("Too High");
            } else if (guess < secretNumber) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct! you got it in " + count + " attempts");
            }
        } while (guess != secretNumber);
    }

}
