package com.jboss.idc.marketspace.demo.twg.crm.ejb.persistence;


import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.jboss.idc.markespace.demo.twg.crm.api.AccountRole;
import com.jboss.idc.markespace.demo.twg.crm.api.AccountStatus;
import com.jboss.idc.markespace.demo.twg.crm.api.AccountType;

@Entity
@Table(name = "tbl_accounts")                   // ACCOUNTS
@Cacheable
public class AccountEntity {
    
    @Id
    private String id;                          // Account_ID_c                      char(16)
    
    @Enumerated(EnumType.STRING)
    private AccountType type;                   // User_Domain_c                     char(4)
    
    @Enumerated(EnumType.STRING)
    private AccountRole role;                   // User_Type_c                       char(3)
    
    @Enumerated(EnumType.STRING)
    private AccountStatus status;               // Account_Status_c                  char(6)
    
    private String name;                        // Name                              char(16)
    private String lastName;                    // Last_Name_c                       char(16)
    
    private String streetAddress;               // Street_Address_c                  char(24)
    private String city;                        // City_c                            char(20)
    private String state;                       // State_c                           char(2)
    private String country;                     // Country_c                         char(10)
    private String zipCode;                     // Zip_Code_c                        char(5) 3.0
    
    private String homePhone;                   // Home_Phone_Number_c               char(16)
    private String mobilePhone;                 // Mobile_Phone_Number_c             char(16)
    
    private String emailAddress;                // Email_c                           char(36)
    
    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
