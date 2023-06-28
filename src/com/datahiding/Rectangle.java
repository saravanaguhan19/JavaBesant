package com.datahiding;

public class Rectangle {
	
	private double length;
	
	private double breath;
	
	public double getLength() {
		return length;
	}
	
	public double getBreath() {
		return breath;
	}
	public void setLength(double l) {
		if(l >= 0 ) {
			length = l;
			
		}else {
			length = 0;
		}
	}
	public void setBreath (double b) {
		if(b >= 0) {
			breath = b;
		}else {
			breath = 0;
		}
	}
	
	public double area() {
		return length*breath;
	}
	
	public double perimeter() {
		return  2*(length + breath); 
	}
	
	public boolean isSquare() {
		if(length == breath) {
			return true;
		}else
		{
			return false;
		}
	}
}
