package com.exception;
import java.util.Scanner;
class UnderAge extends Exception{
	@Override
	public String getMessage() {
		return "UnderAge Exception";
	}
}
class OverAge extends Exception{
	@Override
	public String getMessage() {
		return "OverAge Exception";
	}
}
class Eligibility{
	void eligibleforApplyLicence(int age) throws UnderAge,OverAge {
		if(age>18 && age<60) {
			System.out.println("Eligible for Apply License...");
		}
		else if(age > 60) {
			OverAge overAge = new OverAge();
			throw overAge;
		}
		else{
			UnderAge underAge = new UnderAge();
			throw underAge;
		}
	}
}
public class ThrowExceptionCode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		Eligibility eligibility = new Eligibility();
		try {
			eligibility.eligibleforApplyLicence(age);
		} catch (UnderAge e) {
			e.printStackTrace();
		} catch (OverAge e) {
			e.printStackTrace();
		}
	}

}
