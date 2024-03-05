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

package com.rudra.oops_lab.Lab4;
import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
class plate {

    double length;
    double width;

    public plate(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class box extends plate {
    double height;

    public box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
}

class woodbox extends box {
    double thick;

    public woodbox(double length, double width, double height,double thick) {
        super(length, width, height);
        this.thick=thick;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = scanner.nextDouble();

        System.out.println("Enter width:");
        double width = scanner.nextDouble();

        System.out.println("Do you want to continue,if yes type y and if no type n");
        char c = scanner.next().charAt(0);

        try {
            if (c != 'y' && c != 'n') {
                throw new InvalidInputException("Invalid input. Please enter 'y' or 'n'.");
            }
            if (c == 'y') {
                System.out.println("Enter Height:");
                double height = scanner.nextDouble();
                System.out.println("Enter the Thickness:");
                double thick=scanner.nextDouble();
                woodbox boxx = new woodbox(length, width, height,thick);

                System.out.println("Dimensions of woodbox: ");
                System.out.println("Length: " + boxx.length);
                System.out.println("Width: " + boxx.width);
                System.out.println("Height: " + boxx.height);
                System.out.println("Thickness: "+ boxx.thick);
            } else if (c == 'n') {
              plate platee=new plate(length,width);
                System.out.println("Dimensions of plate: ");
                System.out.println("Length: " + platee.length);
                System.out.println("Width: " + platee.width);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
