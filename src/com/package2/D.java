package com.package2;

import com.package1.A;

public class D extends A{
	
	public static void main(String[] args) {
		D obj = new D();
		System.out.println("Different Package sub Class : "+obj.a);
	}

}
