package com.crm.model;

public class XmOrgShareActionMapping {
    private Integer shareActionId;

    private String shareActionName;

    public Integer getShareActionId() {
        return shareActionId;
    }

    public void setShareActionId(Integer shareActionId) {
        this.shareActionId = shareActionId;
    }

    public String getShareActionName() {
        return shareActionName;
    }

    public void setShareActionName(String shareActionName) {
        this.shareActionName = shareActionName == null ? null : shareActionName.trim();
    }
}