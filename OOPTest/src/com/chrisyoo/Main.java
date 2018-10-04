package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
	    Hamburger beefBurger = new Hamburger ("regular bread roll", "beef patty", 4.00);
	    beefBurger.addLettuce();

	    beefBurger.addTomato();
	    beefBurger.totalItems();
    }
}
