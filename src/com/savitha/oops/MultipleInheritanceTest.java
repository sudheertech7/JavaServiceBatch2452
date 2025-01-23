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

class C extends B{
	//properties
	int e = 2;
	int f = 4;
	
	//Fields
	void mul() {
		System.out.println("MUl Methods From CLASS C");
		System.out.println(e*f);
	}
}
public class MultipleInheritanceTest {
	
	public static void main(String[] args) {		
		C obj = new C();
		System.out.println(obj.e);
		System.out.println(obj.f);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.mul();
		obj.sub();
		obj.add();
		
		

		
	}
	

}
