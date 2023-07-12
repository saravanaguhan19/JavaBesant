package com.conditionalstatement;

public class IfElseIfPractice {
	public static void main(String[] args) {
		
		int mark = 101 ;
		
		if(mark<50) {
			
			System.out.println("your grade is D");
	
		} else if (mark >= 50 && mark < 70 ) {
		
			System.out.println("your grade is C");
	
		}else if (mark >= 70 && mark < 90) {
			
			System.out.println("your grade is B");
		
		}else if (mark >= 90 && mark <= 100) {
			
			System.out.println("your grade is A");
			
		}else {
			System.out.println("Invalid mark");
		}
		
	}

}
