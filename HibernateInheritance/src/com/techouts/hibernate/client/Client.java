package com.techouts.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.hibernate.pojos.*;

public class Client {
	public static void main(String[] args)
	{
		Configuration cg=new Configuration();
		cg.configure("hibernate.cfg.xml");
		SessionFactory sf=cg.buildSessionFactory();
		
		CreditCard cc=new CreditCard();
		cc.setPayId(2);
		cc.setAmount(4000);
		cc.setCardType("VISA");
		
		ChequePayment cp=new ChequePayment();
		cp.setPayId(3);
		cp.setAmount(5000);
		cp.setChequeType("cheque");
		
		 
			
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			
			s.save(cc);
			s.save(cp);
			
			tx.commit();
			s.close();
			
			
			
	}


}