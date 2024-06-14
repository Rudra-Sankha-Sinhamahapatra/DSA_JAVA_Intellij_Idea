package com.rudra.DSA.Stacks_and_Queues.Stacks_Queue.Easy;

public class Interview_Questions {

    //https://www.geeksforgeeks.org/problems/implement-stack-using-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-stack-using-array

    class Q1 {
        int top;
        int arr[] = new int[1000];

        Q1() {
            top = -1;
        }

        //Function to push an integer into the stack.
        void push(int a) {
            if (top == 999) {
                return;
            }
            // Your code here
            arr[++top] = a;
        }

        //Function to remove an item from top of the stack.
        int pop() {
            if (top == -1) {
                return -1;
            }
            return arr[top--];
            // Your code here
        }
    }

    class Q2 {

        int front, rear;
        int a[] = new int[100005];

        Q2() {
            front = 0;
            rear = 0;
        }

        // Function to push an element x in a queue.
        void push(int x) {
            if ((rear + 1) % 100005 == front) {
                // Queue is full;
                return;
            }
            a[rear] = x;
            rear = (rear + 1) % 100005;
        }

        // Function to pop an element from queue and return that element.
        int pop() {
            if (front == rear) {
                // Queue is empty
                return -1;
            }
            int value = a[front];
            front = (front + 1) % 100005;
            return value;
        }

    }
}
