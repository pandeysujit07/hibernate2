package com.lti.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.entity.Customer;
import com.lti.entity.CustomerDao;
import com.lti.entity.Order;
import com.lti.entity.Payment;

public class OrderTest {
	@Test
	public void placeOrder() {
	
		GenericDao dao=new GenericDao();
		Customer cust=(Customer) dao.fetchById(Customer.class, 21);
		Payment pay =(Payment)dao.fetchById(Payment.class, 1);  //for linking with order table  by using id 1
		Order order=new Order();
		order.setOrderDate(new Date());
		order.setAmount(5000);
		order.setCustomer(cust);
		order.setPayment(pay);
		dao.save(order);
		
	}  
	
	@Test
	public void fetchOrders() {
		
		
		GenericDao dao= new GenericDao();
		List<Order> orders= dao.fetchAll(Order.class);
		for (Order order : orders) {
			
			
				System.out.println(order.getCustomer().getName());
				System.out.println(order.getCustomer().getEmail());
				System.out.println(order.getId());
				System.out.println(order.getAmount());
				System.out.println(order.getOrderDate());
				System.out.println(order.getPayment().getId());
			
			}

	}
}
