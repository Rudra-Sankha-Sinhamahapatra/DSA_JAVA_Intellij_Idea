package com.rudra.Practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr [][]=new int[3][3];
        int i,j;
        System.out.println("Enter the elements of the array");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j <3 ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int rightSum=arr[0][2]+arr[1][1]+arr[2][0];
        int leftSum=arr[0][0]+arr[1][1]+arr[2][2];

        System.out.println("left:"+leftSum);
        System.out.println("right:"+rightSum);

    }
}
