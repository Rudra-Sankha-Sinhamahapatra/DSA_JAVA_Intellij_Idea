package com.rudra.oops3_properties.polymorphism;

public class Numbers {
    double sum(double a,int b){
    return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    void  minus(int a,String b){
    System.out.println(a+"="+b);
    }

    void minus(String b,int a){
        System.out.println(b+"="+a);
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(2,3);
        obj.sum(2,3,4);
        obj.minus("Hello dear 24 - 4 ",20);
        obj.minus(20,"24 - 4 ");
    }
}
