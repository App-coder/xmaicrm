package com.crm.model;

public class XmHomedefault {
    private Integer stuffid;

    private String stufftype;

    private Integer stuffsequence;

    public Integer getStuffid() {
        return stuffid;
    }

    public void setStuffid(Integer stuffid) {
        this.stuffid = stuffid;
    }

    public String getStufftype() {
        return stufftype;
    }

    public void setStufftype(String stufftype) {
        this.stufftype = stufftype == null ? null : stufftype.trim();
    }

    public Integer getStuffsequence() {
        return stuffsequence;
    }

    public void setStuffsequence(Integer stuffsequence) {
        this.stuffsequence = stuffsequence;
    }
}