package com.crm.model;

public class XmCvcolumnlist {
    private Integer columnindex;

    private Integer cvid;

    private String columnname;

    public Integer getColumnindex() {
        return columnindex;
    }

    public void setColumnindex(Integer columnindex) {
        this.columnindex = columnindex;
    }

    public Integer getCvid() {
        return cvid;
    }

    public void setCvid(Integer cvid) {
        this.cvid = cvid;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }
}