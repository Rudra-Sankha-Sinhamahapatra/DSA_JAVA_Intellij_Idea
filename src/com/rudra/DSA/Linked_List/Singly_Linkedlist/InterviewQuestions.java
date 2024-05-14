package com.rudra.DSA.Linked_List.Singly_Linkedlist;

//Amazon and microsoft
//https://leetcode.com/problems/linked-list-cycle/
//
public class InterviewQuestions {
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


     // https://leetcode.com/problems/reverse-linked-list/submissions/
     // google, apple, amazon, microsoft
     public ListNode reverseList(ListNode head) {
         if (head == null) {
             return head;
         }
         ListNode prev = null;
         ListNode present = head;
         ListNode next = present.next;

         while (present != null) {
             present.next = prev;
             prev = present;
             present = next;
             if (next != null) {
                 next = next.next;
             }
         }
         return prev;
     }

     //https://leetcode.com/problems/sort-list/
     private ListNode findMid(ListNode head) {
         if (head == null || head.next == null)
             return head;

         ListNode slow = head, fast = head;
         while (fast.next != null && fast.next.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
     }

     private ListNode merge(ListNode l1, ListNode l2) {
         ListNode dummy = new ListNode(0);
         ListNode curr = dummy;
         while (l1 != null && l2 != null) {
             if (l1.val < l2.val) {
                 curr.next = l1;
                 l1 = l1.next;
             } else {
                 curr.next = l2;
                 l2 = l2.next;
             }
             curr = curr.next;
         }
         curr.next = (l1 != null) ? l1 : l2;
         return dummy.next;
     }

     public ListNode sortList(ListNode head) {
         if (head == null || head.next == null)
             return head;
         ListNode mid = findMid(head);
         ListNode newHead = mid.next;
         mid.next = null;
         ListNode leftHalf = sortList(head);
         ListNode rightHalf = sortList(newHead);
         return merge(leftHalf, rightHalf);
     }

     //https://leetcode.com/problems/palindrome-linked-list/
     public boolean isPalindrome(ListNode head) {
         ListNode mid=middleNode(head);
         ListNode headSecond=reverseList(mid);
         ListNode reverseHead=headSecond;

         //compare both the halves
         while(head!=null && headSecond!=null){
             if(head.val!=headSecond.val){
                 break;
             }
             head=head.next;
             headSecond=headSecond.next;
         }
         reverseList(reverseHead);

         return head==null||headSecond==null;
     }

     //https://leetcode.com/problems/reorder-list/
     public void reorderList(ListNode head) {
       if(head==null || head.next==null){
           return ;
       }
       ListNode mid=middleNode(head);
       ListNode e=reverseList(mid);
       ListNode s=head;

       //re arrange
         while(s!=null && e!=null){
             ListNode temp=s.next;
             s.next=e;
             s=temp;
             temp=e.next;
             e.next=s;
             e=temp;
         }
         //next of tail to null
         if(s!=null){
             s.next=null;
         }
     }

     //https://leetcode.com/problems/reverse-nodes-in-k-group/
     public ListNode reverseKGroup(ListNode head, int k) {

         ListNode preTail = null;        // stores the tail node of previous LL.
         ListNode curHead = head;        // stores the head node of current LL
         ListNode curTail = head;        // stores the tail node of current LL

         ListNode nextHead = null;       // stores the head node of next LL

         while(curHead != null)
         {
             // initialize count from 1
             int count = 1;

             // iterate the LL untill count becomes k or we reach the last node.
             while(curTail.next != null && count < k)
             {
                 curTail = curTail.next;
                 count++;
             }

             if(count != k)
             {
                 break;
             }

             // set the nextHead pointer to the head of the next LL.
             nextHead = curTail.next;


             // detach the RHS of the current LL.
             curTail.next = null;

             // detach the LHS of the current LL.
             if(preTail != null)
             {
                 preTail.next = null;
             }

             // after reversing the current LL, curHead becomes the new tail.
             // and curTail becomes the new head.

             curTail = reverse(curHead);

             // attach the LHS
             if(preTail != null)
             {
                 preTail.next = curTail;
             }
             else
             {
                 // if preTail is null then we have reversed the first LL
                 // so store the reference of curHead in original head pointer.
                 head = curTail;
             }

             // attach the RHS
             curHead.next = nextHead;

             // update the pointer
             preTail = curHead;
             curHead = nextHead;
             curTail = nextHead;
         }

         return head;

     }
     private ListNode reverse(ListNode head)
     {
         ListNode preNode = null;
         ListNode curNode = head;

         ListNode nextNode = head;

         while(curNode != null)
         {
             nextNode = nextNode.next;

             curNode.next = preNode;

             preNode = curNode;
             curNode = nextNode;
         }
         return preNode;
     }

     //https://leetcode.com/problems/rotate-list/
     public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null ||k<=0){
             return head;
         }
      ListNode last=head;
         int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        last.next=head;
        int rotations=k%length;
        int skip=length-rotations;
     ListNode NewLast=head;

         for (int i = 0; i <skip-1 ; i++) {
             NewLast=NewLast.next;
         }
         head=NewLast.next;
         NewLast.next=null;
       return head;
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


