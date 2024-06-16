package com.rudra.DSA.Bit_Manipulation.Easy;

public class InterviewQuestions {

    //https://leetcode.com/problems/power-of-two/description/
    class Q1 {
        public boolean isPowerOfTwo(int n) {
            boolean value=false;
            if(n==0){
                return false;
            }
            else if(n==1){
                return true;
            }
            while(n!=1){
                if(n%2!=0){
                    value= false;
                    break;
                }
                else{
                    value=true;
                }
                n/=2;
            }
            return value;
        }
    }


}
