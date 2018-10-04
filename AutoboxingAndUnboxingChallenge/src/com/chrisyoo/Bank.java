package com.chrisyoo;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch (Branch branch) {
        if (findBranch(branch.getName()) >= 0) {
            System.out.println(branch.getName() + " already exists, cannot add");
        } else {
            this.branches.add(branch);
            System.out.println(branch.getName() + " successfully added to " + name);
        }
    }

    public void addBranchCustomer (String branch, Customer customer) {
        if (findBranch(branch) < 0) {
            System.out.println("Such branch does not exist");
        } else {
            System.out.println(branch + " found");
            branches.get(findBranch(branch)).addCustomer(customer);
        }
    }

    public void addTransactionCustomer (String branchName, String customerName, double transaction) {
        if (findBranch(branchName) < 0) {
            System.out.println("Such branch does not exist");
        } else {
            System.out.println(branchName + " found");
                branches.get(findBranch(branchName)).addTransactionCust(customerName, transaction);
        }
    }


    private int findBranch (String name) {
        for (int i=0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void printBranchCustomers (String branch) {
        if (findBranch(branch) < 0) {
            System.out.println("Such branch does not exist");
        } else {
            System.out.println(branch + " found");
            branches.get(findBranch(branch)).printCustomers();
        }
    }

    public void printBranches () {
        if (branches.isEmpty()) {
            System.out.println("No branches");
            return;
        }
        for (int i=0; i < branches.size(); i++) {
            System.out.println((i+1) + ". " + branches.get(i).getName());
        }
    }

}
