package com.rudra.DSA.Stacks_and_Queues.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque();
        deque.add(2);
        deque.add(3);
        deque.addLast(2);
        deque.addFirst(4);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
    }
}
