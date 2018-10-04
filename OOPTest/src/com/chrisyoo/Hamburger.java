package com.chrisyoo;


import java.text.DecimalFormat;

public class Hamburger {
    private String bread;
    private String meat;
    private double price;
    private boolean lettuce;
    private boolean onion;
    private boolean sauce;
    private boolean tomato;



    public Hamburger (String bread, String meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        System.out.println("A new burger created with " + bread + " and " + meat);

    }

    public void addSubtractPrice(double number, String addOrSubtract) {
        if (addOrSubtract == "add") {
            price += number;
        } else if (addOrSubtract == "subtract") {
            price -= number;
        }
    }

    public void addLettuce() {
        price += 0.25;
        lettuce = true;
        System.out.println("lettuce added");
    }

    public void addOnion() {
        price += 0.25;
        onion = true;
        System.out.println("onion added");
    }

    public void addTomato() {
        price += 0.25;
        tomato = true;
        System.out.println("tomato added");
    }

    public void addSauce() {
        price += 0.25;
        sauce = true;
        System.out.println("sauce added");
    }

    public void removeLettuce() {
        price -= 0.25;
        lettuce = false;
        System.out.println("lettuce removed");
    }

    public void removeOnion() {
        price -= 0.25;
        onion = false;
        System.out.println("onion removed");
    }

    public void removeTomato() {
        price -= 0.25;
        tomato = false;
        System.out.println("tomato removed");
    }

    public void removeSauce() {
        price -= 0.25;
        sauce = false;
        System.out.println("sauce removed");
    }

    public void totalItems () {
        String items = bread + ", " + meat;
        if (lettuce) {
            items += ", lettuce";
        }
        if (onion) {
            items += ", onion";
        }
        if (tomato) {
            items += ", tomato";
        }
        if (sauce) {
            items += ", sauce";
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The total price is " + df.format(price) + ", and the list of items is: " + items);
    }


    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isSauce() {
        return sauce;
    }

    public boolean isTomato() {
        return tomato;
    }
}
