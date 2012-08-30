package com.crm.model;

public class XmSerialtransfers {
    private Integer serialtransfersid;

    private Integer entityid;

    private Integer productid;

    private Integer serialid;

    private String setype;

    public Integer getSerialtransfersid() {
        return serialtransfersid;
    }

    public void setSerialtransfersid(Integer serialtransfersid) {
        this.serialtransfersid = serialtransfersid;
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