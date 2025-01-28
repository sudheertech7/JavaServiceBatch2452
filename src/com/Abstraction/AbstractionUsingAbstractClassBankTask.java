package com.Abstraction;
import java.util.Scanner;

abstract class Bank{
	//Abstract Method
	abstract void loanIntrest(float loanAmount);
	//Non Abstract Method
	void requiredDocuments(int aadharNumber, int panNumber,String name) {
		System.out.println("Name : "+name);
		System.out.println("AAdhar Number : "+aadharNumber);
		System.out.println("Pan Number : "+panNumber);
	}
}
class Sbi extends Bank{
	static float RATE = 10;
	@Override
	void loanIntrest(float loanAmount) {
		float intrest = (loanAmount * RATE)/100;
		float total = loanAmount + intrest;
		System.out.println("Intrest for Loan "+ RATE+" : " + intrest);
		System.out.println("Total Loan and Intrest : "+ total);
	}
}
class Hdfc extends Bank{
	static float RATE = 15;
	@Override
	void loanIntrest(float loanAmount) {
		float intrest = (loanAmount * RATE)/100;
		float total = loanAmount + intrest;
		System.out.println("Intrest for Loan "+ RATE+" : " + intrest);
		System.out.println("Total Loan and Intrest : "+ total);
	}
}
class Ippb extends Bank{
	static float RATE = 7;
	@Override
	void loanIntrest(float loanAmount) {
		float intrest = (loanAmount * RATE)/100;
		float total = loanAmount + intrest;
		System.out.println("Intrest for Loan "+ RATE+" : " + intrest);
		System.out.println("Total Loan and Intrest : "+ total);
	}
}

class BankTask{
	void test(Bank loan, float loanAmount,int aadharNumber, int panNumber,String name) {
		loan.loanIntrest(loanAmount);
		loan.requiredDocuments(aadharNumber, panNumber, name);
		System.out.println("-----------------------------");
	}
}

public class AbstractionUsingAbstractClassBankTask {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Bank : ");
			String bank = sc.nextLine();
			System.out.println("Enter the Aadhar Number : ");
			int aadharNumber = sc.nextInt();
			System.out.println("Enter the Pan Number : ");
			int panNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name : ");
			String name = sc.nextLine();
			System.out.println("Enter the LoanAmmount");
			float loanAmount = sc.nextFloat();
			Bank loan;
			switch(bank) {
			case "sbi" -> loan = new Sbi();
			case "hdfc" -> loan = new Hdfc();
			case "ippb" -> loan = new Ippb();
			default -> loan = null;
			}
			if(loan == null) {
				System.out.println("Enter the Valid Bank SBI OR HDFC or IPPB");
			}
			else {
				BankTask poly = new BankTask();
				poly.test(loan,loanAmount,aadharNumber,panNumber,name);
			}
		}
	}

}
