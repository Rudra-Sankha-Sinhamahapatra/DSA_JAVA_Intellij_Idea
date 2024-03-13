package com.rudra.DSA.Stacks_and_Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(5);
        queue.add(3);
        queue.add(9);
        queue.add(8);
        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
