package com.rudra.oops_lab.Lab5;
/*
Define an interface Emloyee with a method
getDetails() to get emplyee details as Empid and Ename. Also define a derived
interface Manager with a method getDeptDetails() to get department details such
as Deptid and Deptname.Then define a class Head which implements Manager
interface and also prints all details of the employee. Write the complete
program to display all details of one head of the department.

Input - Enter employee id - 123
Enter employee name - Sidharth Ambani
Enter department id - 06
Enter department name -Marketing

Output -
Employee id - 123
Employee name - Sidharth Ambani
Department id - 06
Department name -Marketing
 */
import java.util.Scanner;

interface Emloyee {
    void getDetails(int empid, String ename);
}

interface Managerr extends Emloyee {
    void getDeptDetails(int deptid, String deptname);
}

 class Head implements Managerr {
    @Override
    public void getDetails(int empid, String ename) {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
    }

    @Override
    public void getDeptDetails(int deptid, String deptname) {
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id - ");
        int empid = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name - ");
        String ename = scanner.nextLine();
        System.out.print("Enter department id - ");
        int deptid = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter department name - ");
        String deptname = scanner.nextLine();

        Head head = new Head();
        head.getDetails(empid, ename);
        head.getDeptDetails(deptid, deptname);
    }
}
