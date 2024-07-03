package com.rudra.DSA.Binary_Trees.Easy;

import java.util.ArrayList;
import java.util.List;

public class Interview_Questiona {

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


    //https://leetcode.com/problems/binary-tree-preorder-traversal/description/

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>answer=new ArrayList<>();
        preOrder(root,answer);
        return answer;
    }

    private void preOrder(TreeNode node,List<Integer>answer){
        if(node==null){
            return;
        }
        answer.add(node.val);
        preOrder(node.left,answer);
        preOrder(node.right,answer);
    }

  //https://leetcode.com/problems/binary-tree-inorder-traversal/description/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>answer=new ArrayList<>();
        inOrder(root,answer);
        return answer;
    }

    private void inOrder(TreeNode node,List<Integer>answer){
        if(node==null){
            return;
        }
        inOrder(node.left,answer);
        answer.add(node.val);
        inOrder(node.right,answer);
    }

}
