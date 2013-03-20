package com.jboss.idc.marketspace.demo.twg.erp.ejb.persistence;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "tbl_line_items")                 // ORDERS
@Cacheable
public class LineItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_line_items")
    @SequenceGenerator(name = "seq_line_items", sequenceName = "seq_line_items")
    private Integer id;
    
    @ManyToOne
    @JoinColumn
    private Piece piece;                        // OL_P_ID                    char(16)
    
    private Integer quantity;                   // OL_QTY                     integer
    
    private Float price;                        // OL_AS_PRICE                numeric(12,2)
    
    @ManyToOne
    @JoinColumn
    private PurchaseOrderEntity purchaseOrder;  // OL_O_ID                    char(16)
    
    /*
     * OL_O_ID (ignored)
     * OL_TOTAL (calculated)
     */
    
    @Version
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public PurchaseOrderEntity getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrderEntity purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
