/*
 1. Aim of the program : Write a class file – box with three data members(length,
width, height)  and a method
volume() . Also  implement the application class Demo where an object of  the box class is created with user entered
dimensions and volume is printed.

Input:  length, width and height.
    Output:  Volume
 */

package com.rudra.oops_lab.Lab3;

import java.util.Scanner;


public class Box {
     double length;
     double width;
     double height;


    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public double getVolume() {
        return length * width * height;
    }
}

 class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter box length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter box width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter box height: ");
        double height = scanner.nextDouble();


        Box box = new Box(length, width, height);


        double volume = box.getVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
