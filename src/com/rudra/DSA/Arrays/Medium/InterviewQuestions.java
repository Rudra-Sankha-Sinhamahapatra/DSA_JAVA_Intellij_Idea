package com.rudra.DSA.Arrays.Medium;
import  java.util.Arrays;
public class InterviewQuestions {

    //https://leetcode.com/problems/two-sum/description/
    public int[] twoSum(int[] arr, int target) {
        // Create an array of pairs to store the value and original index
        int[][] pairs = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                result[0] = pairs[left][1];
                result[1] = pairs[right][1];
                return result;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }

    //https://www.naukri.com/code360/problems/reading_6845742?leftPanelTabValue=PROBLEM
    public static String read(int n, int []arr, int target){
        // Write your code here.
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                return "YES";
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else if(arr[left]+arr[right]<target){
                left++;
            }
        }
        return "NO";
    }


}
