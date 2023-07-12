package com.conditionalstatement;

public class SwitchPractice {
	
	public static void main(String[] args) {
		int a = 10 , b = 10 , c = 0  ; 
		
		char operation = '%';
		
		switch(operation) {
		
		case '+':
			c = a + b ;
			break;
		case '-':
			c = a - b ;
			break;
		case '*':
			c = a * b ;
			break;
		case '/':
			c = a / b ;
			break;
		default:
			System.out.println("Invalid operator, use + - * /  ");
			
		}
		System.out.println("The answer after computing "+ a +" and" + b +" is :- " + c );
	}

}
