package com.polymorphism;

public class Student1 extends College {

	@Override
	public void studentName(String name) {
		// TODO Auto-generated method stub
		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, char initial) {
		// TODO Auto-generated method stub
		super.studentDetails(age, height, initial);
	}

	@Override
	public void studentMark(int tenthm, int twelthm) {
		// TODO Auto-generated method stub
		super.studentMark(tenthm, twelthm);
	}
	
	public static void main(String[] args) {
		Student1 obj = new Student1();
		obj.studentName("saravana");
		obj.studentDetails(26, 5.9f, 'u');
		obj.studentMark(418, 963);
	}

}
