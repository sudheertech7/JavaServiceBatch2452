package com.polymorphism;
import java.util.Scanner;
class Bank{
	static float RATE = 5;
	void loanIntrest(float loanAmount) {
		float intrest = (loanAmount * RATE)/100;
		float total = loanAmount + intrest;
		System.out.println("Intrest for Loan is  "+ RATE+"% : " + intrest);
		System.out.println("Total Loan plus Intrest : "+ total);
	}
}
class Sbi extends Bank{
	static float RATE = 10;
	void loanIntrest(float loanAmount) {
		float intrest = (loanAmount * RATE)/100;
		float total = loanAmount + intrest;
		System.out.println("Intrest for Loan "+ RATE+" : " + intrest);
		System.out.println("Total Loan and Intrest : "+ total);
	}
}
class Hdfc extends Bank{
	static float RATE = 15;
	void loanIntrest(float loanAmount) {
		float intrest = (loanAmount * RATE)/100;
		float total = loanAmount + intrest;
		System.out.println("Intrest for Loan "+ RATE+" : " + intrest);
		System.out.println("Total Loan and Intrest : "+ total);
	}
}
class Ippb extends Bank{
}
class PolyMorphismTest{
	void test(Bank loan, int loanAmount) {
		loan.loanIntrest(loanAmount);
	}
}
public class PolymorphismBank {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Bank : ");
			String bank = sc.nextLine();
			System.out.println("Enter the Loan Amount : ");
			int loanAmount = sc.nextInt();
			
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
				PolyMorphismTest poly = new PolyMorphismTest();
				poly.test(loan,loanAmount);
			}
		}


		
		
	}

}
