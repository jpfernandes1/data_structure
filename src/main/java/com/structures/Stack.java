package com.structures;

/*
    It is an Array that has the behavior LIFO: Last in, First Out;
 */
public class Stack<T> extends StaticStructure<T> {

    /*
        This uses the no args constructor on mother class, that
        creates a stack with size 10;
     */
    public Stack(){
        super();
    }

    /*
        This uses the other constructor where we can set the Stack capacity
     */
    public Stack(int capacity){
        super(capacity);
    }

    /*
        This method adds an element to the end of the collection
     */
    public void push(T element){
        super.add(element);
    }

    /*
        This method returns the current size of the Stack
     */
    public int size(){
        return super.size();
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }

    /*
        Returns the element at the top of the Stack
     */

    public T peek() {
       int pos = size() - 1;
        return super.getElementByIndex(pos);
    }

    /*
        Removes the element at the top of the Stack
     */

    public T pop(){
        int pos = size() - 1;
        return super.remove(pos);
    }



}
