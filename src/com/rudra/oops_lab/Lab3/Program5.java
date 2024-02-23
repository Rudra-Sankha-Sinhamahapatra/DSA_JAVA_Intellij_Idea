package com.rudra.oops_lab.Lab3;

import java.util.*;

class Shape {
    double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Calculate area of a square using separate method
    double areaOfSquare(double side) {
        return Math.pow(side, 2);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:\n1. Circle\n2. Triangle\n3. Square");

        try {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("The area of the circle is: " + new Shape().area(radius));
                    break;
                case 2:
                    System.out.println("Enter the base and height of the triangle: ");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    System.out.println("The area of the triangle is: " + new Shape().area(base, height));
                    break;
                case 3:
                    System.out.println("Enter the side of the square: ");
                    double side = scanner.nextDouble();
                    System.out.println("The area of the square is: " + new Shape().areaOfSquare(side));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}
