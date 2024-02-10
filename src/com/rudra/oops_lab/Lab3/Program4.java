/*
4.     Aim of the program : Write a program to overload subtract method with various parameters in
a class in Java. Write the driver class to use the different subtract methods
using object.

Input:
Mention various subtract method having different parameters.    Output:  Subtract method will display the result
accordingly
 */

package com.rudra.oops_lab.Lab3;

class Overload{
void subtract(){
    System.out.println("No parameter");
}
void subtract(int a,int b){
    System.out.println("Subtraction:"+ (a-b));
}

void subtract(int a){
    System.out.println("Result: "+a);
}
}
public class Program4 {

    public static void main(String[] args) {
  Overload obj=new Overload();
  obj.subtract();
  obj.subtract(56);
  obj.subtract(45,18);
    }
}
