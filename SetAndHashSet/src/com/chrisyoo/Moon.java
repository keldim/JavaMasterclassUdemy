package com.chrisyoo;

public class Moon extends HeavenlyBody {


    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        super.setBodyType("Moon");
    }


}
