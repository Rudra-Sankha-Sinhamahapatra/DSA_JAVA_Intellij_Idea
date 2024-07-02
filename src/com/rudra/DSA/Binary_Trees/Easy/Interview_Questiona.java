package com.rudra.DSA.Binary_Trees.Easy;

public class Interview_Questiona {
    //https://www.geeksforgeeks.org/problems/introduction-to-trees/1
    static int countNodes(int i) {
        int ans=1;
        if(i==1){
            ans=1;
        }
        else{
            for(int j=1;j<i;j++){
                ans=ans*2;
            }
        }
        return ans;
    }


}
