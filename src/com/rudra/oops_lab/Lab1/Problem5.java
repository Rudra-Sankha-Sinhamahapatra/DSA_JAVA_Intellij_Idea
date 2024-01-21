/*
user and     print both in one line as last name followed by first name
Input:     Enter first name: KIIT
                  Enter Second Name: UNIVERSITY
Output:     UNIVERSITY KIIT
 */

package com.rudra.oops_lab.Lab1;
import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
//        String a="Rudra Sankha";
//        String b="Sinhamahapatra";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name");
        String a=scanner.nextLine();
        System.out.println("Enter the second name");
        String b=scanner.nextLine();
        System.out.print("Display: "+b);
        System.out.println(" "+a);
    }
}
