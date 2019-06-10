package com.techouts.hibernate.pojos;

public class ChequePayment extends Payment{
	public String chequeType;
  public ChequePayment()
   {
	   
   }
public String getChequeType() {
	return chequeType;
}
public void setChequeType(String chequeType) {
	this.chequeType = chequeType;
}


}
