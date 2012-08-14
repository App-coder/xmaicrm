package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmTuihuos {
    private Integer tuihuosid;

    private String tuihuoname;

    private Integer accountid;

    private Date tuihuodate;

    private String tuihuostatus;

    private BigDecimal total;

    private String tuihuoperson;

    private String customernum;

    private String tuihuoreason;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private Integer cangkusid;

    private String currency;

    private BigDecimal currencyRate;

    private String description;
    
    private String userName;

    public Integer getTuihuosid() {
        return tuihuosid;
    }

    public void setTuihuosid(Integer tuihuosid) {
        this.tuihuosid = tuihuosid;
    }

    public String getTuihuoname() {
        return tuihuoname;
    }

    public void setTuihuoname(String tuihuoname) {
        this.tuihuoname = tuihuoname == null ? null : tuihuoname.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Date getTuihuodate() {
        return tuihuodate;
    }

    public void setTuihuodate(Date tuihuodate) {
        this.tuihuodate = tuihuodate;
    }

    public String getTuihuostatus() {
        return tuihuostatus;
    }

    public void setTuihuostatus(String tuihuostatus) {
        this.tuihuostatus = tuihuostatus == null ? null : tuihuostatus.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTuihuoperson() {
        return tuihuoperson;
    }

    public void setTuihuoperson(String tuihuoperson) {
        this.tuihuoperson = tuihuoperson == null ? null : tuihuoperson.trim();
    }

    public String getCustomernum() {
        return customernum;
    }

    public void setCustomernum(String customernum) {
        this.customernum = customernum == null ? null : customernum.trim();
    }

    public String getTuihuoreason() {
        return tuihuoreason;
    }

    public void setTuihuoreason(String tuihuoreason) {
        this.tuihuoreason = tuihuoreason == null ? null : tuihuoreason.trim();
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(Integer approvedby) {
        this.approvedby = approvedby;
    }

    public Integer getCangkusid() {
        return cangkusid;
    }

    public void setCangkusid(Integer cangkusid) {
        this.cangkusid = cangkusid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
    
}