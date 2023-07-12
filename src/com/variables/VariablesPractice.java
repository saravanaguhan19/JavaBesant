package com.variables;

public class VariablesPractice {
		
	static int val1  = 25; // static variable 
	
	int b =7; //class variable 
	
	public void method1() {
		
		int b = 8;
		System.out.println(b);
	}
	
	public static void method() {
		System.out.println("hai i am a static method ");
	}
	
	public static void main(String[] args) {
		VariablesPractice obj = new VariablesPractice();
		
		System.out.println(obj.b);
		obj.method1();
		method();
		System.out.println(val1);
	}
}
