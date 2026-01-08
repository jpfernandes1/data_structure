package com.structures;

/*
    This is a Super class that contains all the basic model for all the kinds of data stucture:
 */

public class StaticStructure<T>{

    private T[] elements;
    private int size;

    public StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public StaticStructure() {
        this(10);
    }

    /* Protected, so that only classes belonging to the base package and its children can see;
        We need to use this because in Stack and Queue we can't add elements in any position.
     */
    protected boolean add(T element) {
        this.increaseCapacity();
        if(this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    protected boolean add(int index, T element) {
        if(!(index >= 0 && index < this.size)) {
            throw new IllegalArgumentException("Invalid index");
        }

        this.increaseCapacity();

        for(int i = size-1; i>=index ;i--){
            this.elements[i+1] = this.elements[i];
        }
        this.elements[index] = element;
        size++;

        return true;
    }

    private void increaseCapacity() {
        if(this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[this.elements.length*2];
            for(int i=0; i<this.elements.length; i++){
                newElements[i] = this.elements[i];
            }
        this.elements = newElements;}
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

            for(int i=0; i<size-1; i++){
                s.append(this.elements[i]);
                s.append(", ");
            }
            if (this.size > 0) {
                s.append(this.elements[size-1]);
            }

            s.append("]");
            return s.toString();
    }


}
