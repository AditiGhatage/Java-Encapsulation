package com.java.Abstract;

public class TestShoppingSite {

	public static void main(String[] args) 
	{
		PageFactory.objShoppingSite().login("Aditi", "1234ABC");
		System.out.println("===================================");
		PageFactory.objShoppingSite().selectMenu();
		System.out.println("===================================");
		//PageFactory.objshop.addItem();
		
		SellerPage objseller = new SellerPage();
		objseller.addItem();

	}

}
