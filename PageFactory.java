package com.java.Abstract;

public class PageFactory 
{
	public static ShoppingSite objshop = null;
	
	public static String strUSer = "Customer";
	
	public static ShoppingSite objShoppingSite()
	{
		if(strUSer.equals("Customer"))
		{
			objshop = new CustomerPage();
		}
		else if (strUSer.equals("Seller")) 
		{
			objshop = new SellerPage();
		}	
		return objshop;	
	}
}
