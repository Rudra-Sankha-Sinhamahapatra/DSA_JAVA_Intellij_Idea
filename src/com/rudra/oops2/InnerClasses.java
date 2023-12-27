package com.rudra.oops2;

//outside classes cannot be static,only inner classes can be static
//class Test{
//    static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }
//}
public class InnerClasses {
//    this will work because this is a static class now
    static class Test{
     String name;

         public Test(String name) {
             this.name = name;
         }
     }

    public static void main(String[] args) {
        Test a=new Test("Rudra");
        Test b=new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//outside class : so we cant use static
//static class A{
//
//}