package com.savitha.oops;
class Method{
	
	int a;
	int b;
	int c;
	
	public Method() {
		System.out.println("User Defined non parameterized Constructor");
		a = 10;
		b = 10;
		c = 10;
	}
	
	public Method(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("2 Parameterized Constructor");
	}
	
	public Method(int a, int b, int c) {
		System.out.println("3 Parameterized Constructor int, int, int");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Method(float a, float b, float c) {
		System.out.println("3 Parameterized Constructor float, float, float");
	}
	
}
public class MainMethodOverloading {

	public static void main(String[] args) {
		Method obj = new Method(100,100,100f);
	}
	
}
