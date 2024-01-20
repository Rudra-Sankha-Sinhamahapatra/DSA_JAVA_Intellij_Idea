package com.rudra.oops_lab.Lab1;

public class homework {
    public static void main(String[] args) {
        int a = 5, b = 1, c = 25;

        // Using ternary operator to assign value to d
        int d = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Printing the value of d
        System.out.println("d: " + d);
    }
}
