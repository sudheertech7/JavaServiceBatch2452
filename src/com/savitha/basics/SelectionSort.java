package com.savitha.basics;


import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int [] ar = new int[] {5,4,20,2,10};
		
		
		for(int k=0; k<ar.length; k++) {
			int maxIndex = 0;
			int i;
			for(i=0; i<ar.length-k; i++) {
				if(ar[i]>ar[maxIndex]) {
					maxIndex = i;
				}
				
			}
			

			int temp = ar[ar.length-1-k];
			ar[ar.length-1-k] = ar[maxIndex];
			ar[maxIndex] = temp;
			System.out.println(Arrays.toString(ar));
		}

		
		System.out.println(Arrays.toString(ar));
	
		
	}

}

