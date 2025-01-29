package com.constructorchaining;
class Demo {

	public Demo() {
		System.out.println("Default Constructor");
	}

	public Demo(int a) {
		this();
		System.out.println("ONE Parameterized Constructor");
	}
	
	public Demo(int a, int b) {
		this(10);
		System.out.println("TWO Parameterized Constructor");
	}

	public Demo(int a, int b, int c) {
		this(10,10);
		System.out.println("Three Parameterized Constructor");
	}

}


public class MainThisConstructor {

	public static void main(String[] args) {

		Demo d = new Demo(10,10,10);

	}

}
