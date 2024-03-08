package com.rudra.DSA.Linked_List.Circular;

import com.rudra.DSA.Linked_List.Circular.CircularLL;
public class Main_LL {
    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.display();
        list.delete(6);
        list.display();
    }
}
