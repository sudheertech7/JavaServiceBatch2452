package com.savitha.oops;


class Methods{

	//Instance members belongs to Object
	//Instance Method
	public int printSum() {
		int a = 10;
		int b = 10;
		return a+b;
	}
	
	
	//static members belongs to class
	//Static Method
	public static int printDiff() {
		int a = 20;
		int b = 10;
		return a-b;
	}
	
}

public class MainMethods {
	public static void main(String[] args) {
		int diff = Methods.printDiff();
		System.out.println(diff);
		
		Methods m1 = new Methods();
		int sum = m1.printSum();
		System.out.println(sum);
		
	}

}
