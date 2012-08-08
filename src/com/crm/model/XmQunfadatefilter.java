package com.crm.model;

import java.util.Date;

public class XmQunfadatefilter {
    private Integer datefilterid;

    private String datecolumnname;

    private String datefilter;

    private Date startdate;

    private Date enddate;

    public Integer getDatefilterid() {
        return datefilterid;
    }

    public void setDatefilterid(Integer datefilterid) {
        this.datefilterid = datefilterid;
    }

    public String getDatecolumnname() {
        return datecolumnname;
    }

    public void setDatecolumnname(String datecolumnname) {
        this.datecolumnname = datecolumnname == null ? null : datecolumnname.trim();
    }

    public String getDatefilter() {
        return datefilter;
    }

    public void setDatefilter(String datefilter) {
        this.datefilter = datefilter == null ? null : datefilter.trim();
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