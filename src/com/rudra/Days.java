package com.rudra;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days");
        int days=sc.nextInt();
        int day;
        day=days;
        //we assume 365 days in a year
        int years=days/365;
        days=days%365;
        //we assume 30 days in a month
        int months=days/30;
        days=days%30;
        int week=days/7;
        days=days%7;
        System.out.println("In "+day+" we get "+years+"years,"+months+"months,"+week+"weeks,"+days+ "days");
        sc.close();
    }
}
