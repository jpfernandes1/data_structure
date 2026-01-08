package com.structures.lists;

import com.structures.Stack;

public class StacksTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
    }

}
