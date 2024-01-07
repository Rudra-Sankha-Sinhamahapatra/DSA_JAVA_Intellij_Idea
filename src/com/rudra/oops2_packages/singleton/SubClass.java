package com.rudra.oops2_packages.singleton;

import com.rudra.oops4_access.A;
public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       SubClass obj=new SubClass(32,"Hello");

//        A obj=new A(32,"Hello");
// will not work because only the subclass can use protected memebers of base class
// when it is in different package

        int n= obj.num;
        System.out.println(n);
    }
}

class SubSubclass extends SubClass {
    public SubSubclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {

        SubSubclass obj=new SubSubclass(32,"Hello");
//        SubClass obj=new SubClass(32,"Hello");
        //will not work because the protected member is in the different package
        //so we cant access through its parent class in the subclass

        int n= obj.num;
        System.out.println(n);
    }

}

class SubClass2 extends A{
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        SubClass obj=new SubClass(32,"Hello");
        //will not work because it has no connection with  SubClass

        SubClass2 obj=new SubClass2(32,"Hello");

        int n= obj.num;
        System.out.println(n);
    }
}