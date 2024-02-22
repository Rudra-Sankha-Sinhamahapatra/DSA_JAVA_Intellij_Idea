package com.rudra.oops5_interfaces.Abstract_demo;

public abstract class Parent {
     int age;
    final int value;
    final int value2=34;
    public Parent(int age) {
        this.age = age;
        value=24;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("I am a normal method");
    }
    abstract  void career();
    abstract  void partner();
}
