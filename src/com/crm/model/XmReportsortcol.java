package com.crm.model;

public class XmReportsortcol {
    private Integer reportid;

    private Integer sortcolid;

    private String columnname;

    private String sortorder;

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public Integer getSortcolid() {
        return sortcolid;
    }

    public void setSortcolid(Integer sortcolid) {
        this.sortcolid = sortcolid;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getSortorder() {
        return sortorder;
    }

    public void setSortorder(String sortorder) {
        this.sortorder = sortorder == null ? null : sortorder.trim();
    }
}