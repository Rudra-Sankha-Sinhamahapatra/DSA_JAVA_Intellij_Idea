package com.rudra.DSA.Arrays.Medium;
import  java.util.*;

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

    //Alternatively

        public int[] twoSum1(int[] arr, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] result = new int[2];

            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                int complement = target - current;

                if (map.containsKey(complement)) {
                    result[0] = map.get(complement);
                    result[1] = i;
                    return result;
                }

                map.put(current, i);
            }

            return null; // Return null if no solution is found
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


//    https://leetcode.com/problems/sort-colors/description/
    //Brute

    public void sortColors(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else if (arr[i] == 2) count2++;
        }
        for (int i = 0; i < count0; i++) arr[i] = 0;
        for (int i = count0; i < count0 + count1; i++) arr[i] = 1;
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) arr[i] = 2;
       }

//https://www.naukri.com/code360/problems/sort-an-array-of-0s-1s-and-2s_892977?leftPanelTabValue=PROBLEM
public static void sortArray(ArrayList<Integer> arr, int n) {
    // Write your code here.
    int low=0,mid=0,high=n-1;
    while(mid<=high){
        if(arr.get(mid)==0){
            Collections.swap(arr,low,mid);
            low++;
            mid++;
        }
        else if(arr.get(mid)==1){
            mid++;
        }
        else{
            Collections.swap(arr,mid,high);
            high--;
        }
    }
}

//https://leetcode.com/problems/majority-element/
    //Brute
public int majorityElement(int[] arr) {
    int n=arr.length;
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==arr[i]) count++;
        }
        if(count>n/2) return arr[i];
    }
    return -1;
}

//Better

    public int majorityElement1(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }

        for(Map.Entry<Integer,Integer>it:map.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;
    }


    //Optimal
    public int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    //or
    public int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    //https://www.naukri.com/code360/problems/majority-element_842495?leftPanelTabValue=PROBLEM

    public static int findMajority(int[] nums, int n) {
        int count = 0;
        int candidate = 0;//majority

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int count1=0;
        for(int num:nums){
            if(num==candidate){
                count1++;
            }
        }
        if(count1>n/2) return candidate;
        return -1;
    }

    //https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxi = Math.max(sum, maxi);
            if (sum < 0) sum = 0;
        }
        return maxi;
    }


    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
        public int maxProfit(int[] arr) {
            int maxPro = 0;
            int minPrice=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                minPrice=Math.min(minPrice,arr[i]);
                maxPro=Math.max(maxPro,arr[i]-minPrice);
            }
            return maxPro;
        }

        //https://leetcode.com/problems/rearrange-array-elements-by-sign/
    //Brute
        public int[] rearrangeArray(int[] nums) {
            ArrayList<Integer>pos=new ArrayList<>();
            ArrayList<Integer>neg=new ArrayList<>();

            for(int i=0;i<nums.length;i++){
                if(nums[i]>0) pos.add(nums[i]);
                else neg.add(nums[i]);
            }

            for(int i=0;i<nums.length/2;i++){
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            return nums;
        }


}




