package com.crm.model;

public class XmKeyuser {
    private Integer userid;

    private String type;

    private Integer iskeyuser;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIskeyuser() {
        return iskeyuser;
    }

    public void setIskeyuser(Integer iskeyuser) {
        this.iskeyuser = iskeyuser;
    }
}