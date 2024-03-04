package com.rudra.DSA.Linked_List.Singly_Linkedlist;

import com.rudra.DSA.Linked_List.Singly_Linkedlist.LL;

public class LL_Main{
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertLast(99);
        list.insert(100,3);
        list.deleteFirst();
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
