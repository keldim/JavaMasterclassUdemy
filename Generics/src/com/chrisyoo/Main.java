package com.chrisyoo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //ArrayList items = new ArrayList(); //without generics
        ArrayList<Integer> items = new ArrayList<Integer>(); //with generics

	    items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled (ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}
