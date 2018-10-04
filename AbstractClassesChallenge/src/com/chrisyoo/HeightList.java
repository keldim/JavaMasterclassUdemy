package com.chrisyoo;

import java.util.LinkedList;

public class HeightList {
    private LinkedList<Height> allHeights;
    private ListItem head;

    public HeightList() {
        this.allHeights = new LinkedList<Height>();
    }

    public void addItem (Height height) {
        if (findItem(height) != -1) {
            System.out.println("The item already exists, cannot add");
            return;
        } else {
            if (allHeights.isEmpty()) {
                allHeights.add(height);
                head = height;
                System.out.println("Successfully added to an empty list");
                return;
            }
            ListItem current = head;
            boolean check = false;
            do {
                if (current.compareTo(height) == 0) {
                    if (current == head) {
                        current.setPrevious(height);
                        height.setNext(current);
                        allHeights.add(allHeights.indexOf(current), height);
                        head = height;
                        check = true;
                        System.out.println("Successfully added");
                    } else {
                        height.setPrevious(current.getPrevious());
                        current.getPrevious().setNext(height);
                        current.setPrevious(height);
                        height.setNext(current);
                        allHeights.add(allHeights.indexOf(current), height);
                        check = true;
                        System.out.println("Successfully added");
                    }
                } else if (current.compareTo(height) == 1) {
                    if (current == head) {
                        height.setNext(current);
                        current.setPrevious(height);
                        allHeights.add(0, height);
                        head = height;
                        check = true;
                        System.out.println("Successfully added");
                    } else {
                        height.setNext(current);
                        height.setPrevious(current.getPrevious());
                        current.getPrevious().setNext(height);
                        current.setPrevious(height);
                        allHeights.add(allHeights.indexOf(current), height);
                        check = true;
                        System.out.println("Successfully added");
                    }
                } else if (current.compareTo(height) == -1) {
                    if (current.getNext() != null) {
                        current = current.getNext();
                    } else {
                        current.setNext(height);
                        height.setPrevious(current);
                        allHeights.add(allHeights.indexOf(current)+1, height);
                        check = true;
                        System.out.println("Successfully added");
                    }
                } else {
                    System.out.println("cannot add item");
                    return;
                }
            } while (check == false);
        }
    }

    public void removeItem (Height height) {
        if (findItem(height) == -1) {
            System.out.println("The item does not exist, cannot delete");
            return;
        } else {
            if (height.getPrevious() == null) {
                height.getNext().setPrevious(null);
                head = height.getNext();
                height.setNext(null);
                allHeights.remove(0);
                System.out.println("Successfully removed");
            } else if (height.getNext() == null) {
                height.getPrevious().setNext(null);
                height.setPrevious(null);
                allHeights.remove(allHeights.size()-1);
                System.out.println("Successfully removed");
            } else {
                height.getPrevious().setNext(height.getNext());
                height.getNext().setPrevious(height.getPrevious());
                height.setPrevious(null);
                height.setNext(null);
                allHeights.remove(allHeights.indexOf(height));
                System.out.println("Successfully removed");
            }
        }
    }

    public int findItem (Height height) {
        for (int i=0; i < allHeights.size(); i++) {
            if (allHeights.get(i).getValue() == height.getValue()) {
                return i;
            }
        }
        return -1;
    }

    public void printItems () {
        for (int i=0; i<allHeights.size(); i++) {
            System.out.println(allHeights.get(i).getValue());
        }
    }

    public ListItem getHead() {
        return head;
    }
}
