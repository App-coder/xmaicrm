package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmComputerregs {
    private Integer computerregsid;

    private String computerregname;

    private Integer accountid;

    private Integer contactId;

    private Integer potentialid;

    private Integer salesorderid;

    private Integer vendorid;

    private Integer purchaseorderid;

    private BigDecimal total;

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

    public Integer getComputerregsid() {
        return computerregsid;
    }

    public void setComputerregsid(Integer computerregsid) {
        this.computerregsid = computerregsid;
    }

    public String getComputerregname() {
        return computerregname;
    }

    public void setComputerregname(String computerregname) {
        this.computerregname = computerregname == null ? null : computerregname.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getPotentialid() {
        return potentialid;
    }

    public void setPotentialid(Integer potentialid) {
        this.potentialid = potentialid;
    }

    public Integer getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(Integer salesorderid) {
        this.salesorderid = salesorderid;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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