package com.crm.model;

public class XmCustomview {
    private Integer cvid;

    private String viewname;

    private Integer setdefault;

    private Integer setmetrics;

    private String entitytype;

    private String setpublic;

    private String collectcolumn;

    public Integer getCvid() {
        return cvid;
    }

    public void setCvid(Integer cvid) {
        this.cvid = cvid;
    }

    public String getViewname() {
        return viewname;
    }

    public void setViewname(String viewname) {
        this.viewname = viewname == null ? null : viewname.trim();
    }

    public Integer getSetdefault() {
        return setdefault;
    }

    public void setSetdefault(Integer setdefault) {
        this.setdefault = setdefault;
    }

    public Integer getSetmetrics() {
        return setmetrics;
    }

    public void setSetmetrics(Integer setmetrics) {
        this.setmetrics = setmetrics;
    }

    public String getEntitytype() {
        return entitytype;
    }

    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype == null ? null : entitytype.trim();
    }

    public String getSetpublic() {
        return setpublic;
    }

    public void setSetpublic(String setpublic) {
        this.setpublic = setpublic == null ? null : setpublic.trim();
    }

    public String getCollectcolumn() {
        return collectcolumn;
    }

    public void setCollectcolumn(String collectcolumn) {
        this.collectcolumn = collectcolumn == null ? null : collectcolumn.trim();
    }
}