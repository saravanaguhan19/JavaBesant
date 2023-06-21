package com.inheritance;

/*
 * EXAMPLE FOR MULTI- LEVEL INHERITANCE 
 */
public class Mother extends Grandfather {//first level child class
	public void gold() {
		System.out.println("Gold Ring");
		
	}
	
	public static void main(String[] args) {
		Mother obj = new Mother();
		
		obj.land();
		obj.house();
		
	}

}
