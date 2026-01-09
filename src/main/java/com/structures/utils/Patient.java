package com.structures.utils;

/*
    This class will be used to demonstrate priority queues
 */
public class Patient implements Comparable {

    private String name;
    private int priority;


    public Patient(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public Patient(){};

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return this.priority = priority;
    }

    @Override
    public int compareTo(Object o) {

        // obj1 > obj2 ? 1 : 0
        // We'll use priority to compare the objects

        if(this.priority > ((Patient)o).getPriority()){
          return 1;
        } else if(this.priority < ((Patient)o).getPriority()){
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
