package com.dsa.arrays.Core_JAVA.NestedForLoop;

public class SpaceAndStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
    // Print (5-i) spaces
    for (int j = 1; j <= (5-i); j++) {
        System.out.print(" ");
    }
    
    // Print i stars
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    
    System.out.println();
}
    }

}
