package com.encapsulation;
class BankAccount{
	private int password = 9999;
	private String name = "alex";
	private int accountNum = 12345;
	private int bankBalance = 5000;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(int bankBalance) {
		
		
		this.bankBalance = bankBalance;
	}
	
	

	
	
	
	
	

}
public class MainEncapsulation {
	
	public static void main(String[] args) {
		BankAccount manager =  new BankAccount();
		
//		int bankBalance = manager.getBankBalance(9999);
//		System.out.println(bankBalance);
		
		BankAccount hacker =  new BankAccount();
//		int balance = hacker.getBankBalance(1234);
//		System.out.println(balance);	
	}
}
