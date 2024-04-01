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
import java.util.Scanner;

class CounterThread extends Thread {
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        long startTime = System.currentTimeMillis();
        long sleepTime = 5;

        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.println("Counter - " + i);
            try {
                long elapsedTime = System.currentTimeMillis() - startTime;
                long remainingTime = sleepTime - elapsedTime;
                if (remainingTime > 0) {
                    Thread.sleep(remainingTime);
                }
                startTime = System.currentTimeMillis();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the thread: ");
        String threadName = scanner.nextLine();

        System.out.print("Enter the lower range of the counter: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter the upper range of the counter: ");
        int upperRange = scanner.nextInt();

        scanner.close();

        CounterThread counterThread = new CounterThread(threadName, lowerRange, upperRange);
        counterThread.start();
    }
}
