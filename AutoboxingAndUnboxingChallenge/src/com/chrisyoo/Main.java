package com.chrisyoo;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank boa = new Bank ("Bank of America");

    public static void main(String[] args) {
        System.out.println("Welcome to Bank of America administration system!");
        boolean quit = false;
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    printAllBranches();
                    break;

                case 2:
                    printAllCustomers();
                    break;

                case 3:
                    addNewBranch();
                    break;

                case 4:
                    newCustomerToBranch();
                    break;

                case 5:
                    newTransactionCustBran();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }
    }


    private static void addNewBranch() {
        System.out.println("Enter new branch name: ");
        String name = scanner.nextLine();

        Branch newBranch = new Branch(name);
        boa.addBranch(newBranch);
    }

    private static void newCustomerToBranch() {
        System.out.println("Enter existing branch name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new customer name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new transaction for the customer: ");
        double newNumber = Double.valueOf(scanner.nextLine());
        Customer newCustomer = new Customer(newName);
        newCustomer.addTransaction(newNumber);
        boa.addBranchCustomer(name, newCustomer);
    }

    private static void newTransactionCustBran() {
        System.out.println("Enter existing branch name: ");
        String name = scanner.nextLine();
        System.out.print("Enter existing customer name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new transaction for the customer: ");
        double newNumber = Double.valueOf(scanner.nextLine());
        boa.addTransactionCustomer(name, newName, newNumber);
    }

    private static void printAllBranches() {
        boa.printBranches();
    }

    private static void printAllCustomers() {
        System.out.println("Enter existing branch name: ");
        String name = scanner.nextLine();
        boa.printBranchCustomers(name);
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print branches\n" +
                "2  - to print all customers in a branch\n" +
                "3  - to add a new branch\n" +
                "4  - to add a new customer to a branch\n" +
                "5  - to add a new transaction to a customer in a branch\n" +
                "6  - to print a list of available actions.");
    }

}
