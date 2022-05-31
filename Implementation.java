package com.java.Interface;

public class Implementation implements DetailsPage 
{

	@Override
	public void perimeter() 
	{
		int intradius= 5;
		double doublepi=3.14;
		int intperimeter;
		
		intperimeter = (int) (2 * doublepi * intradius);
		System.out.println("Perimeter of circle is: " +intperimeter);
		
	}

	@Override
	public void area() 
	{
		int intlength=9, intwidth=6;
		double doublearea;
		
		doublearea = intlength*intwidth;
		System.out.println("Area of rectangle is: " +doublearea);
		
	}

	@Override
	public void vloume() 
	{
		int intradii = 5;
		double doublepi =3.14, doublevolume;
		
		doublevolume = 4 * doublepi * (intradii*intradii);
		System.out.println("Volume of sphere is: "+doublevolume);
		
	}

}
