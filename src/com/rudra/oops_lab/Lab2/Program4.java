package com.rudra.oops_lab.Lab2;

/*
 Aim
   of the program:
    Program
   to find no. of
   objects created out of a class using ‘static’ modifier.
Input:
No of objects created

Output:
Display the number of objects created (e.g. no of objects=3)
 */
public class Program4 {
    static int count;
    Program4(){
        count++;
    }
    public static void main(String[] args) {
        Program4 obj1=new Program4();
    Program4 obj2=new Program4();
    Program4 obj3=new Program4();
    Program4 obj4=new Program4();
    System.out.println("No of Objects Created= "+Program4.count);
    }
}
