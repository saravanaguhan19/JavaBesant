package com.task;
/*
 * TASK -1 DONE USING SINGLE INHERITANCE
 */
public class SavingAccount extends BankAccount {//SUB CLASS
	public static void main(String[] args) {
		SavingAccount sbi = new SavingAccount();
		
		sbi.deposit();
		sbi.withdraw();
	}
	
}
