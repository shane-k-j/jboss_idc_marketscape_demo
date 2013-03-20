package com.jboss.idc.marketspace.demo.twg.crm.ejb.persistence;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_users")             // SALESFORCE USER OBJECTS
@Cacheable
public class UserEntity {

    @Id
    private String id;                 // Account ID (FK)                   char(16)

    private String name;               // First Name                        char(16)
    private String lastName;           // Last Name                         char(16)
    
    private String username;           // User ID                           integer
    private String password;           // Password                          char(12)
    
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
