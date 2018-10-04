package com.chrisyoo;

public class Desk {
    private String style;
    private int width;
    private int length;

    public Desk(String style, int width, int length) {
        this.style = style;
        this.width = width;
        this.length = length;
    }

    public void deskStyle () {
        System.out.println("There is a desk with an Italian style design");
    }


}
