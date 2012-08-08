package com.crm.model;

public class XmActionmapping {
    private Integer actionid;

    private String actionname;

    private Integer securitycheck;

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public Integer getSecuritycheck() {
        return securitycheck;
    }

    public void setSecuritycheck(Integer securitycheck) {
        this.securitycheck = securitycheck;
    }
}