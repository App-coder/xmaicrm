package com.crm.model;

import java.util.Date;

public class XmReminders {
    private Integer reminderid;

    private Date createdtime;

    private Date remindertime;

    private Integer crmid;

    private Integer userid;

    private Integer isused;

    private String comments;

    public Integer getReminderid() {
        return reminderid;
    }

    public void setReminderid(Integer reminderid) {
        this.reminderid = reminderid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getRemindertime() {
        return remindertime;
    }

    public void setRemindertime(Date remindertime) {
        this.remindertime = remindertime;
    }

    public Integer getCrmid() {
        return crmid;
    }

    public void setCrmid(Integer crmid) {
        this.crmid = crmid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}