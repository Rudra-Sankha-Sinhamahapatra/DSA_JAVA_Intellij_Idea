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

    //https://leetcode.com/problems/balanced-binary-tree/description/
    //Brute

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftH=getH(root.left);
        int rightH=getH(root.right);
        if(Math.abs(leftH-rightH)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
    public int getH(TreeNode root){
        if(root==null) return 0;
        int lh=getH(root.left);
        int rh=getH(root.right);
        return 1+Math.max(lh,rh);
    }

    //optimal
    public boolean isBalanced2(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    public int dfsHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1){
            return -1;
        }
        int rightHeight = dfsHeight(root.right);

        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
