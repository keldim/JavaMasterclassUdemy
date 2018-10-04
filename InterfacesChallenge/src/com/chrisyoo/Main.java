package com.chrisyoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player chris = new Player("Chris", "100", "25");
        System.out.println(chris.toString());
        chris.valuesToBeSaved(readValues());
        chris.valuesToBeUpdated();
        System.out.println(chris.toString());
    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter values\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter name: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    System.out.print("Enter health: ");
                    stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    System.out.print("Enter age: ");
                    stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index=0;
                    break;
            }
        }
        return values;
    }

    public static void savePlayValues (Player player, ArrayList<String> values) {

        player.valuesToBeSaved(values);

    }


    public static void updatePlayValues (Player player) {
        player.valuesToBeUpdated();
    }



    public static void saveMonValues (Monster monster, ArrayList<String> values) {
        monster.valuesToBeSaved(values);


    }


    public static void updateMonValues (Monster monster) {
        monster.valuesToBeUpdated();
    }


}
