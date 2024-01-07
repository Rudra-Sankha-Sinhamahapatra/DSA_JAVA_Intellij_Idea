package com.rudra.oops4_access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj=new A(20,"Rudra");
        //need to do a few things
        //1. Access the data members
        //2. Modify the data members
       ArrayList<Integer> list=new ArrayList<>(20);
//        list.DEFAULT_CAPACITY = 10;  //private access cant access
//    obj.num;  //private so cant access
    obj.getNum();
    }
}
