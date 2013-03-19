package com.jboss.idc.markespace.demo.twg.erp.api;

import java.util.Date;

public class Order {
    
    int id;
    
    OrderStatus status;
    
    OrderItem[] items;
    
    Date datePlaced;
    Date dateShipped;
    Date dateDelivered;
}
