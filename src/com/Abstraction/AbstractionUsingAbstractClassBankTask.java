package com.Abstraction;
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
public class AbstractionUsingAbstractClassBankTask {
	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.requiredDocuments(1234, 965898, "Alex");
		sbi.loanIntrest(10000);
		
		System.out.println("-----------------------------------");
		Hdfc hdfc = new Hdfc();
		hdfc.requiredDocuments(859899, 164616, "Roy");
		sbi.loanIntrest(20000);
		
		System.out.println("-----------------------------------");
		Ippb ippb = new Ippb();
		ippb.requiredDocuments(655768, 898789, "Ram");
		ippb.loanIntrest(30000);
		System.out.println("-----------------------------------");
	}

}
