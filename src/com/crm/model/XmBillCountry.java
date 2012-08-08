package com.crm.model;

public class XmBillCountry {
    private Integer actualfieldid;

    private String actualfieldname;

    private Integer sortorderid;

    private Integer presence;

    private Integer thelevel;

    private Integer parentfieldid;

    public Integer getActualfieldid() {
        return actualfieldid;
    }

    public void setActualfieldid(Integer actualfieldid) {
        this.actualfieldid = actualfieldid;
    }

    public String getActualfieldname() {
        return actualfieldname;
    }

    public void setActualfieldname(String actualfieldname) {
        this.actualfieldname = actualfieldname == null ? null : actualfieldname.trim();
    }

    public Integer getSortorderid() {
        return sortorderid;
    }

    public void setSortorderid(Integer sortorderid) {
        this.sortorderid = sortorderid;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public Integer getThelevel() {
        return thelevel;
    }

    public void setThelevel(Integer thelevel) {
        this.thelevel = thelevel;
    }

    public Integer getParentfieldid() {
        return parentfieldid;
    }

    public void setParentfieldid(Integer parentfieldid) {
        this.parentfieldid = parentfieldid;
    }
}