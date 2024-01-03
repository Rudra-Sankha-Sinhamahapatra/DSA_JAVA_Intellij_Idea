package com.rudra.oops3_properties.inheritance;

import java.util.ArrayList;

public class BoxWeight extends Box{
double weight;

BoxWeight (BoxWeight other){
    super(other);
    weight=other.weight;
}


    public BoxWeight() {
        this.weight = -1;
    }

    //@Override  it's not overriding it because you cant override static method
    static void greeting(){
        System.out.println("Hey,I am in box class,Greetings");
        ArrayList list=new ArrayList(); //abstract data types
        list.add(4);
    }
    BoxWeight(double side,double weight){
    super(side);
    this.weight=weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//call the parent class constructor
        //used to initialize values present in parent class
        //calling the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }


}
