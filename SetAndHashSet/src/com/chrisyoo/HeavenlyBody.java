package com.chrisyoo;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private String bodyType;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = null;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return this.satellites;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals (Object obj) {

        if (this == obj) {
            System.out.println("true!!!!");
            return true;

        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        if ((obj == null) || (obj.getClass() != this.getClass())) {

            System.out.println("false!!!!");
            return false;

        }

        String objName = ((HeavenlyBody) obj).getName();
        System.out.println("actually compared???");
        return this.name.equals(objName);


    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called " + (this.name.hashCode()+this.getClass().hashCode()) + " for " + this.name);
        return (this.name.hashCode()+this.getClass().hashCode());
    }
}
