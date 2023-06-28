package com.datahiding;

public class Main {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.setBreath(10.5);
		
		obj.setLength(10.5);
		
		System.out.println("Area is :-" + obj.area());
		
		System.out.println("Perimeter is :-" + obj.perimeter());
		System.out.println("It is a square:- " + obj.isSquare());
		System.out.println("length is :-" + obj.getLength() );
		System.out.println("Breath is :-" + obj.getBreath());
		System.out.println();
	}

}
