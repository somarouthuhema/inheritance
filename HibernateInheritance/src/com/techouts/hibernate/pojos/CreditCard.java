package com.techouts.hibernate.pojos;

public class CreditCard extends Payment {
   public String cardType;
   public CreditCard()
   {
	   
   }
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
}
