package com.rudra.oops_lab.Lab1;
import java.util.Scanner;
public class comapre1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b ");
        int b=scanner.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
