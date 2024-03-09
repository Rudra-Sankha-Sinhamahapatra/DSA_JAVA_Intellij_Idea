package com.rudra.oops_lab.Lab5;
/*
1.  Aim of the program -Illustrate
the usage of abstract class with following Java classes –
i.   An abstract class ‘student’ with two data
members roll no, reg no, a method getinput() and an abstract method course()
ii.  A subclass ‘kiitian’
with course() method implementation.
Write the driver class to print the all details
of a kiitian object.

         Input - Rollno -
2205180
                           Registration
no - 1234567890
                 Output -Rollno -
2205180
                           Registration
no - 1234567890
                           Course
- B.Tech. (Computer Science & Engg)

 */

import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Registration Number: ");
        regNo = scanner.nextLong();
    }

    abstract void course();
}

class Kiitian extends Student {
    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class Program1 {
    public static void main(String[] args) {
      Kiitian kiitian = new Kiitian();

        System.out.println("Input -");
        kiitian.getInput();

        System.out.println("\nOutput -");
        System.out.println("Roll Number - " + kiitian.rollNo);
        System.out.println("Registration Number - " + kiitian.regNo);
        kiitian.course();
    }
}

