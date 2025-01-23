package com.savitha.oops;
class A{
	static {
		System.out.println("Static Block From CLASS A");
	}
	{
		System.out.println("Instance Block From CLASS A");
	}
	//properties
	int a = 10;
	int b = 20;
	//methods
	void add() {
		System.out.println("ADD Method From CLASS A");
		System.out.println(a+b);
	}
}
class B extends A{
	static{
		System.out.println("Static Block From CLASS B");
	}
	{
		System.out.println("Instance Block From CLASS B");
	}
	//properties
	int a = 200;
	int b = 100;
	//methods
	void sub() {
		System.out.println("SUB Method From CLASS B");
		System.out.println(a-b);
	}	
}


public class FlowMultiLevelInheritanceTest {
	static {
		System.out.println("Static block From Main Class : MultiLevelInheritanceTest");
	}
	
	public static void main(String[] args) {		
		B obj1 = new B();
		System.out.println(obj1.a);
		System.out.println(obj1.a);

		
		
		
		
		

		
	}
	

}
