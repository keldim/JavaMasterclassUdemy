package com.chrisyoo;

public class Vehicle {
    private boolean steering;
    private int gears;
    private int currentGear;
    private int speed;

    public Vehicle (boolean steering, int gears, int currentGear, int speed) {
        this.steering = steering;
        this.gears = gears;
        this.currentGear = currentGear;
        this.speed = speed;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSpeed() {
        return speed;
    }
}
