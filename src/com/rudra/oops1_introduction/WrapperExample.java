package com.rudra.oops1_introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        these cant be swapped because theres no pass by reference in java

        Integer a=10;
        Integer b=20;

        swap(a,b);

        System.out.println(a+ " " + b);
        final A Rudra=new A("rudra");
        Rudra.name="other name";

        //when a non primitive is final you cant reassign it
        //Rudra=new A("new object");

        A obj=new A("absdkfjelf");
        System.out.println(obj);
        //doesnt have much load on memory
//        for(int i=0;i<10000;i++){
//            obj=new A("random name");
//        }

        //have a lot of load on memory
//        for(int i=0;i<100000000;i++){
//            obj=new A("random name");
//
////            obj.finalize();            //we cant do it manually
//        }
    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}

class A{
    final int num=10;
    String name;

    public A(String name) {
//        System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}