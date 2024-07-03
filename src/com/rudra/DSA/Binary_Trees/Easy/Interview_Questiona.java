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


    //https://leetcode.com/problems/binary-tree-postorder-traversal/description/
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>answer=new ArrayList<>();
        postOrder(root,answer);
        return answer;
    }

    private void postOrder(TreeNode node,List<Integer>answer){
        if(node==null){
            return;
        }
        postOrder(node.left,answer);
        postOrder(node.right,answer);
        answer.add(node.val);
    }


    //https://leetcode.com/problems/binary-tree-level-order-traversal/description/
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> answer = new ArrayList<>();
        int level = 0;
        preOrder(root, level, answer);
        return answer;
    }

    public void preOrder(TreeNode root, int level, List<List<Integer>> answer) {
        if (root == null) {
            return;
        }

        while (answer.size() <= level) {
            answer.add(new ArrayList<>());
        }
        answer.get(level).add(root.val);

        level++;
        preOrder(root.left, level, answer);
        preOrder(root.right, level, answer);


    }
}
