package com.rudra.oops_lab.Lab5;
/*
Define
an interface with three methods – earnings(), deductions() and bonus() and
define a Java class ‘Manager’ which uses this interface without implementing
bonus() method. Also define another Java class ‘Substaff’ which extends from
‘Manager’ class and implements bonus() method.
Write the complete program to find out earnings, deduction and bonus of
a sbstaff with basic salary amount entered by the user as per the following
guidelines –

earnings     =      basic + DA (80% of basic) + HRA (15%
of basic)
deduction PF    =       12%
of basic
bonus      =       50% of basic
Input -Basic
salary - 50000
 Output -Earnings -  97500
Deduction-6000
 Bonus- 25000

 */

import java.util.Scanner;


interface Employee {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}


abstract class Manager implements Employee {
    @Override
    public double earnings(double basic) {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    @Override
    public double deductions(double basic) {
        return 0.12 * basic;
    }

}
class Substaff extends Manager {
    @Override
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

     Substaff substaff = new Substaff();
        System.out.println("\nOutput -");
        System.out.println("Earnings: " + substaff.earnings(basicSalary));
        System.out.println("Deductions: " + substaff.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}


