package com.crm.model;

import java.util.Date;

public class XmAssignhistory {
    private Integer accountid;

    private Integer userid;

    private Date startdate;

    private Date enddate;

    private Integer type;

    private Integer operatorid;

    private Date assigntime;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Date getAssigntime() {
        return assigntime;
    }

    public void setAssigntime(Date assigntime) {
        this.assigntime = assigntime;
    }
}