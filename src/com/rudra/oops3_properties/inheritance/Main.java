package com.rudra.oops3_properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.l+" "+box.h+" "+box.w);

        Box box1=new Box(4.5);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);

        Box box2=new Box(3.1,4.2,5.1);
        System.out.println(box2.l+" "+box2.h+" "+box2.w);

        Box box3=new Box(box2);
        System.out.println(box3.l+" "+box3.h+" "+box3.w);

        BoxWeight box4=new BoxWeight();
        System.out.println(box4.h+" "+box4.weight);

        BoxWeight box5=new BoxWeight(7.4,8.9,9.8,9);
        System.out.println(box5.l+" "+box5.h+" "+box5.w+" "+box5.weight);

        Box box6=new BoxWeight(2,3,4,8);
//      System.out.println(box6.weight);
//      cant access weight variable because
//      parent Box cant access his child BoxWeight variable weight

// there are many variables in both parent and child class
// you are given to access to variables that are in the ref type i.e. BoxWeight
        //Hence you should have access to weight variable
        //this also means the ones you are trying to access should be initialized
        //but, here when the obj itself is of type parent class,how will you call the constructor of child class
        //that is why error

//        BoxWeight box7=new Box(2,3,4);

        BoxPrice box8=new BoxPrice(5,8,200);


    }


}
