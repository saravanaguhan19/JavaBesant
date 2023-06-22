package com.polymorphism;

public class Student2 extends College {

	@Override
	public void studentName(String name) {
		
		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, char initial) {
		
		super.studentDetails(age, height, initial);
	}

	@Override
	public void studentMark(int tenthm, int twelthm) {
	
		super.studentMark(tenthm, twelthm);
	}
	
	public static void main(String[] args) {
		Student1 obj = new Student1();
		obj.studentName("santhosh");
		obj.studentDetails(26, 5.5f, 'm');
		obj.studentMark(455, 1055);
	}
}
