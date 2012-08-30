package com.crm.model;

import java.util.Date;

public class XmWeeklylogs {
    private Integer weeklylogsid;

    private Integer status;

    private Date createdtime;

    private Integer smownerid;

    private Date startdate;

    private Date enddate;

    private String description;

    private String curplan;

    public Integer getWeeklylogsid() {
        return weeklylogsid;
    }

    public void setWeeklylogsid(Integer weeklylogsid) {
        this.weeklylogsid = weeklylogsid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCurplan() {
        return curplan;
    }

    public void setCurplan(String curplan) {
        this.curplan = curplan == null ? null : curplan.trim();
    }
}