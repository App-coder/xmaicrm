package com.crm.model;

public class XmApprove2user {
    private Integer approveid;

    private String userid;

    public Integer getApproveid() {
        return approveid;
    }

    public void setApproveid(Integer approveid) {
        this.approveid = approveid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}