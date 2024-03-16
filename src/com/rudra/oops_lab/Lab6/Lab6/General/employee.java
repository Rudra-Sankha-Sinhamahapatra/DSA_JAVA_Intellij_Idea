package com.rudra.oops_lab.Lab6.Lab6.General;

public class employee {
    protected int empid;
    private String ename;

    public employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic){
        return basic+(0.8*basic)+(0.15*basic);
    }

}
