package com.Abstraction;

import java.util.Scanner;

interface Calculator{
	
	void add();
	void sub();
	
}

class Calculator1 implements Calculator{
	@Override
	public void add() {
		int a = 10;
		int b = 10;
		System.out.println("Sum of Values : "+(a+b));
	}

	@Override
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println("subtraction of Values : "+(a-b));
	}
}

class Calculator2 implements Calculator{

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		System.out.print("Enter the value : ");
		int b = sc.nextInt();
		System.out.println("Sum of Values : "+(a+b));
		System.out.println("-------------------------");
	}
	

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = sc.nextInt();
		System.out.print("Enter the value : ");
		int b = sc.nextInt();
		System.out.println("subtraction of Values : "+(a-b));
	}
	
}


public class AbstractionUsingInterface {

	public static void main(String[] args) {
		Calculator1 calculator1 = new Calculator1();
		calculator1.add();
		calculator1.sub();
		System.out.println("----------------------------------");
		Calculator2 calculator2 = new Calculator2();
		calculator2.add();
		calculator2.sub();
	}
}
