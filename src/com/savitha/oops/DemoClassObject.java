package com.savitha.oops;
import java.util.Arrays;

class Human{
	int aadharNo;
	String name;
	String [] parentDetails ;

	public Human(int humanAadhar, String humanName, String [] humanParentDetails) {
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

public class DemoClassObject {


	public static void main(String[] args) {


		Human sudheer = new Human(1234, "sudheer", new String [] {"sunitha", "subramanyam"});
		sudheer.printHumanInfo();
		sudheer.printAllHumanInfo();
		
		System.out.println("----------------------------------------");

		Human laya = new Human(4567, "laya", new String [] {"sunitha", "subramanyam"});
		laya.printHumanInfo();
		laya.printAllHumanInfo();

	}

}










