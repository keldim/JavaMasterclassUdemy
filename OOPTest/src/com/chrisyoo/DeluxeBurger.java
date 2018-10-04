package com.chrisyoo;

import java.text.DecimalFormat;

public class DeluxeBurger extends Hamburger{
    private boolean drink;
    private boolean chips;

    public DeluxeBurger(String bread, String meat, double price) {
        super(bread, meat, price);
    }

    public void addDrink() {
        drink = true;
        addSubtractPrice(0.50, "add");
        System.out.println("drink added");
    }

    public void addChips() {
        chips = true;
        addSubtractPrice(0.50, "add");
        System.out.println("chips added");
    }

    public void removeDrink() {
        drink = false;
        addSubtractPrice(0.25, "subtract");
        System.out.println("drink removed");
    }

    public void removeChips() {
        chips = false;
        addSubtractPrice(0.25, "subtract");
        System.out.println("chips removed");
    }

    @Override
    public void addLettuce() {
        System.out.println("no lettuce can be added");
    }

    @Override
    public void addOnion() {
        System.out.println("no onion can be added");
    }

    @Override
    public void addTomato() {
        System.out.println("no tomato can be added");
    }

    @Override
    public void addSauce() {
        System.out.println("no sauce can be added");
    }

    @Override
    public void totalItems () {
        String items = getBread() + ", " + getMeat();
        if (drink) {
            items += ", drink";
        }
        if (chips) {
            items += ", chips";
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The total price is " + df.format(getPrice()) + ", and the list of items is: " + items);
    }
}
