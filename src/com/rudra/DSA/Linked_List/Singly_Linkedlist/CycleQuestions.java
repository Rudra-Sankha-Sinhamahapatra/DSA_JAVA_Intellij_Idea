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

        //Starting Node of linked list cycle
       //https://leetcode.com/problems/linked-list-cycle-ii/

 class StartingNode {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

//https://leetcode.com/problems/happy-number/
     public boolean isHappy(int n) {
     int slow=n;
     int fast=n;
     do{
         slow=findSquare(slow);
         fast=findSquare(findSquare(fast));
         if(slow==1){
             return true;
         }
     }while(slow!=fast);
     return false;
     }
     private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
           ans+=(rem*rem);
           number=number/10;
        }
        return ans;
     }

     //https://leetcode.com/problems/middle-of-the-linked-list/
     public ListNode middleNode(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while (fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         return slow;
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


