package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
	    thePC.powerUp();

	    Room newRoom = new Room(new Bathroom(true, true), new Chair(4, "wood"), new Desk ("Italian", 20, 40));
	    newRoom.presentCondition();


    }
}
