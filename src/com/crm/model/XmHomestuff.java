package com.crm.model;

public class XmHomestuff {
    private Integer stuffid;

    private String stufftype;

    private Integer stuffsequence;

    private Integer userid;

    private Integer visible;

    private String stufftitle;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getStufftitle() {
        return stufftitle;
    }

    public void setStufftitle(String stufftitle) {
        this.stufftitle = stufftitle == null ? null : stufftitle.trim();
    }
}