package com.chrisyoo;



public class Car extends Vehicle {
    private int wheels;
    private boolean windows;
    private int trunk;


    public Car (int wheels, boolean windows, int trunk) {
        super(true, 5, 0, 70);
        this.wheels = wheels;
        this.windows = windows;
        this.trunk = trunk;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isWindows() {
        return windows;
    }

    public int getTrunk() {
        return trunk;
    }
}
