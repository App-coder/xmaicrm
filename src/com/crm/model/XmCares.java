package com.crm.model;

import java.util.Date;

public class XmCares {
    private Integer caresid;

    private String carename;

    private Integer accountid;

    private Integer contactId;

    private Date caredate;

    private String caretype;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String carecontent;

    private String carefankui;

    private String description;

    public Integer getCaresid() {
        return caresid;
    }

    public void setCaresid(Integer caresid) {
        this.caresid = caresid;
    }

    public String getCarename() {
        return carename;
    }

    public void setCarename(String carename) {
        this.carename = carename == null ? null : carename.trim();
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

    public Date getCaredate() {
        return caredate;
    }

    public void setCaredate(Date caredate) {
        this.caredate = caredate;
    }

    public String getCaretype() {
        return caretype;
    }

    public void setCaretype(String caretype) {
        this.caretype = caretype == null ? null : caretype.trim();
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

    public String getCarecontent() {
        return carecontent;
    }

    public void setCarecontent(String carecontent) {
        this.carecontent = carecontent == null ? null : carecontent.trim();
    }

    public String getCarefankui() {
        return carefankui;
    }

    public void setCarefankui(String carefankui) {
        this.carefankui = carefankui == null ? null : carefankui.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}