package com.structures.utils;


public class Contact {

    private String name;
    private String email;
    private String phoneNumber;


    // All Args Constructor

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // No Args Constructor
    public Contact(){};


    public Object getName(){
        return this.name;
    }

    public Object getEmail(){
        return this.email;
    }

    public Object getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
