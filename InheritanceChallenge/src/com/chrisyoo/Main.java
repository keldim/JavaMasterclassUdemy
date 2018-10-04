package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
	    KiaOptima newOptima = new KiaOptima("black", "gasoline", 35000);
        System.out.println(newOptima.getCurrentGear());
        System.out.println(newOptima.getSpeed());
	    newOptima.setCurrentGear(3);;
	    newOptima.setSpeed(80);
        System.out.println(newOptima.getCurrentGear());
        System.out.println(newOptima.getSpeed());
        System.out.println(newOptima.getCost());
        System.out.println(newOptima.getFuelType());
        System.out.println(newOptima.getGears());
    }
}
