package com.crm.model;

import java.util.Date;

public class XmAuditTrial {
    private Integer auditid;

    private Integer userid;

    private String module;

    private String action;

    private String recordid;

    private Date actiondate;

    public Integer getAuditid() {
        return auditid;
    }

    public void setAuditid(Integer auditid) {
        this.auditid = auditid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public Date getActiondate() {
        return actiondate;
    }

    public void setActiondate(Date actiondate) {
        this.actiondate = actiondate;
    }
}