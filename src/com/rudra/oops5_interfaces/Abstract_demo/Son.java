package com.rudra.oops5_interfaces.Abstract_demo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
     System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
    System.out.println("I love Spiderman");
    }
}
