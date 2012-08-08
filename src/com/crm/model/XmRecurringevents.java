package com.crm.model;

import java.util.Date;

public class XmRecurringevents {
    private Integer recurringid;

    private Integer activityid;

    private Date recurringdate;

    private String recurringtype;

    private Integer recurringfreq;

    private String recurringinfo;

    public Integer getRecurringid() {
        return recurringid;
    }

    public void setRecurringid(Integer recurringid) {
        this.recurringid = recurringid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Date getRecurringdate() {
        return recurringdate;
    }

    public void setRecurringdate(Date recurringdate) {
        this.recurringdate = recurringdate;
    }

    public String getRecurringtype() {
        return recurringtype;
    }

    public void setRecurringtype(String recurringtype) {
        this.recurringtype = recurringtype == null ? null : recurringtype.trim();
    }

    public Integer getRecurringfreq() {
        return recurringfreq;
    }

    public void setRecurringfreq(Integer recurringfreq) {
        this.recurringfreq = recurringfreq;
    }

    public String getRecurringinfo() {
        return recurringinfo;
    }

    public void setRecurringinfo(String recurringinfo) {
        this.recurringinfo = recurringinfo == null ? null : recurringinfo.trim();
    }
}