package com.crm.model;

import java.util.Date;

public class XmHometemplates {
    private Integer hometemplatesid;

    private String hometemplatesname;

    private Integer smcreatorid;

    private Integer modifiedby;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    public Integer getHometemplatesid() {
        return hometemplatesid;
    }

    public void setHometemplatesid(Integer hometemplatesid) {
        this.hometemplatesid = hometemplatesid;
    }

    public String getHometemplatesname() {
        return hometemplatesname;
    }

    public void setHometemplatesname(String hometemplatesname) {
        this.hometemplatesname = hometemplatesname == null ? null : hometemplatesname.trim();
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