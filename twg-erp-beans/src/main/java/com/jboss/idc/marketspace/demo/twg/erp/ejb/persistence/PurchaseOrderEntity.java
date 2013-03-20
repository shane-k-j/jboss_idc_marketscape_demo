package com.jboss.idc.marketspace.demo.twg.erp.ejb.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import com.jboss.idc.markespace.demo.twg.erp.api.OrderStatus;

@Entity
@Table(name = "tbl_purchase_orders")            // ORDERS
@Cacheable
public class PurchaseOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_purchase_orders")
    @SequenceGenerator(name = "seq_purchase_orders", sequenceName = "seq_purchase_orders")
    private Integer id;                         // O_ID                         char(16)
    
    private String purchaserId;                 // O_U_ID                       char(16)
    
    @Enumerated(EnumType.STRING)
    private OrderStatus status;                 // O_STATUS                     char(3)
    
    private Date date;                          // O_ENTRY_DATE                 date
    
    /*
     * O_A_STATUS   (look up via purchaser id)
     * O_OL_CNT     (calculate)
     * O_TOTAL      (calculate)
     */
    
    @Version
    private Integer version;
    
    @OneToMany(mappedBy="purchaseOrder")
    private List<LineItemEntity> lineItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<LineItemEntity> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItemEntity> lineItems) {
        this.lineItems = lineItems;
    }
}
