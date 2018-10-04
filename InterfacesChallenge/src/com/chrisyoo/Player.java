package com.chrisyoo;

import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private String health;
    private String age;
    private ArrayList<String> saved;

    public Player(String name, String health, String age) {
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    @Override
    public void valuesToBeSaved(ArrayList<String> values) {
        saved = values;
        System.out.println("values are successfully saved");
    }

    @Override
    public void valuesToBeUpdated() {
        name = saved.get(0);
        health = saved.get(1);
        age = saved.get(2);

        System.out.println("name updated to " + name);
        System.out.println("health updated to " + health);
        System.out.println("age updated to " + age);
    }

    @Override
    public String toString() {
        return "name: " + name + "\nhealth: " + health+ "\nage: " + age;
    }
}