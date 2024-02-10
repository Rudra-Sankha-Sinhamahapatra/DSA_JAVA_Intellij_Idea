/*
3. Aim of the program :  Write a
program in java to input and display the details of n number of students having roll, name and cgpa as
data members. Also display the name of the student having lowest cgpa.



Input:   Enter Roll No, Name and cgpa of ‘n’ number of students.    Output:  Display the details of ‘n’ number of students. Also display the name of
student with lowest cgpa

 */

package com.rudra.oops_lab.Lab3;
import java.util.*;

class  Student{
    int roll;
    String name;
    double cgpa;
}
public class CGPA {
    public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the number of students");
  int n=scanner.nextInt();
  Student[]students=new Student[n];
  System.out.println("Enter the data for "+n+" no of students");
        for (int i = 0; i < n; i++) {
            students[i]=new Student();
            System.out.println("Enter data for student"+(i+1));
            System.out.println("Enter Roll no");
            students[i].roll=scanner.nextInt();
            System.out.println("Enter name");
            students[i].name=scanner.next();
            System.out.println("Enter CGPA");
            students[i].cgpa=scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data for student"+(i+1));
            System.out.println("Roll no"+students[i].roll);
            System.out.println("Name:"+students[i].name);
            System.out.println("CGPA:"+students[i].cgpa);
        }

       double lowestcgpa=students[0].cgpa;
        String lowestcgpaname=students[0].name;
        for(int i=0;i<n;i++){
        if(students[0].cgpa>students[i].cgpa) {
            lowestcgpa=students[i].cgpa;
            lowestcgpaname=students[i].name;
        }
        }

        System.out.println("The student who got lowest cgpa:"+lowestcgpaname+" and a cgpa of :"+lowestcgpa);
    }
}
