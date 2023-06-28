package com.constructor;

public class Student {
	
	public Student () {
		System.out.println("Default Constructor");
	}
	
	public Student (String name) {
		System.out.println(name);
		
	}
	public Student (float height) {
		System.out.println(height);
	}
	public void mark (int m1 , int m2) {
		System.out.println(m1 + " " + m2);
	}
	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student("saravana");
		Student obj3 = new Student(5.5f);
		obj1.mark(100, 98);
		obj2.mark(45,55);
		obj3.mark(68,87);
		
	}
}
