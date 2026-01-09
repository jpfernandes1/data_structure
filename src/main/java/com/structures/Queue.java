package com.structures;

/*
    Queue is an Array that has the behavior FIFO: First in, First Out;
 */

public class Queue<T> extends StaticStructure<T> {

    public Queue(){
        super();
    }

    public Queue(int initialCapacity){
        super(initialCapacity);
    }

    public boolean add(T element){
        return super.add(element);
    };


    public boolean isEmpty(){
        return super.isEmpty();
    }

    public T peek(){
        int pos = 0;
        return super.getElementByIndex(pos);
    }

    public T remove(){
        int pos = 0;
        return super.remove(pos);
    }

    public int size(){
        return super.size();
    }

    public String toString(){
        return super.toString();
    }
}
