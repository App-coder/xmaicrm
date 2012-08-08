package com.crm.model;

import java.util.Date;

public class XmSostatushistory {
    private Integer historyid;

    private Integer salesorderid;

    private String accountname;

    private Long total;

    private String sostatus;

    private Date lastmodified;

    public Integer getHistoryid() {
        return historyid;
    }

    public void setHistoryid(Integer historyid) {
        this.historyid = historyid;
    }

    public Integer getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(Integer salesorderid) {
        this.salesorderid = salesorderid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getSostatus() {
        return sostatus;
    }

    public void setSostatus(String sostatus) {
        this.sostatus = sostatus == null ? null : sostatus.trim();
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }
}