package com.rudra.DSA.Arrays.Easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
public class Interview_Questions {
    //https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
    public int largest(int arr[], int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
    int print2largest(int arr[], int n) {
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(slargest<arr[i] && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        return slargest;
    }

    //https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957

    public static int isSorted(int n, int []arr) {
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return 0;
            }
        }
        return 1;
    }

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public boolean check(int[] arr) {
    int n = arr.length;
    int pivot = -1;
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            pivot = i;
            break;
        }
    }
    if (pivot == -1) {
        return true;
    }
    for (int i = pivot + 1; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return arr[n - 1] <= arr[0];
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public int removeDuplicates(int[] nums) {
    int i = 0;
    for(int j = 1; j < nums.length; j++){
        if(nums[i] != nums[j]){
            nums[i+1]=nums[j];
            i++;
        }
    }
    return i+1;

}

  //https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?interviewProblemRedirection=true&search=left%20rotate&leftPanelTabValue=SUBMISSION
  static int[] rotateArray(int[] arr, int n)
  {
      int temp=arr[0];
      // Write your code here.
      for(int i=1;i<n;i++){
          arr[i-1]=arr[i];
      }
      arr[n-1]=temp;
      return arr;
  }

  //https://www.naukri.com/code360/problems/rotate-array_1230543?interviewProblemRedirection=true&search=Rotate%20array&leftPanelTabValue=SUBMISSION
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        ArrayList<Integer> temp = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));
        }

        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }

        for (int i = n-k; i < n; i++) {
            arr.set(i, temp.get(i-(n-k)));
        }

        return arr;
    }


    //alternatively
    public static ArrayList<Integer> rotateArray1(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;  // To handle if k is greater than n

        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining n - k elements
        reverse(arr, k, n - 1);
        // Reverse the entire list
        reverse(arr, 0, n - 1);

        return arr;
    }

    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }

        //https://leetcode.com/problems/move-zeroes/description/
        public void moveZeroes(int[] arr) {
            int j=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[j++]=arr[i];
                }
            }
            for(int i=j;i<arr.length;i++){
                arr[i]=0;
            }
        }

        //https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
        static int searchInSorted(int arr[], int n, int k){
            for(int i=0;i<n;i++){
                if(arr[i]==k){
                    return 1;
                }
            }
            return -1;
        }
        //https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
        public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
        {
            TreeSet<Integer>unionset=new TreeSet<>();

            for(int i=0;i<n;i++){
                unionset.add(arr1[i]);
            }
            for(int i=0;i<m;i++){
                unionset.add(arr2[i]);
            }
            return new ArrayList<>(unionset);
        }



    }

