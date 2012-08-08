package com.crm.model;

import java.util.Date;

public class XmNoteplans {
    private Integer noteplansid;

    private String noteplanname;

    private String isRl;

    private String planstatus;

    private String ischangedsmow;

    private Date startdate;

    private Date enddate;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String executor;

    private String description;

    public Integer getNoteplansid() {
        return noteplansid;
    }

    public void setNoteplansid(Integer noteplansid) {
        this.noteplansid = noteplansid;
    }

    public String getNoteplanname() {
        return noteplanname;
    }

    public void setNoteplanname(String noteplanname) {
        this.noteplanname = noteplanname == null ? null : noteplanname.trim();
    }

    public String getIsRl() {
        return isRl;
    }

    public void setIsRl(String isRl) {
        this.isRl = isRl == null ? null : isRl.trim();
    }

    public String getPlanstatus() {
        return planstatus;
    }

    public void setPlanstatus(String planstatus) {
        this.planstatus = planstatus == null ? null : planstatus.trim();
    }

    public String getIschangedsmow() {
        return ischangedsmow;
    }

    public void setIschangedsmow(String ischangedsmow) {
        this.ischangedsmow = ischangedsmow == null ? null : ischangedsmow.trim();
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

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(Integer approvedby) {
        this.approvedby = approvedby;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor == null ? null : executor.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}