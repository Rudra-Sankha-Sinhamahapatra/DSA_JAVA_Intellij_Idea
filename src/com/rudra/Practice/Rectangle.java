package com.rudra.Practice;

import java.util.Scanner;

public class Rectangle {
    double length;
    double breadth;

    void read(){
        System.out.println("Enter the length and breadth of the rectangle");
        Scanner sc=new Scanner(System.in);
        length=sc.nextDouble();
        breadth=sc.nextDouble();
    }

    void calculate(){
        System.out.println("Area of the Rectangle is "+(length*breadth));
        System.out.println("Perimeter of the rectangle is "+(2*(length+breadth)));
    }

    void display(){
        calculate();
    }


}

class Result{
    public static void main(String[] args) {
        Rectangle rc=new Rectangle();
        rc.read();
        rc.display();

    }
}

