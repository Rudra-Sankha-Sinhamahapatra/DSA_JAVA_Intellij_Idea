package com.rudra.DSA.Practice;

public class Sum_of_Numbers {

   static int sum (int num) {
        int sum = 0;
        for(int i=num;i>0;i--){
            sum+=i*i;
        }
        return sum;
    }

    static int sumOptimal (int n) {
       int res = (n*(n+1)*((2*n)+1))/6;
       return res;
    }
    public static void main(String[] args) {
     int res = sum(4);
     System.out.println(res);
     int res2 = sumOptimal(4);
     System.out.println(res2);
    }
}
