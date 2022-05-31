package com.java.Interface;

import java.util.Random;

public class BankTransactions implements BankDetails,BankLoans
{

	@Override
	public void getAccountDetails() 
	{
		String strname = "Aditi Ghatage";
		System.out.println("Name: " +strname);
		System.out.println("Account number: "+BankDetails.intAccountNumber);	
	}

	@Override
	public void getAccountType() 
	{
		String[] strAccountType = {"Savings", "Current"};
		String strRandomAccount = strAccountType[new Random().nextInt(strAccountType.length)];
		System.out.println("Account Type is: " +strRandomAccount);	
	}

	@Override
	public void calculateSimpleInterest() 
	{
		float principal, rate, time;
		float simpleinterest;
		principal = 30000;
		rate = 3;
		time = 2;
		
		simpleinterest = (principal*rate*time)/100;
		
		System.out.println("Simple Interest is: " +simpleinterest);
		
	}

}
