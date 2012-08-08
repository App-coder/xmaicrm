package com.crm.model;

import java.util.Date;

public class XmApprovelog {
    private Integer id;

    private Integer crmid;

    private Integer approveid;

    private Integer stepid;

    private Integer approvedBy;

    private Integer approveresult;

    private Date createdAt;

    private Date updatedAt;

    private Integer prestepid;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCrmid() {
        return crmid;
    }

    public void setCrmid(Integer crmid) {
        this.crmid = crmid;
    }

    public Integer getApproveid() {
        return approveid;
    }

    public void setApproveid(Integer approveid) {
        this.approveid = approveid;
    }

    public Integer getStepid() {
        return stepid;
    }

    public void setStepid(Integer stepid) {
        this.stepid = stepid;
    }

    public Integer getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Integer getApproveresult() {
        return approveresult;
    }

    public void setApproveresult(Integer approveresult) {
        this.approveresult = approveresult;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getPrestepid() {
        return prestepid;
    }

    public void setPrestepid(Integer prestepid) {
        this.prestepid = prestepid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}