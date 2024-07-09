package com.rudra.DSA.Binary_Trees.Medium;

import java.util.*;

public class Interview_Questions {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    //Recursive approach- best approach
    public int maxDepthRecursive(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=maxDepthRecursive(root.left);
        int rh=maxDepthRecursive(root.right);
        return 1+Math.max(lh,rh);
    }

    //Levelwise Approach
    public int maxDepthLevelWise(TreeNode root) {
        int depth=0;
        if(root==null) return depth;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            depth++;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){q.offer(temp.left);}
                if(temp.right!=null){q.offer(temp.right);}
            }
        }
        return depth;
    }
}
