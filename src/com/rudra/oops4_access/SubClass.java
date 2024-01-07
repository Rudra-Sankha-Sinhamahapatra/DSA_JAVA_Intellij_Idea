package com.rudra.oops4_access;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj=new SubClass(32,"Hello");
//       A obj=new A(32,"Hello");
        //will work because base class can use the protected member  when it is
        // in the same package

        int n= obj.num;
        System.out.println(n);
        System.out.println(obj instanceof SubClass);
    }
}

class SubSubclass extends SubClass{
    public SubSubclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {

//        SubSubclass obj=new SubSubclass(32,"Hello");
        SubClass obj=new SubClass(32,"Hello");

        //will  work because the protected member is in the same package
        //so, we can access through its parent class in the subclass

        int n= obj.num;
        System.out.println(n);
    }

}
class SubClass2 extends A{
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

//        A obj=new A(32,"Hello");
        SubClass2 obj=new SubClass2(32,"Hello");

        int n= obj.num;
        System.out.println(n);
    }
}
