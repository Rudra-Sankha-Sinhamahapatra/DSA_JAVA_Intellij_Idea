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
        sol.printList(head);  // Output: 1 -> 2 -> 3 -> null
    }
}
