package com.rudra.Sessional;

import java.util.Scanner;
import com.rudra.Sessional.Lab6.Marketing.sales;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the employee id and employee name ");
        int empid=scanner.nextInt();
        String ename=scanner.nextLine();

        sales s=new sales(empid,ename);

        System.out.println("Enter the basic salary of the employee");
        double basic=scanner.nextDouble();
        double total=s.earnings(basic);


        System.out.println("The emp id of the employee is "+empid);
        System.out.println("The total earning is "+total);

    }
}
