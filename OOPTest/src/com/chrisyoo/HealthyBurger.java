package com.chrisyoo;

import java.text.DecimalFormat;

public class HealthyBurger extends Hamburger {
    private boolean spinach;
    private boolean lowCalSauce;

    public HealthyBurger(String meat, double price) {
        super("brown rye bread roll", meat, price);
    }

    public void addSpinach() {
        addSubtractPrice(0.25, "add");
        spinach = true;
        System.out.println("spinach added");
    }

    public void addLowCalSauce() {
        addSubtractPrice(0.25, "add");
        lowCalSauce = true;
        System.out.println("low calorie sauce added");
    }

    public void removeSpinach() {
        addSubtractPrice(0.25, "subtract");
        spinach = false;
        System.out.println("spinach removed");
    }

    public void removeLowCalSauce() {
        addSubtractPrice(0.25, "subtract");
        lowCalSauce = false;
        System.out.println("low calorie sauce removed");
    }

    @Override
    public void totalItems () {
        String items = getBread() + ", " + getMeat();
        if (isLettuce()) {
            items += ", lettuce";
        }
        if (isOnion()) {
            items += ", onion";
        }
        if (isTomato()) {
            items += ", tomato";
        }
        if (isSauce()) {
            items += ", sauce";
        }
        if (spinach) {
            items += ", spinach";
        }
        if (lowCalSauce) {
            items += ", low calorie sauce";
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("The total price is " + df.format(getPrice()) + ", and the list of items is: " + items);
    }
}
