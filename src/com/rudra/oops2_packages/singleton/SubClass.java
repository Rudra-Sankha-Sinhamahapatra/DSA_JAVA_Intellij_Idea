package com.rudra.oops2_packages.singleton;

import com.rudra.oops4_access.A;
public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       SubClass obj=new SubClass(32,"Hello");
        int n= obj.num;
        System.out.println(n);
    }
}
