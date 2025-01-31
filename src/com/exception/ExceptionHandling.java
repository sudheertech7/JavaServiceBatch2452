package com.exception;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index value to assign the value : ");
		int index = sc.nextInt();
		int [] ar  = null;
		try {
			ar = new int [3];
			
			ar[index] = 100;
			System.out.println("Assigned the Value At Index : "+index);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Length of the Array :"+ ar.length +" Assign Below the length of the Array");
		}
		
		
		
		
		
	}

}
