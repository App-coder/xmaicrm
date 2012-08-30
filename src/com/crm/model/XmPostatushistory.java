package com.crm.model;

import java.util.Date;

public class XmPostatushistory {
    private Integer historyid;

    private Integer purchaseorderid;

    private String vendorname;

    private Long total;

    private String postatus;

    private Date lastmodified;

    public Integer getHistoryid() {
        return historyid;
    }

    public void setHistoryid(Integer historyid) {
        this.historyid = historyid;
    }

    public Integer getPurchaseorderid() {
        return purchaseorderid;
    }

    public void setPurchaseorderid(Integer purchaseorderid) {
        this.purchaseorderid = purchaseorderid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname == null ? null : vendorname.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getPostatus() {
        return postatus;
    }

    public void setPostatus(String postatus) {
        this.postatus = postatus == null ? null : postatus.trim();
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }
}