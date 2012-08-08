package com.crm.model;

import java.util.Date;

public class XmSerialnumbers {
    private Integer serialid;

    private String serialname;

    private Integer productid;

    private Integer entityid;

    private Integer cangkusid;

    private String setype;

    private Integer ismakeup;

    private Integer smcreatorid;

    private Date createdtime;

    private Integer modifiedby;

    private Date modifiedtime;

    public Integer getSerialid() {
        return serialid;
    }

    public void setSerialid(Integer serialid) {
        this.serialid = serialid;
    }

    public String getSerialname() {
        return serialname;
    }

    public void setSerialname(String serialname) {
        this.serialname = serialname == null ? null : serialname.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
    }

    public Integer getCangkusid() {
        return cangkusid;
    }

    public void setCangkusid(Integer cangkusid) {
        this.cangkusid = cangkusid;
    }

    public String getSetype() {
        return setype;
    }

    public void setSetype(String setype) {
        this.setype = setype == null ? null : setype.trim();
    }

    public Integer getIsmakeup() {
        return ismakeup;
    }

    public void setIsmakeup(Integer ismakeup) {
        this.ismakeup = ismakeup;
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}