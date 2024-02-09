package com.rudra.oops_lab.Lab2;
/*
Aim of the program :
        Find the
        largest among 3 user entered nos. at the command prompt using Java



        Input:
        Enter three number .


        Output:
        Display the Largest Number
*/
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        int c=scanner.nextInt();
        int largest;
        if(a>b && a<c){
            largest=a;
        }
        else if(b>c && b>a){
            largest=b;
        }
        else{
            largest=c;
        }
        System.out.println("Largest Number: "+largest);
    }
}
