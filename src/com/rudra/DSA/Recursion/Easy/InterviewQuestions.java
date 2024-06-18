package com.rudra.DSA.Recursion.Easy;

public class InterviewQuestions {

    //https://leetcode.com/problems/string-to-integer-atoi/description/
    class Q1 {
        public int myAtoi(String s) {
            if(s.length()==0){
                return 0;
            }
            int i=0;
            int sign=1;
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            if(i<s.length() && (s.charAt(i)=='-' ||s.charAt(i)=='+')){
                if(s.charAt(i)=='-'){
                    sign=-1;
                }
                i++;
            }
            int ans=0;
            while(i<s.length() && Character.isDigit(s.charAt(i))){
                int digit=s.charAt(i++) - '0';
                if(ans>Integer.MAX_VALUE /10 ||(ans==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE %10)){
                    return sign==1 ?Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans=ans*10 +digit;
            }
            return ans*sign;
        }
    }


    //https://leetcode.com/problems/powx-n/description/
    class Q2{
        public double myPow(double x, int n) {
            double ans=1.0;
            long nn=n;
            if(nn<0) nn=-1*nn;
            while(nn>0){
                if(nn%2==1){
                    ans=ans*x;
                    nn=nn-1;
                }
                else{
                    x=x*x;
                    nn=nn/2;
                }
            }
            if(n<0) ans=(double)(1.0)/(double)(ans);
            return ans;
        }
    }
}
