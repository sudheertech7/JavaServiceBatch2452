package com.savitha.oops;
class StaticVariables{
	static int a = 10;
	int b = 10;
	
	public void add() {
		int c = a+b;
		System.out.println(c);
	}
}

public class MainStaticVariables {
	
	public static void main(String[] args) {
		
		StaticVariables s1 = new StaticVariables();
		s1.add();
		
		StaticVariables s2 = new StaticVariables();
		s2.add();
		
		StaticVariables s3 = new StaticVariables();
		s3.add();
	}

}
