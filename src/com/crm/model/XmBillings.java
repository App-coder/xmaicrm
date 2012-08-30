package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmBillings {
    private Integer billingsid;

    private String billingname;

    private Integer accountid;

    private String billingtype;

    private BigDecimal billingamount;

    private String billingno;

    private Date billingdate;

    private String billingperson;

    private Integer salesorderid;

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

    public Integer getBillingsid() {
        return billingsid;
    }

    public void setBillingsid(Integer billingsid) {
        this.billingsid = billingsid;
    }

    public String getBillingname() {
        return billingname;
    }

    public void setBillingname(String billingname) {
        this.billingname = billingname == null ? null : billingname.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getBillingtype() {
        return billingtype;
    }

    public void setBillingtype(String billingtype) {
        this.billingtype = billingtype == null ? null : billingtype.trim();
    }

    public BigDecimal getBillingamount() {
        return billingamount;
    }

    public void setBillingamount(BigDecimal billingamount) {
        this.billingamount = billingamount;
    }

    public String getBillingno() {
        return billingno;
    }

    public void setBillingno(String billingno) {
        this.billingno = billingno == null ? null : billingno.trim();
    }

    public Date getBillingdate() {
        return billingdate;
    }

    public void setBillingdate(Date billingdate) {
        this.billingdate = billingdate;
    }

    public String getBillingperson() {
        return billingperson;
    }

    public void setBillingperson(String billingperson) {
        this.billingperson = billingperson == null ? null : billingperson.trim();
    }

    public Integer getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(Integer salesorderid) {
        this.salesorderid = salesorderid;
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
}