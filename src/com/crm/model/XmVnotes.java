package com.crm.model;

import java.util.Date;

public class XmVnotes {
    private Integer vnotesid;

    private String vnotename;

    private Integer vendorId;

    private Integer vcontactsid;

    private String vnoteType;

    private Date vnoteDate;

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

    public Integer getVnotesid() {
        return vnotesid;
    }

    public void setVnotesid(Integer vnotesid) {
        this.vnotesid = vnotesid;
    }

    public String getVnotename() {
        return vnotename;
    }

    public void setVnotename(String vnotename) {
        this.vnotename = vnotename == null ? null : vnotename.trim();
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getVcontactsid() {
        return vcontactsid;
    }

    public void setVcontactsid(Integer vcontactsid) {
        this.vcontactsid = vcontactsid;
    }

    public String getVnoteType() {
        return vnoteType;
    }

    public void setVnoteType(String vnoteType) {
        this.vnoteType = vnoteType == null ? null : vnoteType.trim();
    }

    public Date getVnoteDate() {
        return vnoteDate;
    }

    public void setVnoteDate(Date vnoteDate) {
        this.vnoteDate = vnoteDate;
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