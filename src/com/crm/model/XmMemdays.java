package com.crm.model;

import java.util.Date;

public class XmMemdays {
    private Integer memdaysid;

    private String memdayname;

    private Date memday946;

    private Integer contactId;

    private Integer accountid;

    private String memday938;

    private String memday940;

    private String memday1004;

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

    public Integer getMemdaysid() {
        return memdaysid;
    }

    public void setMemdaysid(Integer memdaysid) {
        this.memdaysid = memdaysid;
    }

    public String getMemdayname() {
        return memdayname;
    }

    public void setMemdayname(String memdayname) {
        this.memdayname = memdayname == null ? null : memdayname.trim();
    }

    public Date getMemday946() {
        return memday946;
    }

    public void setMemday946(Date memday946) {
        this.memday946 = memday946;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getMemday938() {
        return memday938;
    }

    public void setMemday938(String memday938) {
        this.memday938 = memday938 == null ? null : memday938.trim();
    }

    public String getMemday940() {
        return memday940;
    }

    public void setMemday940(String memday940) {
        this.memday940 = memday940 == null ? null : memday940.trim();
    }

    public String getMemday1004() {
        return memday1004;
    }

    public void setMemday1004(String memday1004) {
        this.memday1004 = memday1004 == null ? null : memday1004.trim();
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