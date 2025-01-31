package com.multipleInheritance;
interface A{
	void add();
}
interface B{
	void sub();
}
class C implements A,B{

	@Override
	public void add() {
		int a = 10;
		int b = 10;
		System.out.println("Method Belongs to Interface A :"+(a+b));
	}
	
	@Override
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println("Method Belongs to Interface B :"+(a-b));
	}
	
	public void mul() {
		int a = 10;
		int b = 10;
		System.out.println("Method Belongs to Class C :"+(a*b));
	}
}
public class MulipleInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.add();
		c.sub();
		c.mul();
	}
}