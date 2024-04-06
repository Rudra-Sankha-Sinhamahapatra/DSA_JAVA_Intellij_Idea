package com.rudra.Practice;
import java.util.*;
/*
1.     Aim of the program - Write a program in
Java using multi-threading which will display a counter value within a
specified range with a gap of 5 milliseconds after setting it’s name as given by the user.

Input: Name of the thread - First
Lower-range of counter - 10
Upper-range of counter - 15
Output: Thread - First
Counter
- 10           11      12      13      14      15

 */
 class myThread extends java.lang.Thread {
 int upper,lower;
 public myThread(String name,int upper,int lower){
     super(name);
     this.upper=upper;
     this.lower=lower;
 }

 public void run(){
     for(int i=lower;i<=upper;i++) {
         System.out.println("Thread name-" + getName());
         System.out.println("Counter"+i);
         try{
             java.lang.Thread.sleep(5);
         }
         catch(InterruptedException e){
             //catch
         }
     }
 }
}
public class Thread {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the name of the thread");
     String threadName=sc.nextLine();
     System.out.println("Enter the lower limit of the thread");
     int lower=sc.nextInt();
     System.out.println("Enter the upper limit of the thread");
     int upper=sc.nextInt();
     myThread th=new myThread(threadName,upper,lower);
     th.start();
    }
}
