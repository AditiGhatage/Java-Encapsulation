package com.java.Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) 
	{
		HotelManagement objHotel = new HotelManagement();
		objHotel.setStrCustomerName("Aditi Ghatage");
		System.out.println("Customer Name: " +objHotel.getStrCustomerName());
		
		objHotel.setLongPhoneNumber(8767654345l);
		System.out.println("Phone Number: " +objHotel.getLongPhoneNumber());
		
		objHotel.setStrCityName("Kolhapur");
		System.out.println("City: " +objHotel.getStrCityName());
		
		objHotel.setStrRoomType("Single");
		System.out.println("Room Type: " +objHotel.getStrRoomType());
		
		objHotel.setIntAadharCard(1234);
		System.out.println("Adhar Card: "+objHotel.getIntAadharCard());

	}

}
