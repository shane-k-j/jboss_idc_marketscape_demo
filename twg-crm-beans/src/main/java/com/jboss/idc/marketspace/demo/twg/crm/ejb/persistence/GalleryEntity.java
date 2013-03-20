package com.jboss.idc.marketspace.demo.twg.crm.ejb.persistence;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_galleries")                  // GALLERIES
@Cacheable
public class GalleryEntity {

    @Id
    private String id;                          // Gallery_ID_Number_c               char(16)
    
    private String name;                        // Name                              char(24)
    
    private String streetAddress;               // Street_Address_c                  char(24)
    private String city;                        // City_c                            char(20)
    private String state;                       // State_c                           char(2)
    private String country;                     // Country_c                         char(10)
    private String zipCode;                     // Zip_Code_c                        char(5)
    
    private String phoneNumber;                 // Gallery_Phone_Number_c            char(16)
    
    private String managerId;                   // Gallery_Manager_user_ID_c (FK)    char(16)
    
    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
