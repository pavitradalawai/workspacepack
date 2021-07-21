package com.xworkz.shield.card;
import java.util.Date;
public class CreditCard {
	
private String bankName="SBI";
private long  cardNo=235467819349035l;
private int cvv=1234;
private Date expirydate=new Date();
private boolean wifiEnabled=true;
private int pin;
 public String getBankName()
 {
	 return this.bankName;
 }	 
 
public int getCvv()
{
	return this.cvv;
	
}
public long getCardNo() 
{
	return this.cardNo;
	
}
public Date getExpriyDate()
{
	return this.getExpiryDate;
	
}
public boolean getWifiEnabled()
{
	return this.wifiEnabled;
	
}
public int getPin() 
{
return this.pin;
}
}




