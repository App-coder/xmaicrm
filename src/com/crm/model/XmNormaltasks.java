package com.crm.model;

import java.util.Date;

public class XmNormaltasks {
    private Integer normaltasksid;

    private String normaltaskname;

    private Integer accountid;

    private Integer noteplansid;

    private Integer taskstatus;

    private Integer transferto;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private String description;

    public Integer getNormaltasksid() {
        return normaltasksid;
    }

    public void setNormaltasksid(Integer normaltasksid) {
        this.normaltasksid = normaltasksid;
    }

    public String getNormaltaskname() {
        return normaltaskname;
    }

    public void setNormaltaskname(String normaltaskname) {
        this.normaltaskname = normaltaskname == null ? null : normaltaskname.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getNoteplansid() {
        return noteplansid;
    }

    public void setNoteplansid(Integer noteplansid) {
        this.noteplansid = noteplansid;
    }

    public Integer getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(Integer taskstatus) {
        this.taskstatus = taskstatus;
    }

    public Integer getTransferto() {
        return transferto;
    }

    public void setTransferto(Integer transferto) {
        this.transferto = transferto;
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}