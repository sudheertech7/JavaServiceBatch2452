package com.savitha.basics;

import java.util.Arrays;

class Human1{
	int aadharNo;
	String name;
	String [] parentDetails ;
	
	public Human1(int humanAadhar, String humanName, String [] humanParentDetails) {
		aadharNo = humanAadhar;
		name = humanName;
		parentDetails = humanParentDetails;
		
	}
	
	public void printHumanInfo() {
		System.out.println(aadharNo);
		System.out.println(name);
	}
	
	public void printAllHumanInfo() {
		System.out.println(aadharNo);
		System.out.println(name);
		System.out.println(Arrays.toString(parentDetails));
		
	}
	
	
}

public class Demo {
	
public static void main(String[] args) {
	
	
	Human1 sudheer = new Human1(1234, "sudheer", new String [] {"sunitha", "subramanyam"});
	sudheer.printHumanInfo();
	
	
	Human1 laya = new Human1(1234, "laya", new String [] {"sunitha", "subramanyam"});
	laya.printHumanInfo();
	
}	

			

}
