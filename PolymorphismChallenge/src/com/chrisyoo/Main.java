package com.chrisyoo;

class Car {
    private boolean engine;
    private boolean engineOn;
    private int cylinders;
    private int wheels;
    private int speed;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.engineOn = false;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
        this.speed = 0;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void startEngine () {
        this.engineOn = true;
        System.out.println("Engline started");
    }

    public void accelerate (int addSpeed) {
        speed += addSpeed;
        System.out.println("Speed increased");
    }

    public void brake (int subtractSpeed) {
        speed -= subtractSpeed;
        System.out.println("Speed decreased");
    }

}


class BMW extends Car {

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate(int addSpeed) {
        super.accelerate(2 * addSpeed);
    }
}

class Benz extends Car {

    public Benz(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void brake(int subtractSpeed) {
        super.brake(2 * subtractSpeed);
    }
}

class Kia extends Car {

    public Kia(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void brake(int subtractSpeed) {
        super.brake(3 * subtractSpeed);
    }
}

public class Main {

    public static void main(String[] args) {
	    Kia newKia = new Kia (6, "Optima");
	    newKia.accelerate(60);
        System.out.println(newKia.getSpeed());
	    newKia.brake(10);
        System.out.println(newKia.getSpeed());
    }
}
