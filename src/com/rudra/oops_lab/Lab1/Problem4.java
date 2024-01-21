/*
    4. Aim of the program : Program to check a user entered number is palindrome or not
Input:  Mention the number in the program
Output: display the number is Palindrome or not.
 */
package com.rudra.oops_lab.Lab1;

public class Problem4 {
    public static void main(String[] args) {
        int num=343;
        int num1;
        num1=num;
        int reversedNumber=0;
        while (num > 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        System.out.println("Reversed Number: "+ reversedNumber);
        if(num1==reversedNumber){
            System.out.println("The number is Palindrome");
        }
    }
}
