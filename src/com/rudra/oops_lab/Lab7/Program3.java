package com.rudra.oops_lab.Lab7;
/*
Aim of the program-  Write a Java
class which has a method called ProcessInput(). This method checks the number
entered by the user. If the entered number is negative then throw an user
defined exception called NegativeNumberException, otherwise it displays the
double value of the entered number.

Input:
Enter a number      4
Output:Double value:  8
Input:Enter a number    -4
Output:   Caught the exception
 Exception occurred:  NegativeNumberException: number should be positive
 */

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message) {
        super(message);
    }
}
class check{
    void ProcessInput(double a) throws NegativeNumberException{
        if(a<0){
            throw new NegativeNumberException("number should be positive");
        }
        else{
            System.out.println("Double Number Value:"+a);
        }
    }
}
public class Program3 {
    public static void main(String[] args) throws NegativeNumberException {
        check c=new check();
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        c.ProcessInput(a);
    }
}
