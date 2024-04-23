package com.rudra.Sessional.Lab6.Marketing;
import com.rudra.oops_lab.Lab6.Lab6.General.employee;
public class sales extends employee{
    public sales(int empid, String ename) {
        super(empid, ename);
    }
    public double Allowance(double total){
        return 0.5*total;
    }
}
