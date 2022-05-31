package com.java.Encapsulation;

public class HotelManagement 
{
	private String strCustomerName = "";
	private String strRoomType = "";
	private long longPhoneNumber;
	private String strCityName ="";
	private int intAadharCard;
	
	
	public long getLongPhoneNumber() {
		return longPhoneNumber;
	}
	public void setLongPhoneNumber(long longPhoneNumber) {
		this.longPhoneNumber = longPhoneNumber;
	}
	public String getStrCustomerName() {
		return strCustomerName;
	}
	public void setStrCustomerName(String strCustomerName) {
		this.strCustomerName = strCustomerName;
	}
	public String getStrRoomType() {
		return strRoomType;
	}
	public void setStrRoomType(String strRoomType) {
		this.strRoomType = strRoomType;
	}
	
	public String getStrCityName() {
		return strCityName;
	}
	public void setStrCityName(String strCityName) {
		this.strCityName = strCityName;
	}
	public int getIntAadharCard() {
		return intAadharCard;
	}
	public void setIntAadharCard(int intAadharCard) {
		this.intAadharCard = intAadharCard;
	}
	
}
