package com.crm.model;

public class XmHeaders {
    private Integer fileid;

    private String headernames;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getHeadernames() {
        return headernames;
    }

    public void setHeadernames(String headernames) {
        this.headernames = headernames == null ? null : headernames.trim();
    }
}