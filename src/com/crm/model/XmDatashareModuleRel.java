package com.crm.model;

public class XmDatashareModuleRel {
    private Integer shareid;

    private Integer tabid;

    private String relationtype;

    public Integer getShareid() {
        return shareid;
    }

    public void setShareid(Integer shareid) {
        this.shareid = shareid;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype == null ? null : relationtype.trim();
    }
}