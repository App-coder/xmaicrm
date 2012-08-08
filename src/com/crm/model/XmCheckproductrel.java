package com.crm.model;

import java.math.BigDecimal;

public class XmCheckproductrel {
    private Integer checksid;

    private Integer id;

    private Integer productid;

    private BigDecimal qtyinstock;

    private BigDecimal qtyinreal;

    private BigDecimal qtyinmol;

    private String storetype;

    private String comment;

    public Integer getChecksid() {
        return checksid;
    }

    public void setChecksid(Integer checksid) {
        this.checksid = checksid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public BigDecimal getQtyinstock() {
        return qtyinstock;
    }

    public void setQtyinstock(BigDecimal qtyinstock) {
        this.qtyinstock = qtyinstock;
    }

    public BigDecimal getQtyinreal() {
        return qtyinreal;
    }

    public void setQtyinreal(BigDecimal qtyinreal) {
        this.qtyinreal = qtyinreal;
    }

    public BigDecimal getQtyinmol() {
        return qtyinmol;
    }

    public void setQtyinmol(BigDecimal qtyinmol) {
        this.qtyinmol = qtyinmol;
    }

    public String getStoretype() {
        return storetype;
    }

    public void setStoretype(String storetype) {
        this.storetype = storetype == null ? null : storetype.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}