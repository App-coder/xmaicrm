package com.crm.model;

public class XmSelectcolumn {
    private Integer columnindex;

    private Integer queryid;

    private String columnname;

    public Integer getColumnindex() {
        return columnindex;
    }

    public void setColumnindex(Integer columnindex) {
        this.columnindex = columnindex;
    }

    public Integer getQueryid() {
        return queryid;
    }

    public void setQueryid(Integer queryid) {
        this.queryid = queryid;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }
}