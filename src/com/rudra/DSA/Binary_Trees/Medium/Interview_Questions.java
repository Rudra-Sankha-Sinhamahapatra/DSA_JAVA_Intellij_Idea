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


    //https://leetcode.com/problems/diameter-of-binary-tree/description/

    public int diameterOfBinaryTree(TreeNode root) {
        int [] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }

    private int height(TreeNode root,int[] diameter){
        if(root == null) return 0;
        int lh = height(root.left,diameter);
        int rh = height(root.right,diameter);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1 + Math.max(lh,rh);
    }

//https://leetcode.com/problems/binary-tree-maximum-path-sum/
    public int maxPathSum(TreeNode root) {
        int maxValue [] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root,maxValue);
        return maxValue[0];
    }

    private int maxPathDown(TreeNode node,int maxValue[]){
        if(node==null) return 0;
        int left = Math.max(0,maxPathDown(node.left,maxValue));
        int right = Math.max(0,maxPathDown(node.right,maxValue));
        maxValue[0] =Math.max(maxValue[0],left+right+node.val);
        return Math.max(left,right) + node.val;
    }


    //https://leetcode.com/problems/same-tree/description/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null) return p==q;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }


    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        boolean leftToRight = true;

        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll();
                if (leftToRight) {
                    row.add(node.val);
                } else {
                    row.add(0, node.val);
                }
                if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }
            }
            leftToRight = !leftToRight;
            result.add(row);
        }
        return result;
    }

//https://leetcode.com/problems/boundary-of-binary-tree/description/
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
    boolean isLeaf(Node root){
       return root.left == null && root.right==null;
    }

    void addLeftBoundary(Node root,ArrayList<Integer> res) {
        Node curr = root.left;
        while(curr!=null){
            if(!isLeaf(curr)) res.add(curr.data);
            if(curr.left!=null) curr = curr.left;
            else curr = curr.right;
        }

    }

    void addRightBoundary(Node root,ArrayList<Integer> res) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(curr != null) {
            if(!isLeaf(curr)) temp.add(curr.data);
            if(curr.right !=null) curr = curr.right;
            else curr = curr.left;
        }
        int i;
        for(i = temp.size() -1;i>=0;i--){
            res.add(temp.get(i));
        }
    }

    void addLeaves (Node root,ArrayList<Integer>res) {
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }

        if(root.left != null) addLeaves(root.left,res);
        if(root.right != null) addLeaves(root.right,res);
    }

    ArrayList <Integer> printBoundary (Node node) {
        ArrayList<Integer>ans = new ArrayList<Integer>();
        if(!isLeaf(node)) ans.add(node.data);
        addLeftBoundary(node,ans);
        addLeaves(node,ans);
        addRightBoundary(node,ans);
        return ans;
    }

    //https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/

    class Tuple {
        TreeNode node;
        int row;
        int col;
        public Tuple (TreeNode _node,int _row,int _col) {
            node = _node;
            row = _row;
            col = _col;
        }
    }

        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
            Queue<Tuple> q = new LinkedList<Tuple>();
            q.offer(new Tuple(root,0,0));
            while(!q.isEmpty()){
                Tuple tuple = q.poll();
                TreeNode node = tuple.node;
                int x = tuple.row;
                int y = tuple.col;

                if(!map.containsKey(x)){
                    map.put(x,new TreeMap<>());
                }
                if(!map.get(x).containsKey(y)){
                    map.get(x).put(y,new PriorityQueue<>());
                }
                map.get(x).get(y).offer(node.val);

                if(node.left != null) {
                    q.offer(new Tuple(node.left,x-1,y+1));
                }
                if(node.right != null) {
                    q.offer(new Tuple(node.right,x+1,y+1));
                }
            }

            List<List<Integer>> list = new ArrayList<>();
            for (TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()){
                list.add(new ArrayList<>());
                for(PriorityQueue<Integer> nodes : ys.values()) {
                    while(!nodes.isEmpty()) {
                        System.out.println(nodes.peek());
                        list.get(list.size()-1).add(nodes.poll());
                    }
                }
            }
            return list;
        }

  //https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1

  class Pair {
      Node node;
      int hd;

      public Pair(Node node, int hd) {
          this.node = node;
          this.hd = hd;
      }
  }

    ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd)==null) map.put(hd,temp.data);
            if(temp.left != null) {
                q.add(new Pair(temp.left,hd-1));
            }
            if(temp.right != null) {
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }


}
