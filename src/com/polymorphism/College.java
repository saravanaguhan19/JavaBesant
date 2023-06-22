package com.polymorphism;
/*
 * EXAMPLE PROGRAM FOR METHOD OVERRIDING
 */
public class College {
	
	public void studentName(String name) {
		System.out.println(name);
	}
	public void studentDetails(int age , float height , char initial) {
		System.out.println(age + " " + height + " " + initial);
	}
	
	public void studentMark(int tenthm , int twelthm) {
		System.out.println(tenthm + " " + twelthm);
	}

}
