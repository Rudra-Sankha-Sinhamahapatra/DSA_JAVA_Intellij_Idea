package com.rudra.Sessional;

import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter Array elements");
            for (int i = 0; i < 5; i++) {
                arr[i]=scanner.nextInt();
            }
        }
        catch(Exception e){
            System.out.println("ArrayIndexOutofBoundsException");
            System.out.println(e.getMessage());        }
    }
}