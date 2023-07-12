package com.scannerclass;

import java.util.Scanner;
public class ScannerClassDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name :- ");
		
		String name = sc.nextLine();
		
		System.out.println("Your Name is :- " + name);
		
		System.out.println("Enter Your Age:- ");
		
		int age = sc.nextInt();
		
		System.out.println("Your Age is :-  "+age);
		
		System.out.println("Enter Your Height:- ");
		
		float height = sc.nextFloat();
		
		System.out.println("Your Height is :-  " + height);
		
		System.out.println("Enter Your Initial:-  ");
		
		char initial = sc.next().charAt(0);
		
		System.out.println("Your Initial is "+initial);
		
		System.out.println("Enter Your Gender :-");
		
		String gender = sc.next();
		
		System.out.println("Your Gender is " + gender);
		
	}
}
