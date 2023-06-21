package com.inheritance;
/*
 * EXAMPLE FOR MULTI- LEVEL INHERITANCE 
 */
public class Daughter extends Mother{ // second level child class
	public static void main(String[] args) {
		Daughter obj = new Daughter();
		
		obj.land();
		obj.house();
		obj.gold();
	}

}
