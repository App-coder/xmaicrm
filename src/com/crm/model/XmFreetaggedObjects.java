package com.crm.model;

import java.util.Date;

public class XmFreetaggedObjects {
    private Integer objectId;

    private Integer tagId;

    private Integer taggerId;

    private Date taggedOn;

    private String module;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getTaggerId() {
        return taggerId;
    }

    public void setTaggerId(Integer taggerId) {
        this.taggerId = taggerId;
    }

    public Date getTaggedOn() {
        return taggedOn;
    }

    public void setTaggedOn(Date taggedOn) {
        this.taggedOn = taggedOn;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }
}