package com.rudra.DSA.Sliding_window.av;
import java.util.*;
import java.io.*;

public class InterviewQuestions {
    //https://leetcode.com/problems/sliding-window-maximum/description/
    //Brute

        public int[] maxSlidingWindowBrute(int[] arr, int k) {
            int n = arr.length-k+1;
            int[] ans = new int[n];
            for(int i = 0;i<=arr.length - k;i++){
                int max = Integer.MIN_VALUE;
                for(int j = i;j<i+k;j++){
                    max = Math.max(max,arr[j]);
                    ans[i] = max;
                }
            }
            return ans;
        }

        //Optimal

    public int[] maxSlidingWindowOptimal(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) return new int[0];

        int[] ans = new int[n-k+1];

        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0;i<n;i++){
            if(!deque.isEmpty() && deque.peekFirst()<i-k+1) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && arr[deque.peekLast()]<arr[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            if(i>=k -1 ){
                ans[i-k+1] = arr[deque.peekFirst()];
            }
        }
        return ans;
    }
}
