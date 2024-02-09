/* Aim of the program :
   Accept 10
   numbers from command line and check how many of them are even and
   how many are odd.
Input:
Enter 10 number from keyboard
Output:
   Display number of even and odd number
 */

package com.rudra.oops_lab.Lab2;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);

        int even=0;
        int odd=0;
//        System.out.println("Enter 10 numbers");
//        for(int i=0;i< args.length;i++){
//            arr[i]= scanner.nextInt();
//        }
        for(int i=0;i<args.length;i++){
            if(Integer.parseInt(args[i])%2==0){
                System.out.println("Even Numbers: "+args[i]);
                even+=1;
            }

            else{
                System.out.println("Odd Numbers: "+args[i]);
                odd+=1;
            }

        }

        System.out.println("Number of odd numbers are: "+odd+" and the number of even numbers are: "+even);
    }
}
