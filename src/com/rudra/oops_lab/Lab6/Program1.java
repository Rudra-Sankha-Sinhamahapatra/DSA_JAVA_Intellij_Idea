package com.rudra.oops_lab.Lab6;

import java.util.Scanner;
import com.rudra.oops_lab.Lab6.Lab6.Marketing.sales;

/*
1.    Aim of the program - Define two packages as
– General and Marketing. In General package define a class ‘employee’  with data members as empid(protected),
ename(private) and a public method as earnings() which calculate total earnings
as
 earnings :basic + DA (80% of basic) + HRA (15% of basic)
In Marketing package define a class ‘sales’ which is extending from ‘employee’
class and has a method  tallowance()
which calculates Travelling Allowance as 5% of total earning. Write the
programs to find out total earning of a sales person for the given basic salary
amount and print along with the emp id.
Input: Enter the employee id and emploee name
 123  Amit
Enter the basic salary 1000
Output:The emp id of the employee is 123
The total earning is 1950.0
 */
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
