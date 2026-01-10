package com.structures.queues;

public class PriorityQueue<T> extends Queue<T> {

    /*
        To prioritize a queue, only the add method must be different.
     */

    @Override
    public boolean add(T element){

        Comparable<T> key = (Comparable<T>) element;
        int i;
        T[] allElements = getAllElements();

        for (i=0; i<size(); i++){
            if(key.compareTo(allElements[i]) < 0){
                break;
            }
        }

        if (size() == 0 || i == size()) {
            // Adds the element to the end if the queue is empty or element has lower priority
            return super.add(element);
        } else {

        return super.add(i, element);
        }
    }

}
