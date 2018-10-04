package com.chrisyoo;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        super.setBodyType("Planet");
    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (moon instanceof Moon) {
            return super.getSatellites().add(moon);
        } else {
            System.out.println("Sorry, only moons can be added");
            return false;
        }
    }
}
