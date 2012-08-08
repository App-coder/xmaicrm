package com.crm.model;

import java.util.Date;

public class XmQuotestagehistory {
    private Integer historyid;

    private Integer quoteid;

    private String accountname;

    private Long total;

    private String quotestage;

    private Date lastmodified;

    public Integer getHistoryid() {
        return historyid;
    }

    public void setHistoryid(Integer historyid) {
        this.historyid = historyid;
    }

    public Integer getQuoteid() {
        return quoteid;
    }

    public void setQuoteid(Integer quoteid) {
        this.quoteid = quoteid;
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

    public String getQuotestage() {
        return quotestage;
    }

    public void setQuotestage(String quotestage) {
        this.quotestage = quotestage == null ? null : quotestage.trim();
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }
}