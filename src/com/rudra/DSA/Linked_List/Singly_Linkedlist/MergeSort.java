package com.rudra.DSA.Linked_List.Singly_Linkedlist;

public class MergeSort {

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

    //https://leetcode.com/problems/sort-list/description/
    private ListNode sortList(ListNode head){
        if(head==null ||head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left,right);
    }

    public ListNode getMid(ListNode head) {
        ListNode midPrev=null;
        while (head!=null && head.next!=null){
            midPrev=(midPrev==null)?head:midPrev.next;
            head=head.next;
        }
        ListNode mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }
}


