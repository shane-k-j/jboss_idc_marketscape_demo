package com.jboss.idc.markespace.demo.model;

import java.util.Date;

public class Account {
	
	int id;
	
	String username;
	String password;
	
	// BUYR, SELR, EMPL
	// BUYR - COL|DLR|GLY, SELR - ART|DLR|GLY, EMPL - CCS|PSG|GMR|OEMP
	AccountType type;
	AccountRole role;
	
	AccountStatus status;
	
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
	
	String emailAddress;
	
	Date created;
}
