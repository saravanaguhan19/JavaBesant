package com.typecasting;

public class Child extends Parent {
	
	public void fun2() {
		System.out.println("Hi i am Child Method");

	}
	public static void main(String[] args) {
		Parent obj1 = new Child();
		obj1.fun();
		
	}
}
