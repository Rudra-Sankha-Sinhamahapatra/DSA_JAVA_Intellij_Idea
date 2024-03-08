package com.rudra.DSA.Linked_List.Doubly_Linkedlist;

import com.rudra.DSA.Linked_List.Doubly_Linkedlist.DLL;
public class LL_Main {
    public static void main(String[] args) {
        DLL list=new DLL();
      list.insertFirst(23);
      list.insertFirst(24);
      list.insertLast(44);
      list.insertFirst(2);
      list.insertLast(2);
      list.insertLast(6);
      list.insert(44,55);
      list.display();
      list.displayRev();
    }
}
