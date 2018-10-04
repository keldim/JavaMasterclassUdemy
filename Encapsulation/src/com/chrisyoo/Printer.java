package com.chrisyoo;

public class Printer {
    private int tonerLevel;
    private int pages;
    private boolean duplex;

    public Printer(int tonerLevel, int pages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pages = pages;
        this.duplex = duplex;
    }

    public void fillToner (int addToner) {
        if (tonerLevel == 100) {
            System.out.println("Toner already full, no more toner can be added");
        } else if ((tonerLevel + addToner) < 100 ) {
            tonerLevel += addToner;
            System.out.println("Toner level is now " + tonerLevel);
        } else if ((tonerLevel + addToner) >= 100) {
            tonerLevel = 100;
            System.out.println("Toner level is full, it is now " + tonerLevel);
        }
    }

    public void pagesPrinted (int addPage) {
        pages += addPage;
        System.out.println("Total pages printed: " + pages);
    }
}
