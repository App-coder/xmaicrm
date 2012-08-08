package com.crm.model;

import java.util.Date;

public class XmDailylogs {
    private Integer dailylogsid;

    private Integer status;

    private Date createdtime;

    private Integer smownerid;

    private Date startdate;

    private String description;

    private String curplan;

    public Integer getDailylogsid() {
        return dailylogsid;
    }

    public void setDailylogsid(Integer dailylogsid) {
        this.dailylogsid = dailylogsid;
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