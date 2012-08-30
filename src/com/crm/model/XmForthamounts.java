package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmForthamounts {
    private Integer forthid;

    private Integer entityid;

    private String subject;

    private String modulename;

    private String setype;

    private Integer accountid;

    private Integer vendorid;

    private Date duedate;

    private String status;

    private BigDecimal gathersamount;

    private BigDecimal chargesamount;

    private BigDecimal gathersrecords;

    private BigDecimal chargesrecords;

    private Integer checkout;

    private Integer smcreatorid;

    private Integer modifiedby;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    public Integer getForthid() {
        return forthid;
    }

    public void setForthid(Integer forthid) {
        this.forthid = forthid;
    }

    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getSetype() {
        return setype;
    }

    public void setSetype(String setype) {
        this.setype = setype == null ? null : setype.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getVendorid() {
        return vendorid;
    }

    public void setVendorid(Integer vendorid) {
        this.vendorid = vendorid;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getGathersamount() {
        return gathersamount;
    }

    public void setGathersamount(BigDecimal gathersamount) {
        this.gathersamount = gathersamount;
    }

    public BigDecimal getChargesamount() {
        return chargesamount;
    }

    public void setChargesamount(BigDecimal chargesamount) {
        this.chargesamount = chargesamount;
    }

    public BigDecimal getGathersrecords() {
        return gathersrecords;
    }

    public void setGathersrecords(BigDecimal gathersrecords) {
        this.gathersrecords = gathersrecords;
    }

    public BigDecimal getChargesrecords() {
        return chargesrecords;
    }

    public void setChargesrecords(BigDecimal chargesrecords) {
        this.chargesrecords = chargesrecords;
    }

    public Integer getCheckout() {
        return checkout;
    }

    public void setCheckout(Integer checkout) {
        this.checkout = checkout;
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
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
}