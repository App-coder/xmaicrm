package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmGathers {
    private Integer gathersid;

    private String gathername;

    private Integer accountid;

    private Integer salesorderid;

    private Integer invoiceid;

    private Date plandate;

    private Date actualdate;

    private BigDecimal planamount;

    private BigDecimal actualamount;

    private String amountcomment;

    private String gatherstatus;

    private String isinvoice;

    private String gathertimes;

    private String currency;

    private BigDecimal currencyRate;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String description;
    
    /**
     * 应收款总额
     */
    private BigDecimal sumgathersplan;
    
    /**
     * 应付款总额
     */
    private BigDecimal sumchargesplan;

    public Integer getGathersid() {
        return gathersid;
    }

    public void setGathersid(Integer gathersid) {
        this.gathersid = gathersid;
    }

    public String getGathername() {
        return gathername;
    }

    public void setGathername(String gathername) {
        this.gathername = gathername == null ? null : gathername.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(Integer salesorderid) {
        this.salesorderid = salesorderid;
    }

    public Integer getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    public Date getPlandate() {
        return plandate;
    }

    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    public Date getActualdate() {
        return actualdate;
    }

    public void setActualdate(Date actualdate) {
        this.actualdate = actualdate;
    }

    public BigDecimal getPlanamount() {
        return planamount;
    }

    public void setPlanamount(BigDecimal planamount) {
        this.planamount = planamount;
    }

    public BigDecimal getActualamount() {
        return actualamount;
    }

    public void setActualamount(BigDecimal actualamount) {
        this.actualamount = actualamount;
    }

    public String getAmountcomment() {
        return amountcomment;
    }

    public void setAmountcomment(String amountcomment) {
        this.amountcomment = amountcomment == null ? null : amountcomment.trim();
    }

    public String getGatherstatus() {
        return gatherstatus;
    }

    public void setGatherstatus(String gatherstatus) {
        this.gatherstatus = gatherstatus == null ? null : gatherstatus.trim();
    }

    public String getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(String isinvoice) {
        this.isinvoice = isinvoice == null ? null : isinvoice.trim();
    }

    public String getGathertimes() {
        return gathertimes;
    }

    public void setGathertimes(String gathertimes) {
        this.gathertimes = gathertimes == null ? null : gathertimes.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public BigDecimal getSumgathersplan() {
		return sumgathersplan;
	}

	public void setSumgathersplan(BigDecimal sumgathersplan) {
		this.sumgathersplan = sumgathersplan;
	}

	public BigDecimal getSumchargesplan() {
		return sumchargesplan;
	}

	public void setSumchargesplan(BigDecimal sumchargesplan) {
		this.sumchargesplan = sumchargesplan;
	}
    
    
    
}