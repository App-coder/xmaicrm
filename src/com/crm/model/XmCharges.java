package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmCharges {
    private Integer chargesid;

    private String chargename;

    private Integer vendorid;

    private Integer purchaseorderid;

    private Date plandate;

    private Date actualdate;

    private BigDecimal planamount;

    private BigDecimal actualamount;

    private String amountcomment;

    private String chargestatus;

    private String isinvoice;

    private String chargetimes;

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

    private Integer tuihuosid;

    private Integer accountid;

    private String cf692;

    private String description;

    public Integer getChargesid() {
        return chargesid;
    }

    public void setChargesid(Integer chargesid) {
        this.chargesid = chargesid;
    }

    public String getChargename() {
        return chargename;
    }

    public void setChargename(String chargename) {
        this.chargename = chargename == null ? null : chargename.trim();
    }

    public Integer getVendorid() {
        return vendorid;
    }

    public void setVendorid(Integer vendorid) {
        this.vendorid = vendorid;
    }

    public Integer getPurchaseorderid() {
        return purchaseorderid;
    }

    public void setPurchaseorderid(Integer purchaseorderid) {
        this.purchaseorderid = purchaseorderid;
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

    public String getChargestatus() {
        return chargestatus;
    }

    public void setChargestatus(String chargestatus) {
        this.chargestatus = chargestatus == null ? null : chargestatus.trim();
    }

    public String getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(String isinvoice) {
        this.isinvoice = isinvoice == null ? null : isinvoice.trim();
    }

    public String getChargetimes() {
        return chargetimes;
    }

    public void setChargetimes(String chargetimes) {
        this.chargetimes = chargetimes == null ? null : chargetimes.trim();
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

    public Integer getTuihuosid() {
        return tuihuosid;
    }

    public void setTuihuosid(Integer tuihuosid) {
        this.tuihuosid = tuihuosid;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getCf692() {
        return cf692;
    }

    public void setCf692(String cf692) {
        this.cf692 = cf692 == null ? null : cf692.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}