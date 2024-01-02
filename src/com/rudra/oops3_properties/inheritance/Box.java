package com.rudra.oops3_properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey,I am in box class");
    }
//  double weight;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    //cube
    Box(double side){
//        super(); object class
        this.w=side;
        this.l=side;
        this.h=side;
    }

   public Box(double l,double h,double w){
        System.out.println("Box class constructor");
        this.w=w;
        this.l=l;
        this.h=h;
    }

    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
