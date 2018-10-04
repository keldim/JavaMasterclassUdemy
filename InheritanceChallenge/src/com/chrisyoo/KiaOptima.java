package com.chrisyoo;

public class KiaOptima extends Car{
    private String color;
    private String fuelType;
    private int cost;

    public KiaOptima (String color, String fuelType, int cost) {
        super(4, true, 1);
        this.color = color;
        this.fuelType = fuelType;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCost() {
        return cost;
    }
}
