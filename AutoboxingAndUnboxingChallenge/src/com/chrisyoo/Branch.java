package com.chrisyoo;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public void addCustomer (Customer customer) {
        if (findCustomer(customer.getName()) >= 0) {
            System.out.println(customer.getName() + " already exists, cannot add");
        } else {
            this.customers.add(customer);
            System.out.println("A new customer is added to " + name);
        }

    }


    public void addTransactionCust (String name, double transaction) {
        if (findCustomer(name) < 0) {
            System.out.println("Such customer does not exist");
        } else {
            customers.get(findCustomer(name)).addTransaction(transaction);
        }
    }

    private int findCustomer (String name) {
        for (int i=0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void printCustomers () {
        if (customers.isEmpty()) {
            System.out.println("No customers");
            return;
        }
        for (int i=0; i < customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            System.out.println((i+1) + ". " + currentCustomer.getName());
            for (int j=0; j < currentCustomer.getTransactions().size(); j++) {
                System.out.println("\t" + currentCustomer.getTransactions().get(j));
            }
        }
    }


}
