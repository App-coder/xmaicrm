package com.crm.model;

public class XmSerialdeliverys {
    private Integer serialdeliverysid;

    private Integer entityid;

    private Integer productid;

    private Integer serialid;

    private String setype;

    public Integer getSerialdeliverysid() {
        return serialdeliverysid;
    }

    public void setSerialdeliverysid(Integer serialdeliverysid) {
        this.serialdeliverysid = serialdeliverysid;
    }

    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getSerialid() {
        return serialid;
    }

    public void setSerialid(Integer serialid) {
        this.serialid = serialid;
    }

    public String getSetype() {
        return setype;
    }

    public void setSetype(String setype) {
        this.setype = setype == null ? null : setype.trim();
    }
}