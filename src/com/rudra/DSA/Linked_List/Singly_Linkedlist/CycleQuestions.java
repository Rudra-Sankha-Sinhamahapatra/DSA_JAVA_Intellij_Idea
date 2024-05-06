package com.rudra.DSA.Linked_List.Singly_Linkedlist;

import java.util.LinkedList;

//Amazon and microsoft
//https://leetcode.com/problems/linked-list-cycle/
//
public class CycleQuestions {
    public boolean hasCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){return true;}
            }
            return false;
        }


    public int lengthCycle(ListNode head) {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
           //calculate the length
                ListNode temp=slow;
                do{
                temp=temp.next;
                length++;
                }while(temp!=fast);
            }
        }
        return length;
        }
        }


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


