package com.crm.model;

public class XmGroup2rs {
    private Integer groupid;

    private String roleandsubid;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getRoleandsubid() {
        return roleandsubid;
    }

    public void setRoleandsubid(String roleandsubid) {
        this.roleandsubid = roleandsubid == null ? null : roleandsubid.trim();
    }
}