package com.structures.lists;

import com.structures.PriorityQueue;
import com.structures.utils.Patient;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<Patient> priorityQueue = new PriorityQueue<Patient>();
        priorityQueue.add(new Patient("Mary", 2));
        priorityQueue.add(new Patient("Paul", 4));
        priorityQueue.add(new Patient("Jane", 3));
        priorityQueue.add(new Patient("John", 1));

        System.out.println(priorityQueue);
    }
}
