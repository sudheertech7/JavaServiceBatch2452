package com.polymorphism;
class Demo{
	
	public void add() {
		int a = 10;
		int b = 10;
		System.out.println("No Parameterized Method");
		System.out.println(a+b);
	}
	public void add(int a, int b) {
		System.out.println("Parameterized Method");
		System.out.println(a+b);
	}
	
}
public class MethodOverloading {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(100,100);
		
	}

}
