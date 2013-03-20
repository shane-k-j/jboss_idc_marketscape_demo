package com.jboss.idc.marketspace.demo.twg.erp.ejb.persistence;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import com.jboss.idc.markespace.demo.twg.erp.api.PieceType;

@Entity
@Table(name = "tbl_pieces")                     // ERP_USERS
@Cacheable
public class Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pieces")
    @SequenceGenerator(name = "seq_pieces", sequenceName = "seq_pieces")
    private Integer id;                         // IN_P_ID                      char(20) not null
    
    private String title;                       // IN_TITLE                     char(30)
    
    private String imageFileName;               // IN_IMAGE                     BLOB
    
    @Enumerated(EnumType.STRING)
    private PieceType type;                     // IN_TYPE                      char(8)
    
    private String firstName;                   // IN_FIRST                     char(16)
    private String lastName;                    // IN_LAST                      char(16)
    
    private Integer quantity;                   // IN_QTY                       integer
    
    private String galleryId;                   // IN_LOCATION                  integer not null
    
    private Float msrp;                         // IN_S_PRICE                   numeric(12,2)
    private Float price;                        // IN_P_PRICE                   numeric(12,2)
    
    @Version
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(String galleryId) {
        this.galleryId = galleryId;
    }

    public Float getMsrp() {
        return msrp;
    }

    public void setMsrp(Float msrp) {
        this.msrp = msrp;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
