package com.rudra.oops5_interfaces.Interfaces.ExtendDemo2;

public interface A {
//static interface methods should always have a body
    //call via interface name
    static  void greeting(){
        System.out.println("Hey i am static method");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
