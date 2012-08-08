package com.crm.model;

import java.util.Date;

public class XmCvstdfilter {
    private Integer cvid;

    private String columnname;

    private String stdfilter;

    private Date startdate;

    private Date enddate;

    public Integer getCvid() {
        return cvid;
    }

    public void setCvid(Integer cvid) {
        this.cvid = cvid;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getStdfilter() {
        return stdfilter;
    }

    public void setStdfilter(String stdfilter) {
        this.stdfilter = stdfilter == null ? null : stdfilter.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}