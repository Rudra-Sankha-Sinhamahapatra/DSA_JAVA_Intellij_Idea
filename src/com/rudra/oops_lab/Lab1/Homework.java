package com.rudra.oops_lab.Lab1;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        System.out.println("Enter any one operation from +,-,*,/");
        char ope=scanner.next().charAt(0);
        switch(ope){
            case '+':
                System.out.println("Result: "+(a+b));
                break;

            case '-':
                System.out.println("Result: "+(a-b));
                break;
            case '*':
                System.out.println("Result: "+(a*b));
                break;
            case '/':
                if(b!=0) {
                    System.out.println("Result: " + (a / b));
                }
                else {
                System.out.println("Undefined");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
