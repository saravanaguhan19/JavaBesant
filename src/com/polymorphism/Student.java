package com.polymorphism;

public class Student {
	public void studentDetails(String name) {
		
		System.out.println(name);
	}
	public void studentDetails(int age , float height , char initial) {
		System.out.println(age + " " + height + " " + initial);
	}
	
	public void studentDetails(int mark1 , int mark2 , int mark3) {
		System.out.println(mark1 + " " + mark2 + " " + mark3);
	}
	
	public int addition(int num1 , int num2 ) {
		
		return num1 + num2 ;
		
	}
	public int addition(int num1 , int num2 , int num3 , int num4) {
		
		return num1 + num2 + num3 + num4 ;
		
	}
	public int addition(int num1 , int num2 , int num3 , int num4 , int num5  ) {
	
		return num1 + num2 + num3 + num4 + num5 ;
	
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentDetails("saravana");
		obj.studentDetails(26, 5.8f, 'U');
		obj.studentDetails(95, 85, 89);
		
		System.out.println(obj.addition(30, 30));
		System.out.println(obj.addition(30, 30 ,20 , 20));
		System.out.println(obj.addition(30, 30 , 30 , 30 , 20));
		
	}
}
