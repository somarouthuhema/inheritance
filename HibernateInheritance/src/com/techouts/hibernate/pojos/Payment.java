package com.techouts.hibernate.pojos;
 	                    
public class Payment {
	public int payId;
	public double amount;
	public Payment()
	{
		
	}
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
