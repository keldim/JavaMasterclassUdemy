package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
//		BankAccount boa = new BankAccount();
	    //BankAccount boa = new BankAccount("55651579", 100000, "Chris Yoo", "woyoo@umich.edu", "734-904-1942");
//	    boa.setAccountNumber("55651579");
//	    boa.setBalance(100000);
//	    boa.setCustomerName("Chris Yoo");
//		boa.setEmail("woyoo@umich.edu");
//		boa.setPhoneNumber("734-904-1942");

//		System.out.println(boa.getAccountNumber());
//		System.out.println(boa.getBalance());
//		System.out.println(boa.getCustomerName());
//		System.out.println(boa.getEmail());
//		System.out.println(boa.getPhoneNumber());
//
//
//		boa.depositFund(50000);
//		System.out.println(boa.getBalance());
//		boa.withdrawFund(50000);
//		System.out.println(boa.getBalance());
//		boa.withdrawFund(150000);

//		BankAccount bcd = new BankAccount("George Soros", "skt@email.edu", "565-000-9019");
//		System.out.println(bcd.getPhoneNumber() + " name " + bcd.getCustomerName());

		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());

		VipCustomer person2 = new VipCustomer("George Soros", 6000);
		System.out.println(person2.getName());

		VipCustomer person3 = new VipCustomer("Paul Singer", 6000, "singer@gmail.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmail());


    }
}
