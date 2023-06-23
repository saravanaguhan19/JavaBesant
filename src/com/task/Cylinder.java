package com.task;

public class Cylinder {
	private double radius;
	private double height;
	
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius(double r) {
		if(r >= 0) {
		radius = r;
		}else {
			radius = 0;
		}
	}
	public void setHeight(double h) {
		if(h >= 0) {
		height = h;
		}else {
			height = 0;
		}
	}

	public double volume() {
		return Math.PI*radius*radius*height;
	}
	public double curvedSurfaceArea() {
		
		double res = 2*Math.PI*radius*height;
		
		return res;
	}
	
	public double totalSurfaceArea() {
		return 2*Math.PI*radius*(radius+height);
	}
	public double perimeter() {
		return (4*radius)+(4*height);
	}
	
	public static void main(String[] args) {
		Cylinder obj = new Cylinder();
		
		obj.setHeight(2.0);
		obj.setRadius(2.0);
		
		System.out.println("volume:-" +  obj.volume());
		System.out.println("perimeter:-" + obj.perimeter());
		System.out.println("curved surface area:-" + obj.curvedSurfaceArea());
		System.out.println("total surface area:- " + obj.totalSurfaceArea());
	}
}
