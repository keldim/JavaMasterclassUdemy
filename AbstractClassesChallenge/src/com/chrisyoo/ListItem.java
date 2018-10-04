package com.chrisyoo;

import java.util.Arrays;

public abstract class ListItem {
    private ListItem previous;
    private ListItem next;
    private Number value;

    public ListItem(Number value) {
        this.value = value;
    }

    public ListItem getPrevious() {
        return previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public Number getValue() {
        return value;
    }



    public int compareTo (ListItem compare) {
        if (value.intValue() == compare.value.intValue()) {
            return 0;
        } else if (value.intValue() > compare.value.intValue()) {
            return 1;
        } else {
            return -1;
        }


    }

}
