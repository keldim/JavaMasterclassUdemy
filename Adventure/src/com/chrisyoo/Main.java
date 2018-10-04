package com.chrisyoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();


    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);



        Map<String, Integer>tempExit = new HashMap<>();
	    locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExit));






        tempExit = new HashMap<>();
        tempExit.put("W / WEST",2);
        tempExit.put("E / EAST",3);
        tempExit.put("S / SOUTH",4);
        tempExit.put("N / NORTH",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N / NORTH",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W / WEST",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N / NORTH",1);
        tempExit.put("W / WEST",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S / SOUTH",1);
        tempExit.put("W / WEST",2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));



        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S / SOUTH");
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String[] direction = scanner.nextLine().split(" ");
            String directionFound = "Not Found";
            for (int i = 0; i < direction.length; i++) {
                System.out.println(direction[i].toUpperCase());
                System.out.println(direction[i]);
                if (direction[i].toUpperCase().equals("N") || direction[i].toUpperCase().equals("S") || direction[i].toUpperCase().equals("E") || direction[i].toUpperCase().equals("W") || direction[i].toUpperCase().equals("Q")) {
                    directionFound = direction[i];
                    break;
                } else if (direction[i].toUpperCase().equals("NORTH") || direction[i].toUpperCase().equals("SOUTH") || direction[i].toUpperCase().equals("EAST") || direction[i].toUpperCase().equals("WEST") || direction[i].toUpperCase().equals("QUIT")) {
                    directionFound = direction[i];
                    break;
                }
            }

            System.out.println(directionFound);

            for (String exit : exits.keySet()) {
                System.out.println(exit);
                if (exit.contains(directionFound.toUpperCase())) {
                    loc = exits.get(exit);
                    System.out.println("Next Destination Found");
                    break;
                }
            }

//            if (exits.containsKey(direction)) {
//                loc = exits.get(direction);
//            } else {
//                System.out.println("You cannot go in that direction");
//            }
        }

//

        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.







//            String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//            for (String i : road) {
//                System.out.println(i);
//            }
//
//            System.out.println("==================================");
//
//            String[] building = "You are inside a building, a well house for a small spring".split(", ");
//            for (String i : building) {
//                System.out.println(i);
//            }



//        Here is your challenge and the challenges to work out what is wrong with the location constructor that would
//        allow the program to compile and crash at runtime so when you identify the problem modify the code to fix it so
//        I just i’ll just say that again your challenge here is to work out what is wrong with the location constructor
//        that you can see on screen line 14 that will allow the program to compile but crash on run time when you identify
//        the problem modify the code to fix it.
//


    }
}
