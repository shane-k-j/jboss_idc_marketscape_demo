package com.jboss.idc.markespace.demo.model;

import java.util.Date;

public class Account {
	
	int id;
	
	String password;
	
	AccountType types;   // BUYR-COL/DLR/GLY, SLR-ART/DLR/GLY, EMPL-CCS/PSG/GMR/EMP
	Role[] roles; // BUYR, SLR, EMPL
	
	Status status;
	
	String firstName;
	String lastName;
	
	String company;
	
	String streetAddress;
	String city;
	String state;
	String country;
	String zipCode;
	
	String homePhone;
	String mobilePhone;
	
	Date created;
}
