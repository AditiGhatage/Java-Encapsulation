package com.java.Interface;

public class MultipleInheritance implements studentBasicInfo,studentSubjectList
{
	public void rollno()
	{
		System.out.println("Student RollNo. :" +intRollNo);
	}
	
	public void getFirstName()
	{
		String strFName = "Shivali";
		System.out.println("Student First Name is:" +strFName);
	}
	public void getLastName()
	{
		String strLName = "Bendre";
		System.out.println("Student Last Name is:" +strLName);
	}
	public void displaySubjectName()
	{
		String strsubName = "Physics";
		System.out.println("Student Subject Name is:" +strsubName);
		
	}
	
	public void displaySubjectMarks()
	{
		int intmarks = 78;
		System.out.println("Student marks :" +intmarks);
	}
	
	public void city()
	{
		String strcity = "Kolhapur";
		System.out.println("Student city :" +strcity);
	}
	
}
