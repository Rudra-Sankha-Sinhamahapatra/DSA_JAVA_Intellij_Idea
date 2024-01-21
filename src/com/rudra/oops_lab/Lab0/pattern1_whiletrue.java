package com.rudra.oops_lab.Lab0;

public class pattern1_whiletrue {
    public static void main(String[] args) {
        int i=1,j=10;
        while(true){
            System.out.println(i+" "+j);
            i+=2;
            j-=2;
            if(i>11 || j<0)
                break;
        }
    }
}
