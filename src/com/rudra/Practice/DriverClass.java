package com.rudra.Practice;

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

public class DriverClass {
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
