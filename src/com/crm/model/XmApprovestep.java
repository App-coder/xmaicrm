package com.crm.model;

import java.util.Date;

public class XmApprovestep {
    private Integer id;

    private Integer approveid;

    private String name;

    private Integer ended;

    private Integer isfirststep;

    private Integer sequnce;

    private Integer nextstep;

    private Date createdAt;

    private Date updatedAt;

    private Integer alterapproveowner;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApproveid() {
        return approveid;
    }

    public void setApproveid(Integer approveid) {
        this.approveid = approveid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEnded() {
        return ended;
    }

    public void setEnded(Integer ended) {
        this.ended = ended;
    }

    public Integer getIsfirststep() {
        return isfirststep;
    }

    public void setIsfirststep(Integer isfirststep) {
        this.isfirststep = isfirststep;
    }

    public Integer getSequnce() {
        return sequnce;
    }

    public void setSequnce(Integer sequnce) {
        this.sequnce = sequnce;
    }

    public Integer getNextstep() {
        return nextstep;
    }

    public void setNextstep(Integer nextstep) {
        this.nextstep = nextstep;
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

    public Integer getAlterapproveowner() {
        return alterapproveowner;
    }

    public void setAlterapproveowner(Integer alterapproveowner) {
        this.alterapproveowner = alterapproveowner;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}