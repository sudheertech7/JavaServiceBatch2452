package com.savitha.oops;
class A{
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
	//properties
	int c = 200;
	int d = 100;
	//methods
	void sub() {
		System.out.println("SUB Method From CLASS B");
		System.out.println(c-d);
	}	
}
public class InheritanceTest {
	
	public static void main(String[] args) {
		B obj = new B();
		
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println("----------------------");
		obj.sub();
		obj.add();
		
	}
	

}
