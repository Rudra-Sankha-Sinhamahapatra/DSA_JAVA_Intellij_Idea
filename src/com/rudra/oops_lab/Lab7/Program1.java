package com.rudra.oops_lab.Lab7;
import java.util.*;
/*
1.
Aim of the program - Write a Java program to generate an
ArrayIndexOutofBoundsException and handle it using catch statement.


Input: Enter the
numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )


Output: Exception in thread “main”
java.lang.ArrayIndexOutOfBoundsException:4

 */
public class Program1 {
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter Array elements");
            arr[0]=scanner.nextInt();
            arr[1]=scanner.nextInt();
            arr[2]=scanner.nextInt();
            arr[3]=scanner.nextInt();
            arr[4]=scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("ArrayIndexOutofBoundsException");
            System.out.println(e.getMessage());        }
    }
}
