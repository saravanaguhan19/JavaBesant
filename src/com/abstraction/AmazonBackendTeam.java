package com.abstraction;

public class AmazonBackendTeam  extends AmazonDemoUser1{

	@Override
	public void userName() {
		
		super.userName();
	}

	@Override
	public void password() {
		System.out.println("123456789");
		
	}
	public static void main(String[] args) {
		AmazonBackendTeam obj = new AmazonBackendTeam();
		obj.userName();
		obj.password();
	}

}
