package com.rudra.oops_lab.Lab8;
/*
1.     Aim of the program - Write a program in
Java using multi-threading which will display a counter value within a
specified range with a gap of 5 milliseconds after setting it’s name as given by the user.

Input: Name of the thread - First
Lower-range of counter - 10
Upper-range of counter - 15
Output: Thread - First
Counter
- 10           11      12      13      14      15

 */
import java.lang.*;
import java.util.Scanner;

class MyThread extends Thread {
    int low;
    int high;

    public MyThread(String name, int lowerRange, int upperRange) {
        super(name);
        low = lowerRange;
        high = upperRange;
    }

    public void run() {
        for (int i = low; i <= high; i++) {
            System.out.println("Thread - " + getName());
            System.out.println("Counter - " + i);
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                // pass
            }
        }
    }
}

class LAB8_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter thread name: ");
        String tname = scan.nextLine();
        System.out.println("Enter lower range: ");
        int low = scan.nextInt();
        System.out.println("Enter upper range: ");
        int high = scan.nextInt();
        MyThread t = new MyThread(tname, low, high);
        t.start();
    }
}