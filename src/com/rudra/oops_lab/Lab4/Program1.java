/*
1.  Aim of the program :  A
Plastic manufacturer
sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet
is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft.  Implement it in Java to calculate the
cost of plastic as per the dimensions given by the user where 3D inherits from 2D.



Input:    Enter
dimensions


Output: Display the cost of plastic


*/



package com.rudra.oops_lab.Lab4;

import java.util.*;

class twod{
    double length,breadth;

    public twod(double length,double breadth) {
        this.length = length;
        this.breadth=breadth;
    }



}

class threed extends  twod{
    double height;

    public threed(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }


}
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Length of the sheet");
   double length=sc.nextDouble();
   System.out.println("Enter the bredth of the sheet");
   double breadth=sc.nextDouble();
   System.out.println("Enter the height of the sheet");
   double height=sc.nextDouble();
   twod Twood=new twod(length,breadth);
   threed Threed=new threed(length,breadth,height);
   double costtwod= Twood.length * Twood.breadth * 40;
   double costthreed= Threed.length * Threed.breadth * Threed.height * 60;
   System.out.println("Cost of twood sheet RS:"+costtwod);
   System.out.println("Cost of threed sheet RS: "+costthreed);

    }
}
