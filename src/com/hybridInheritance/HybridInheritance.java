package com.hybridInheritance;
interface A{
	void add();
}
interface B extends A{
	void sub();
}
interface C extends A{
	void mul();
}
interface D extends B,C{
	void div();
}
class E implements D{
	@Override
	public void add() {
		int a = 10;
		int b = 10;
		System.out.println("Add Method Belongs to Interface A : "+(a+b));
	}
	@Override
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println("Add Method Belongs to Interface B : "+(a-b));
	}
	@Override
	public void mul() {
		int a = 10;
		int b = 10;
		System.out.println("Add Method Belongs to Interface C : "+(a*b));
	}
	@Override
	public void div() {
		int a = 20;
		int b = 10;
		System.out.println("Add Method Belongs to Interface A : "+(a%b));
	}
	
}

public class HybridInheritance {

}
