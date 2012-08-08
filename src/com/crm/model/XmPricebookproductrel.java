package com.crm.model;

import java.math.BigDecimal;

public class XmPricebookproductrel {
    private Integer pricebookid;

    private Integer productid;

    private BigDecimal listprice;

    public Integer getPricebookid() {
        return pricebookid;
    }

    public void setPricebookid(Integer pricebookid) {
        this.pricebookid = pricebookid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public BigDecimal getListprice() {
        return listprice;
    }

    public void setListprice(BigDecimal listprice) {
        this.listprice = listprice;
    }
}