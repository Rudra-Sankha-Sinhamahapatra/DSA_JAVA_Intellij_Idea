package com.rudra.oops2_packages.singleton;

import com.rudra.oops4_access.A;

public class Main extends  A{
    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        //all 3 reference variables are pointing to just one object

     A a=new A(10,"Rudra");
     a.getNum();
    }
}
