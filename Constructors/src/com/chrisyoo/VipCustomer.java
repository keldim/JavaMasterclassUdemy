package com.chrisyoo;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer () {
        this("Chris Yoo", 5000, "woyoo@umich.edu");
    }

    public VipCustomer (String name, int creditLimit) {
        this(name, creditLimit, "woyoo@umich.edu");
    }

    public VipCustomer (String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
