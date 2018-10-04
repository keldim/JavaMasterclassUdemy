package com.chrisyoo;

import java.util.ArrayList;

public class Contacts {
   private ArrayList<String> contacts = new ArrayList<String>();


    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void addContact (String name, String number) {
       String subContact = name + " / " + number;
       if (findItem(name) >= 0) {
           System.out.println("Contact already exists, cannot add");
       } else {
           contacts.add(subContact);
           System.out.println("Contact successfully added");
       }
   }

   public void printContact () {
       System.out.println("You have " + contacts.size() + " contacts in your list");
       for (int i=0; i < contacts.size(); i++) {
           System.out.println((i+1) + ". " + contacts.get(i));
       }
   }

   private int findItem (String name) {

       for (int i=0; i < contacts.size(); i++) {
           if (contacts.get(i).contains(name)) {
               return i;
           }
           continue;
       }
       return -1;
   }

   public void removeContact (String name) {
        int position = findItem(name);
        if (position >=0) {
            removeContact(position);
        } else {
            System.out.println("Contact not found, cannot delete");
        }

   }

   private void removeContact (int position) {
        contacts.remove(position);
        System.out.println("Contact successfully deleted");
   }

   public void modifyContact (String name, String newName, String newwNumber) {
        String subContact = newName + " / " + newwNumber;
        int position = findItem(name);
       if (position >=0) {
           modifyContact(position, subContact);
       } else {
           System.out.println("Contact not found, cannot modify");
       }
   }

   private void modifyContact (int position, String newItem) {
        contacts.set(position, newItem);
       System.out.println("Contact successfully modified");
   }

    public boolean onFile (String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

}
