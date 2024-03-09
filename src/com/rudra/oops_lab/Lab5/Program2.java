package com.rudra.oops_lab.Lab5;
/*
Define an interface
Motor with a data member –capacity and two methods such as run() and consume().
Define a Java class ‘Washing machine’ which implements this interface and write
the code to check the value of the interface data member thru an object of the
class.
              Input - mentioned in the program
             Output -Capacity of the motor is -----
 */


interface Motor {
    int capacity = 1;

    void run();

    void consume();
}

class WashingMachine implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine is running.");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
}

public class Program2{
    public static void main(String[] args) {
       WashingMachine washingMachine = new WashingMachine();

        System.out.println("Capacity of the motor is " + Motor.capacity);

        washingMachine.run();
        washingMachine.consume();
    }
}
