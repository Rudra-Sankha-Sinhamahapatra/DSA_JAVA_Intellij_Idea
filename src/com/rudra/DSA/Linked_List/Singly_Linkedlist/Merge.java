package com.rudra.DSA.Linked_List.Singly_Linkedlist;

public class Merge {

    //https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode f=new ListNode();
        ListNode f=null;
        ListNode s=f;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                s.next=list1;
                list1=list1.next;
                s=s.next;
            }
            else{
                s.next=list2;
                list2=list2.next;
                s=s.next;
            }
        }
        s.next=(list1!=null)?list1:list2;
        return f.next;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
}
