package com.array;

public class ArrayDemo {

	
	public static void main(String[] args) {
		
		int arr[ ] = { 1 ,2,3,4,5 };
		
		
		for ( int val : arr) {
			val = 2;
		System.out.print(val + " ");
	}
	
		System.out.println(arr[2]);
	}
}
