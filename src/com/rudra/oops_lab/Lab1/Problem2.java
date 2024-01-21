/*
    2. Aim of the program:  Write a program to print the corresponding grade for the given     mark using if..else statement in Java
Input:  Mention the grade in the program
Output: Display the Grade either O/E/A/B/C
 */
package com.rudra.oops_lab.Lab1;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter marks");
    int marks=scanner.nextInt();
    if(marks>89){
        System.out.println("Grade: O");
    }
    else if(marks>70 && marks<=89){
        System.out.println("Grade: E");
    }
    else if(marks>50 && marks<=70){
        System.out.println("Grade: A");
    }
    else if(marks>30 && marks<=49){
        System.out.println("Grade: B");
    }
    else if(marks<=30){
        System.out.println("Grade: C");
    }
    else{
        System.out.println("You are failed");
    }
    }
}
