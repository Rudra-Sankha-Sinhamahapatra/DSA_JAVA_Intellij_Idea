package com.rudra.Practice;

/*
2.  Aim of the program : Illustrate the
execution of constructors in multi-level
inheritance with three Java classes – plate(length, width), box(length,
width, height), wood box (length, width, height, thick) where box inherits from
plate and wood box inherits from box class. Each class has constructor where
dimensions are taken from user.

Input:  Enter the dimensions
Output:  Display the
dimensions accordingly
 */



import java.util.Scanner;

class Plate1{

    double length;
    double width;
    public  Plate1(double length,double width){
        this.length=length;
        this.width=width;
    }
}

class Box1 extends  Plate1{
    double height;

    public Box1(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
}

class Woodbox1 extends Box1{
    public Woodbox1(double length, double width, double height) {
        super(length, width, height);
    }
}
public class Cm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        double length=scanner.nextDouble();
        System.out.println("Enter width:");
        double width=scanner.nextDouble();
        System.out.println("Do you want to continue,if yes type y and if no type n");
        char c=scanner.next().charAt(0);
        if(c=='y'){
            System.out.println("Enter Height:");
            double height=scanner.nextDouble();
            Box1 boxx1=new Woodbox1(length,width,height);
            System.out.println("Dimensions of woodbox: ");
            System.out.println("Length: "+boxx1.height+"\n width: "+boxx1.width+"height: "+boxx1.height);
            System.out.println(boxx1.width);

        }


    }
}