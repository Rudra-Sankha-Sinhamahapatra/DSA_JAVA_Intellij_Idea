package com.rudra.Practice;

import java.util.Scanner;

// Define the Employee interface
interface Employee {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

// Implement the Employee interface in the Manager class
abstract class Manager implements Employee {
    // Implement the earnings() method
    @Override
    public double earnings(double basic) {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    // Implement the deductions() method
    @Override
    public double deductions(double basic) {
        return 0.12 * basic;
    }

    // Note: No implementation for the bonus() method in Manager class
}

// Substaff class extends from Manager and implements the bonus() method
class Substaff extends Manager  {
    // Implement the bonus() method
    @Override
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class Emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the basic salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Create an object of Substaff class
        Substaff substaff = new Substaff();

        // Calculate and display earnings, deductions, and bonus
        System.out.println("\nOutput -");
        System.out.println("Earnings: " + substaff.earnings(basicSalary));
        System.out.println("Deductions: " + substaff.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}

