/*
    3. Aim of the program:   Write a program to print the week day for the given day no. of the     current month using switch case statement
Input:  Mention the Day no in the program
Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday /Thursday/Friday/Saturday)
 */

package com.rudra.oops_lab.Lab1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day no of January 2024");
        int day= scanner.nextInt();
        int dayno=day%7;
        if(day<32) {
            switch (dayno) {

                case (1):
                    System.out.println("Monday");
                    break;

                case (2):
                    System.out.println("Tuesday");
                    break;

                case (3):
                    System.out.println("Wednesday");
                    break;

                case (4):
                    System.out.println("Thrusday");
                    break;

                case (5):
                    System.out.println("Friday");
                    break;

                case (6):
                    System.out.println("Saturday");
                    break;

                case (0):
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Invalid day");
        }
    }
}
