package com.java.Interface;

public class TestInterface {

	public static void main(String[] args) 
	{
		DetailsPage objdetails = new Implementation();
		System.out.println("Given url: " +DetailsPage.strURL);
		objdetails.area();
		objdetails.perimeter();
		objdetails.vloume();
		System.out.println("=============================");
		DetailsPage objarea = new Area();
		objarea.area();
		objarea.perimeter();
		objarea.vloume();
	}

}
