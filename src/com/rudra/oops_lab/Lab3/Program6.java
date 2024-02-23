package com.rudra.oops_lab.Lab3;
 class Rectangle1 {
    int length, breadth;

    Rectangle1() {
        length = 0;
        breadth = 0;
    }

    Rectangle1(int l) {
        length = l;
        breadth = 1;
    }

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    float getArea() {
        return length * breadth;
    }
}

public class Program6 {
    /**
     * Rectangle
     */
    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1();
        Rectangle1 rect2 = new Rectangle1(5);
        Rectangle1 rect3 = new Rectangle1(5, 6);

        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Area of rect2: " + rect2.getArea());
        System.out.println("Area of rect3: " + rect3.getArea());
    }
    
}
