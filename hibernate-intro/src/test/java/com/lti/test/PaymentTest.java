package com.lti.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.entity.Customer;
import com.lti.entity.Order;
import com.lti.entity.Payment;

public class PaymentTest {

	@Test
	public void paymentProcess() {
	
		GenericDao dao=new GenericDao();
		Order cust=(Order) dao.fetchById(Order.class, 123);
		Order order=new Order();
		Payment pay=new Payment();
		
	
		pay.setId(1);
		pay.setAmount(5000);
		pay.setPmt_mode("debit");
		pay.setPmt_status("successful");

		dao.save(pay);
		
	}  
	
	@Test
	public void fetchOrders() {
		
		
		GenericDao dao= new GenericDao();
		List<Payment> payments= dao.fetchAll(Payment.class);
		for (Payment payment : payments) {
			
				
				System.out.println(payment.getId());
				System.out.println(payment.getAmount());
				System.out.println(payment.getPmt_mode());
				System.out.println(payment.getPmt_status());
			
			}

	}
}
