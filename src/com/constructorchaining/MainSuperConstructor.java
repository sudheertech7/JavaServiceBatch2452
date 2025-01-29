package com.constructorchaining;
class A{
	
	int a;
	int b;
	
	public A(){
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
	public A(int a, int b){
		this();
		this.a = a;
		this.b = b;
		System.out.println("CLASS A Two Parameterized CONSTRUCTOR");
	}
}

class B extends A{
	int c;
	int d;
	
	public B(int a, int b, int c, int d) {
		super(a,b);
		this.c = c;
		this.d = d;
		System.out.println("CLASS B 4 Parameterized CONSTRUCTOR");
	}
}

public class MainSuperConstructor {
	
	public static void main(String[] a) {
		B b = new B(10,20,30,40);
		
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
		
	}

}
