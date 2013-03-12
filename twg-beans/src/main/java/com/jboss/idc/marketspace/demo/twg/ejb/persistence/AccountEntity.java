package com.jboss.idc.marketspace.demo.twg.ejb.persistence;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.jboss.idc.markespace.demo.twg.api.AccountRole;
import com.jboss.idc.markespace.demo.twg.api.AccountStatus;
import com.jboss.idc.markespace.demo.twg.api.AccountType;

@Entity
@Table(name = "tbl_accounts")
@Cacheable
public class AccountEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_accounts")
    @SequenceGenerator(name = "sequence_accounts",
            sequenceName = "sequence_accounts")
	private Integer id;
	
	private String username;
	private String password;
	
	// BUYR, SELR, EMPL
	@Enumerated(EnumType.STRING)
	private AccountType type;
	
	// BUYR - COL|DLR|GLY, SELR - ART|DLR|GLY, EMPL - CCS|PSG|GMR|OEMP
	@Enumerated(EnumType.STRING)
	private AccountRole role;
	
	private AccountStatus status;
	
	private String firstName;
	private String lastName;
	
	private String company;
	
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	private String homePhone;
	private String mobilePhone;
	
	private String emailAddress;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	@Version
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public AccountRole getRole() {
		return role;
	}

	public void setRole(AccountRole role) {
		this.role = role;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
