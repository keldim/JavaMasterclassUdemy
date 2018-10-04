package com.chrisyoo;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount () {
        //you can call another constructor within a constructor, you can do this in the first line
        this("12347890", 6000, "Paul Singer", "ssg@naver.com", "154-900-7787");
        System.out.println("Empty constructor called");
    }

    public BankAccount (String accountNumber, int balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public BankAccount(String customerName, String email, String phoneNumber) {
       this("12347890", 6000, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund (int deposit) {
        this.balance += deposit;
    }

    public void withdrawFund (int withdraw) {
        if (withdraw > this.balance) {
            System.out.println("Insufficient fund in your bank account");
        } else {
            this.balance -= withdraw;
        }
    }
}
