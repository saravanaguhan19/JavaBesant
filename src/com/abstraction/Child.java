package com.abstraction;

public class Child implements  Father ,Mother {

	@Override
	public void ring() {
		System.out.println("Diamond Ring");
		
	}

	@Override
	public void chain() {
		System.out.println("Gold Chain");
		
	}

	@Override
	public void bike() {
		System.out.println("Vespa");
		
	}

	@Override
	public void land() {
		System.out.println("5 acre");
		
	}
	
	
	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.bike();
		obj.chain();
		obj.land();
		obj.ring();
	}

}
