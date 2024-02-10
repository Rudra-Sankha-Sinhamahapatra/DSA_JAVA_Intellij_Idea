/*
2.  Aim of the program :   Write
a program
in Java to create a class Rectangle having data members length and breadth and three methods called read, calculate
and display to read the values of  length
and breadth,  calculate the area and
perimeter of the rectangle and display the result  respectively.

    Input:   Mention length and breadth      Output:  Display Area of Rectangle and Perimeter of
rectangle.
 */

package com.rudra.oops_lab.Lab3;
import java.util.*;
public class Rectangle {
    double length;
    double breadth;


    void read() {
        System.out.println("Enter Length and Breadth");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
    }

    void calculate() {
        System.out.println("Area: " + length * breadth);
        System.out.println("Perimeter: " + (length + breadth) * 2);
    }


    void display() {
        calculate();
    }
}
    class Program2 {
        public static void main(String[] args) {
            Rectangle rec=new Rectangle();
            rec.read();
//            rec.calculate();
            rec.display();

        }
    }


