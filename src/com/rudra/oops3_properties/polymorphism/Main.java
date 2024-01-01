package com.rudra.oops3_properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
//        Square square=new Square();

        Shapes square=new Square();
//        shape.area();
//        triangle.area();
//        circle.area();
        square.area();
    }
}
