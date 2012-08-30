package com.crm.model;

public class XmMultifield {
    private Integer multifieldid;

    private Integer tabid;

    private Integer totallevel;

    private String multifieldname;

    private String tablename;

    public Integer getMultifieldid() {
        return multifieldid;
    }

    public void setMultifieldid(Integer multifieldid) {
        this.multifieldid = multifieldid;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getTotallevel() {
        return totallevel;
    }

    public void setTotallevel(Integer totallevel) {
        this.totallevel = totallevel;
    }

    public String getMultifieldname() {
        return multifieldname;
    }

    public void setMultifieldname(String multifieldname) {
        this.multifieldname = multifieldname == null ? null : multifieldname.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }
}