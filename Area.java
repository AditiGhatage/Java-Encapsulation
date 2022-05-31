package com.java.Interface;

public class Area implements DetailsPage
{

	@Override
	public void area() 
	{
		int intside=9;
		double doublearea;
		
		doublearea = intside*intside;
		System.out.println("Area of square is: " +doublearea);
		
	}

	@Override
	public void perimeter() 
	{
		int intlength=8, intbreadth=3;
		int intperimeter;
		intperimeter= 2 *(intlength+intbreadth);
		System.out.println("Perimeter of rectangle is: "+intperimeter);
		
	}

	@Override
	public void vloume() 
	{
		int intradius = 6;
		int intHeight = 7;
		double doublepi =3.14, doublevolume;
		doublevolume = doublepi*intradius*intradius*intHeight/3;
		
		System.out.println("Volume of cone is: "+doublevolume);
		
	}


}
