package com.crm.model;

import java.util.Date;

public class XmDailylogsreply {
    private Integer replysid;

    private Integer smownerid;

    private Date createdtime;

    private Integer logid;

    private String description;

    public Integer getReplysid() {
        return replysid;
    }

    public void setReplysid(Integer replysid) {
        this.replysid = replysid;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}