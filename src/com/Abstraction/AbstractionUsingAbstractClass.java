package com.Abstraction;
import java.util.Scanner;
abstract class Demo{
	
	//Abstract method
	abstract void add();
	
	//Non Abstract Method
	void sub(int a, int b) {
		int diff = a-b;
		System.out.println(diff);
	}
		
}
class Employee1 extends Demo{

	@Override
	void add() {
		int a = 100;
		int b = 200;
		int sum = a+b;
		System.out.println(sum);
	}
	
}
class Employee2 extends Demo{
	@Override
	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value A :");
		int a = sc.nextInt();
		System.out.println("Enter the Value B : ");
		int b = sc.nextInt();
		System.out.println(a+b);	
	}	
}

public class AbstractionUsingAbstractClass {
	public static void main(String[] args) {
		
		Employee1 employee1 = new Employee1();
		employee1.add();
		employee1.sub(20, 10);
		
		
		Employee2 employee2 = new Employee2();
		employee2.add();
		employee2.sub(20, 10);
		
	}
	
	
}
