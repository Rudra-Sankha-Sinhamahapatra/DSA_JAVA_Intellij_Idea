package com.rudra.Practice;

// Define the Motor interface
interface Motor {
    int capacity = 0;  // Data member in an interface is implicitly public, static, and final

    void run();

    void consume();
}

// Implement the Motor interface in the WashingMachine class
class WashingMachine implements Motor {
    // Implement the run() method
    @Override
    public void run() {
        System.out.println("Washing machine is running.");
    }

    // Implement the consume() method
    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
}

public class Wm {
    public static void main(String[] args) {
        // Create an object of the WashingMachine class
        WashingMachine washingMachine = new WashingMachine();

        // Check the value of the interface data member
        System.out.println("Capacity of the motor is " + Motor.capacity);

        // Call methods from the implemented interface
        washingMachine.run();
        washingMachine.consume();
    }
}
