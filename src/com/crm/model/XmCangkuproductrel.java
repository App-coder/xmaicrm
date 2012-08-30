package com.crm.model;

import java.math.BigDecimal;

public class XmCangkuproductrel {
    private Integer cangkusid;

    private Integer productid;

    private BigDecimal productnum;

    public Integer getCangkusid() {
        return cangkusid;
    }

    public void setCangkusid(Integer cangkusid) {
        this.cangkusid = cangkusid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public BigDecimal getProductnum() {
        return productnum;
    }

    public void setProductnum(BigDecimal productnum) {
        this.productnum = productnum;
    }
}