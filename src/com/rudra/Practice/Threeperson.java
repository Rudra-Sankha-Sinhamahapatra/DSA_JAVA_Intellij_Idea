package com.rudra.Practice;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter Balance: ");
        balance = scanner.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = scanner.nextLine();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Threeperson {
    public static void main(String[] args) {
        // Create three Person objects
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            persons[i].input();
        }

        // Display details of three persons
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of Person " + (i + 1) + ":");
            persons[i].disp();
        }
    }
}

