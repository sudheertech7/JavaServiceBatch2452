package com.savitha.oops;

class Variables{
	
	//Instance Variables --> Heap Memory
	int a = 100;
	int b = 100;
	int c = a+b;
	
	public Variables() {
		//Local Variables --> stack Memory
		int n1 = 10;
		int n2 = 10;
		int sum = n1+n2;
		System.out.println("sum of Values from Constructor = "+sum);
		
	}
	
	public void add() {
		//Local Variables --> stack Memory
		int num1 = 10;
		int num2 = 10;
		int sum = num1 + num2;
		System.out.println("sum from add() = "+sum);
		System.out.println("sum from Instance Variables = "+c);
	}
	
	public void sub() {
		//Local Variables --> stack Memory
		int val1 = 20;
		int val2 = 10;
		int diff = val1-val2;
		System.out.println("Diff from sub() = "+diff);
		System.out.println("sum from Instance Variables = "+c);
	}
	
}

public class MainVariables {
	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.add();
		obj.sub();
	}

}
