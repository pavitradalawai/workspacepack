package com.xworkz.shield.consumer;
import com.xworkz.shield.card.CreditCard;
public class Customer {
private String name;
private boolean employeed;
private CreditCard creditCard;
public Customer(String name,boolean employeed,CreditCard card) {
	

this.creditCard=card;
this.employeed=employeed;
this.name=name;

}
public void displayCustomerInfo() {
System.out.println(this.name);
System.out.println(this.employeed);
}
public void displayCreditCardInfo()
{
	System.out.println(this.creditCard.getBankName());
	int cvv=this.creditCard.getCvv();
		System.out.println(cvv);
}

}

