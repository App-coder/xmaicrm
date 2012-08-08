package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmGathersrecords {
    private Integer gathersrecordsid;

    private String gathersrecordname;

    private Integer accountid;

    private Integer vendorid;

    private String total;

    private Date gathersrecord1525;

    private BigDecimal gathersrecord1527;

    private String gathersrecord1571;

    private String gathersrecord1640;

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

    public Integer getGathersrecordsid() {
        return gathersrecordsid;
    }

    public void setGathersrecordsid(Integer gathersrecordsid) {
        this.gathersrecordsid = gathersrecordsid;
    }

    public String getGathersrecordname() {
        return gathersrecordname;
    }

    public void setGathersrecordname(String gathersrecordname) {
        this.gathersrecordname = gathersrecordname == null ? null : gathersrecordname.trim();
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    public Date getGathersrecord1525() {
        return gathersrecord1525;
    }

    public void setGathersrecord1525(Date gathersrecord1525) {
        this.gathersrecord1525 = gathersrecord1525;
    }

    public BigDecimal getGathersrecord1527() {
        return gathersrecord1527;
    }

    public void setGathersrecord1527(BigDecimal gathersrecord1527) {
        this.gathersrecord1527 = gathersrecord1527;
    }

    public String getGathersrecord1571() {
        return gathersrecord1571;
    }

    public void setGathersrecord1571(String gathersrecord1571) {
        this.gathersrecord1571 = gathersrecord1571 == null ? null : gathersrecord1571.trim();
    }

    public String getGathersrecord1640() {
        return gathersrecord1640;
    }

    public void setGathersrecord1640(String gathersrecord1640) {
        this.gathersrecord1640 = gathersrecord1640 == null ? null : gathersrecord1640.trim();
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