package com.savitha.oops;

class Bank{
	//Fields
	static String BANK_NAME = "SBI";
	int accountNumber;
	String accountName;
	int bankBalance;
	
	public Bank(int accountNumber, String accountName, int bankBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.bankBalance = bankBalance;
	}

	//Methods
	
	public void printAccountDetails() {
		System.out.println("Account Details : "+BANK_NAME + " : " + accountNumber + "  " + accountName);
	}
	
	public void bankBalance() {
		System.out.println(accountName +" Bank Balance : " + bankBalance);
	}
	
	public void withdraw(int withdrawAmount) {
		if(withdrawAmount > bankBalance ) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println("Before Withdraw Balance : " + bankBalance);
			bankBalance = bankBalance - withdrawAmount;
			System.out.println("Withdraw Amount is : "+ withdrawAmount);
			System.out.println("After Withdraw Balance : " + bankBalance);
		}
	}
	
	public void deposit(int depositAmount) {
		System.out.println("Balance Before deposit : "+ bankBalance);
		System.out.println("Deposit Amount : "+ depositAmount);
		bankBalance = bankBalance + depositAmount;
		System.out.println("Balance After Deposit : "+ bankBalance);
		
	}
}

public class MainBank {
	
	public static void main(String[] args) {
		Bank sudheer = new Bank(123456, "sudheer", 50000);
		sudheer.printAccountDetails();
		System.out.println("--------------------------------");
		sudheer.bankBalance();
		System.out.println("--------------------------------");
		sudheer.withdraw(1000);
		System.out.println("--------------------------------");
		sudheer.deposit(5000);
	}

}
