package com.crm.model;

public class XmHometemplatesportlets {
    private Integer hometemplatesid;

    private String portletsTitle;

    public Integer getHometemplatesid() {
        return hometemplatesid;
    }

    public void setHometemplatesid(Integer hometemplatesid) {
        this.hometemplatesid = hometemplatesid;
    }

    public String getPortletsTitle() {
        return portletsTitle;
    }

    public void setPortletsTitle(String portletsTitle) {
        this.portletsTitle = portletsTitle == null ? null : portletsTitle.trim();
    }
}