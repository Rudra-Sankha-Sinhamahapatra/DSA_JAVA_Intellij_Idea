package com.rudra.oops_lab.Lab2;

/*Aim
   of the program:
    Find
   the no. of
   occurrence of each element in a user entered list of nos.



Input:
   Enter list of numbers e.g.( 15 25 15 11 25 32 15 32)



Output:
   Occurrence of 15=3


       Occurrence
of 25=2


       Occurrence
of 11=1



   Occurrence of 32=2

 */
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        int n,count,i,j;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n: ");
        n=scan.nextInt();
        int[]a=new int[n];
        System.out.println("Enter lists of numbers");
        for ( i = 0; i < n; i++) {
  a[i]=scan.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]!=-1){
                count=1;
                for(j=i+1;j<n;j++){
                    if(a[j]!=-1 && a[j]==a[i]){
                        count++;
                        a[j]=-1;
                    }
                }
                System.out.println("Occurence of "+a[i]+"="+count);
            }
        }
    }
}
