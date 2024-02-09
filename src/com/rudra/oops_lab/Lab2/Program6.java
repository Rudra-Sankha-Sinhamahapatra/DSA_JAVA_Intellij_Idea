package com.rudra.oops_lab.Lab2;
import java.util.Scanner;
/*
Aim
   of the program:

   Find sum of each
   diagonal (left & right) elements separately of a user entered 3
   X 3 matrix in Java.

Input:

Enter 3X3 matrix
           e.g.
           6 7 3
8 9 2
1
2 9
Output:
   Left=24
Right=13
 */
public class Program6 {
    public static void main(String[] args) {
        int [][]a=new int[3][3];
        int i,j,lSum = 0,nSum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 3*3 matrix:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++) {
                if(i==j){
                    lSum+=a[i][j];
                }
                if(i+j==2){
                    nSum+=a[i][j];
                }
            }
        }
        System.out.println("Left="+lSum);
        System.out.println("Right="+nSum);
    }
}
