package com.recursion;

import java.util.Scanner;

public class Recursion {
	
	static int fun(int n) {
		if(n<2) {
			return n;
		}
		return fun(n-1)+fun(n-2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		System.out.println(fun(n));
		
	}
}
