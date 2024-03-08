package com.rudra.DSA.Linked_List.Circular;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void  insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node node=head;
        if(head!=null){
            do {
                System.out.print(node.val+"->");
              if(node.next!=null) {
                  node = node.next;
              }
            }while(node!=head);
            System.out.println("HEAD");
        }
    }
    public void delete(int val){
        Node node=head;
        //if the linked list is empty
        if(node==null){
            return;
        }
        //if you want to delete the head node
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        //if you want to delete any other node
        do{
            Node n=node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }
    private class Node{
        int val;
        Node next;

        public Node(int value) {
            this.val = value;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
