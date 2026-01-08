package com.structures.lists;
import com.structures.utils.Contact;
import java.util.ArrayList;

import java.util.Optional;
import java.util.Scanner;

public class ContactSystem {
    public static void main(String[] args) {

      // variable creation
        Scanner scan = new Scanner(System.in);

      // Create vector with capacity for 20 contacts;
        ArrayList<Contact> list = new ArrayList<>(20);

      // Create and add 30 contacts;
        createContactsDynamically(5, list);

      // Menu
        int option = 1;

        while (option != 0) {
            option = getMenuOption(scan);

            switch (option) {
                case 1:
                    addContactAtEnd(list, scan);
                    break;
                case 2:
                    addContactAtIndex(list, scan);
                    break;
                case 3:
                    getContactByIndex(list, scan);
                    break;
                case 4:
                    getContact(list, scan);
                    break;
                case 5:
                    getLastIndex(list, scan);
                    break;
                case 6:
                    checkIfContactExists(list, scan);
                    break;
                case 7:
                    removeByPosition(list, scan);
                    break;
                case 8:
                    removeContact(list, scan);
                    break;
                case 9:
                    printVectorSize(list);
                    break;
                case 10:
                    clearVector(list);
                    break;
                case 11:
                    printVector(list);
                    break;
            }
        }
        System.out.println("The user entered 0, and the program was terminated.");
    }

    private static void printVector(ArrayList<Contact> list) {
        System.out.println(list);
    }

    private static void clearVector(ArrayList<Contact> list) {
        list.clear();
        System.out.println("All vector contacts have been removed.");
    }

    private static void printVectorSize(ArrayList<Contact> list) {
        System.out.println("The size of the vector is " + list.size());
    }

    private static void removeContact(ArrayList<Contact> list, Scanner scan) {
        String name = readInformation("Enter the name of the contact to ", scan);
        Optional<Contact> contactToRemove = list.stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst();

        if (contactToRemove.isPresent()) {
            list.remove(contactToRemove.get());
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }


    private static void removeByPosition(ArrayList<Contact> list, Scanner scan) {
        int pos = readInformationInt("Enter the position to remove", scan);

        try {
            list.remove(pos);
            System.out.println("Contact " + pos + " removed.");

        } catch (Exception e) {
            System.out.println("Invalid position.");
        }
    }

    private static void checkIfContactExists(ArrayList<Contact> list, Scanner scan) {
        int pos = readInformationInt("Enter the position to search for", scan);

        try {
            Contact contact = list.get(pos);
            boolean exist = list.contains(contact);

            if(exist) {
                System.out.println("Contact exists, details follow: ");
                System.out.println(contact);
            } else  {
                System.out.println("Contact does not exist");
            }

        } catch (Exception e) {
            System.out.println("Invalid position.");
        }
    }

    private static void getLastIndex(ArrayList<Contact> list, Scanner scan) {
        int pos = readInformationInt("Enter the position to search for", scan);

        try {
            Contact contact = list.get(pos);

            System.out.println("Contact exists, details follow: ");
            System.out.println(contact);

            System.out.println("Searching for last index of the contact found: ");
            pos = list.lastIndexOf(contact);

            System.out.println("Contact found at position: " + pos);
        } catch (Exception e) {
            System.out.println("Invalid position.");
        }
    }
    private static void getContact(ArrayList<Contact> list, Scanner scan) {
        String name = readInformation("Enter the name of the contact to remove: ", scan);


        try {
            Optional<Contact> contactToFind = list.stream()
                    .filter(contact -> contact.getName().equals(name))
                    .findFirst();

            System.out.println("Contact exists, details follow: ");
            System.out.println(contactToFind);

            System.out.println("Searching for contact index: ");
            int pos = list.indexOf(contactToFind);

            System.out.println("Contact found at position: " + pos);
        } catch (Exception e) {
            System.out.println("Invalid position.");
        }
    }

    private static void getContactByIndex(ArrayList<Contact> list, Scanner scan) {
        int pos = readInformationInt("Enter the position to search for", scan);

        try {
            Contact contact = list.get(pos);

            System.out.println("Contact exists, details follow: ");
            System.out.println(contact);
        } catch (Exception e) {
            System.out.println("Invalid position.");
        }
    }

    private static void addContactAtEnd(ArrayList<Contact> list, Scanner scan) {
        System.out.println("Creating a contact, enter with the information:");
        String name = readInformation("Enter the name", scan);
        String phone = readInformation("Enter the phone number", scan);
        String email = readInformation("Enter the email ", scan);

        Contact contact = new Contact(name, phone, email);
        list.add(contact);

        System.out.println("Contact added successfully.");

    }

    private static void addContactAtIndex(ArrayList<Contact> list, Scanner scan) {
        System.out.println("Creating a contact, enter with the information:");
        String name = readInformation("Enter the name", scan);
        String phone = readInformation("Enter the phone number", scan);
        String email = readInformation("Enter the email ", scan);

        Contact contact = new Contact(name, phone, email);

        int index = readInformationInt("Specify the location to add the contact.", scan);

        try {
            list.add(index, contact);
            System.out.println("Contact added successfully.");
            System.out.println(contact);
        } catch (Exception e) {
            System.out.println("Invalid index, contact was not added.");
        }
    }

    private static int readInformationInt(String msg, Scanner scan) {

        boolean validInput = false;
        int num = 0;
        while (!validInput) {
            try {
                System.out.println(msg);
                String input = scan.nextLine();
                num = Integer.parseInt(input);
                validInput = true; // if the previously line got an exception, this line will be not executed;
            } catch (Exception e){
                System.out.println("Invalid input. Please try again.");
            }
        }

        return num;
    }

    private static String readInformation(String msg, Scanner scan) {

        System.out.println(msg);
        return scan.nextLine();
    }

    private static int getMenuOption(Scanner scan) {

        boolean validentry = false;
        int option = 0;
        String input;

        while (!validentry) {
        System.out.println("Insert what you want to do: ");
        System.out.println("1.  Add a contact at the end of the vector");
        System.out.println("2.  Add a contact in a specific position");
        System.out.println("3.  Obtains a contact by its position");
        System.out.println("4.  Search for a contact by name");
        System.out.println("5.  Find the last position of a contact by name");
        System.out.println("6.  Check if the contact exists.");
        System.out.println("7.  Removes a contact by it position");
        System.out.println("8.  Removes a contact by name");
        System.out.println("9.  Check for the size of the vector");
        System.out.println("10. Reset the vector");
        System.out.println("11. Print Vector");
        System.out.println("0.  Exit");

        try {
            input = scan.nextLine();
            option = Integer.parseInt(input);

            if(option >= 0 && option <= 11) {
                validentry = true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("Invalid input, try again\n\n");
        }
        }
        return option;
    }

    private static void createContactsDynamically(int size, ArrayList<Contact> list){
        Contact contact;

        for(int i =0; i <size; i++){

            contact = new Contact();
            contact.setName("Contact "+i);
            contact.setEmail("email"+i);
            contact.setPhoneNumber("phoneNumber"+i);

            list.add(contact);

        }
    }
}
