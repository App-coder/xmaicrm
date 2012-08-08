package com.crm.model;

public class XmReportsummary {
    private String columnname;

    private Integer reportsummaryid;

    private Integer summarytype;

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public Integer getReportsummaryid() {
        return reportsummaryid;
    }

    public void setReportsummaryid(Integer reportsummaryid) {
        this.reportsummaryid = reportsummaryid;
    }

    public Integer getSummarytype() {
        return summarytype;
    }

    public void setSummarytype(Integer summarytype) {
        this.summarytype = summarytype;
    }
}