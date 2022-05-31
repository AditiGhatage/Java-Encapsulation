package com.java.Abstract;

import java.util.Random;

public class CustomerPage extends ShoppingSite
{
	@Override
	public void login(String struserName, String strPassword)
	{
		System.out.println("Enter username : " +struserName);
		System.out.println("Enter password: " +strPassword);
	}
	
	@Override
	public void selectMenu()
	{
		String[] strmenu = {"Best Seller", "Deal of the day"};
		String strRandomMenu = strmenu[new Random().nextInt(strmenu.length)];
		System.out.println("Selected Menu is: " +strRandomMenu);
	}

}
