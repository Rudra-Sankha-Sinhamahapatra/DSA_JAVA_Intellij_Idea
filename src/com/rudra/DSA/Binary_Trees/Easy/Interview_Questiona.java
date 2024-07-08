package com.rudra.DSA.Binary_Trees.Easy;

import java.util.*;

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

    //iterative
    public List<Integer> preorderIterative(TreeNode root) {
        List<Integer>answer=new ArrayList<>();
        if(root==null) return answer;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            root=st.pop();
            answer.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return answer;
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


    //iterative
    public List<Integer> inorderIterative(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
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


    //iterative

    public List<Integer> postorderIterative_TwoStacks(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty()) {
            TreeNode node = st1.pop();
            st2.push(node);

            if (node.left != null) {
                st1.push(node.left);
            }
            if (node.right != null) {
                st1.push(node.right);
            }
        }

        while (!st2.isEmpty()) {
            answer.add(st2.pop().val);
        }

        return answer;
    }

//iterative - single stack
public List<Integer> postorderIterative_SingleStacks(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode current = root;
    TreeNode lastVisited = null;

    while (current != null || !stack.isEmpty()) {
        if (current != null) {
            stack.push(current);
            current = current.left;
        } else {
            TreeNode peekNode = stack.peek();
            if (peekNode.right != null && lastVisited != peekNode.right) {
                current = peekNode.right;
            } else {
                result.add(peekNode.val);
                lastVisited = stack.pop();
            }
        }
    }
    return result;
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
