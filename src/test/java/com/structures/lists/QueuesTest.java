package com.structures.lists;

import com.structures.Queue;

public class QueuesTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<Integer>(6);

        queue.add(10);
        queue.add(5);
        queue.add(7);
        queue.add(3);

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue.toString());

    }
}
