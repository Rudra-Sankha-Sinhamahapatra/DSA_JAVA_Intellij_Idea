///*  Aim
//   of the program:
//    Program
//   to sort the user
//   entered list of numbers of any size
//
//Input:
//List of Numbers
//
//Output:
//Display the numbers in Ascending order
// */
//
package com.rudra.oops_lab.Lab2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }


        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
