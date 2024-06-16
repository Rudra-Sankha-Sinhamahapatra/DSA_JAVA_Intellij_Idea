package com.rudra.DSA.Bit_Manipulation.Easy;

public class InterviewQuestions {

    //https://leetcode.com/problems/power-of-two/description/
    //Brute
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

//Optimal
class Q1_1 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        int power = 1;
        while (power < n) {
            power *= 2;
        }

        return power == n;
    }
}

//https://leetcode.com/problems/divide-two-integers/description/
class Q2 {
    public int divide(int dividend, int divisor) {
        int answer=dividend/divisor;

        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        return answer;
    }
}


}
