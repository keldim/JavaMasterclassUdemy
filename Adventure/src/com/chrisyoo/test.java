package com.chrisyoo;

public class test {
    public static void main(String[] args) {
        String[] building = "You / hello / there".split(" ");
            for (String i : building) {
                if (i.contains("You")) {
                    System.out.println("word found");
                } else {
                    System.out.println("contains not working");
                }
            }


    }
}
