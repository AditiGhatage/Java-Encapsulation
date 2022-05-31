package com.java.Interface;

public class TestBankMultipleInheritance {

	public static void main(String[] args) 
	{
		BankTransactions objbank = new BankTransactions();
		objbank.getAccountDetails();
		objbank.getAccountType();
		objbank.calculateSimpleInterest();

	}

}
