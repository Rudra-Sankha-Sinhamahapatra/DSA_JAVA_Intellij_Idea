package com.rudra.DSA.Stacks_and_Queues.Stacks;

import java.util.Stack;

public class inBuiltExamples_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
