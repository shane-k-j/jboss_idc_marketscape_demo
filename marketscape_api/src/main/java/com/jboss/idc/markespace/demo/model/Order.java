package com.jboss.idc.markespace.demo.model;

import java.util.Date;

public class Order {
	
	int id;
	
	Account account;
	
	OrderStatus status;
	
	OrderItem[] items;
	
	Date datePlaced;
	Date dateShipped;
	Date dateDelivered;
}
