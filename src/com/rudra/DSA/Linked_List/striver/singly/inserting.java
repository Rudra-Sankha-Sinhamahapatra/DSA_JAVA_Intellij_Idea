package com.rudra.DSA.Linked_List.striver.singly;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class  inserting{

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
        inserting sol = new inserting();

        Node head = null;

        // Insert elements into the linked list
        head = sol.insertHead(head, 1);
        head = sol.insertHead(head, 2);
        head = sol.insertHead(head, 3);
        head = sol.insertAtEnd(head,34);
        // Print the linked list
        sol.printList(head);  // Output: 1 -> 2 -> 3 -> null
    }
}
