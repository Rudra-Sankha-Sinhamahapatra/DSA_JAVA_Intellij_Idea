package com.rudra.DSA.Stacks_and_Queues.Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack=new CustomStack(5);
        CustomStack stack=new DynamicStack(5);
        stack.push(34);
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(24);
        stack.push(31);




        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
