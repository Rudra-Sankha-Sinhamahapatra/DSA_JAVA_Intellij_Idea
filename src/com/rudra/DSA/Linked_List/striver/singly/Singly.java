package com.rudra.DSA.Linked_List.striver.singly;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Singly{

    public Node insertHead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }


    Node insertAtEnd(Node head, int x) {
        // code here
        Node node = new Node(x);
        if (head ==null) {
            return node;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    Node insertAtPosition(Node head, int position, int value) {
        Node newNode = new Node(value);

        if (position == 0) {
           return insertHead(head,value);
        }

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Position out of bounds.");
        }
        return head;
    }

    Node deleteFirst (Node head) {
        if(head == null) {
            System.out.println("Linked List is empty nothig to delete");
            return null;
        }
        Node temp = head;
        head = head.next;
        System.out.println("Deleted "+temp.data);
        return head;
    }

    Node deleteLast (Node head) {
        if(head==null){
          return null;
        }

        else if(head.next==null){
            return null;
        }

        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        System.out.println("Deleted " + temp.next.data);
        temp.next = null;
        return head;
    }

    int size (Node head) {
        if(head == null) {
            System.out.println("null");
            return 0;

        }
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    Node get (Node head,int index){
        Node node = head;
      for(int i = 0 ;i<index;i++){
          node = node.next;
      }
        return node;
    }

    Node deleteIndex (Node head,int index) {
     if(head == null) {
         return null;
     }
        int size = size(head);
     if(index<0 || index>=size){
         System.out.println("Invalid index "+index);
         return head;
     }
     if(index == 0) {
         return deleteFirst(head);
     }
    else if(index == size -1 ){
        return deleteLast(head);
     }
     Node prev = get(head,index - 1);
     int val = prev.next.data;
     prev.next = prev.next.next;
        System.out.println("Deleted " + val + " from index " + index);
     return head;
    }

    // Display linked list for testing
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Singly sol = new Singly();

        Node head = null;

        // Insert elements into the linked list
        head = sol.insertHead(head, 1);
        head = sol.insertHead(head, 2);
        head = sol.insertHead(head, 3);
        head = sol.insertAtEnd(head,34);
        head = sol.insertAtPosition(head,3,67);
        // Print the linked list
        sol.printList(head);  // Output: 3 -> 2 -> 1 -> 67 -> 34 -> null
        head = sol.deleteFirst(head);
        sol.printList(head); // Output: 2 -> 1 -> 67 -> 34 -> null
        head = sol.deleteLast(head);
        sol.printList(head);// Output: 2 -> 1 -> 67 -> null
        head = sol.deleteIndex(head,0);
        sol.printList(head);//Output: 1 -> 67 -> null
    }
}
