package com.rudra.oops_lab.Lab7;
/*
2.
Aim of the program-  Write a
Java program to handle an ArithmeticException using try, catch, and finally
block.


Input:
Operand values for division operation mentioned in
the program


Output: ArithmeticException caught by try-catch-finally block

 */
public class Program2 {
    public static void main(String[] args) {
        try{
            int a=10,b=0;
            int c=a/b;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
    }
}
