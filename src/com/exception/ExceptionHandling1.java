package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the Integer value : ");
			int a = sc.nextInt();
			System.out.println("User Input : "+ a);

			System.out.println("Enter the Numerator");
			int numerator = sc.nextInt();
			System.out.println("Enter the Denominator");
			int denominator = sc.nextInt();
			int divide = numerator/denominator;
			System.out.println(divide);

			System.out.print("Enter the size of an Array : ");
			int size = sc.nextInt();
			int [] ar1 = new int [size];
			System.out.println("Created Array With Size : "+ size);
			
			System.out.print("Enter the Index value to assign the value : ");
			int index = sc.nextInt();
			int[] ar = new int [3];

			ar[index] = 100;
			System.out.println("Assigned the Value At Index : "+index);

		}
		catch (InputMismatchException e) {
			System.out.println("Enter only Integer Type ");
		}
		catch (ArithmeticException e) {
			System.out.println("Enter non zero Denominator");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("Array Size should be Positive");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index value exceeds the length of the Array");
		}



	}

}
