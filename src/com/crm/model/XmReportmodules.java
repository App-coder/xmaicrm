package com.crm.model;

public class XmReportmodules {
    private Integer reportmodulesid;

    private String primarymodule;

    private String secondarymodules;

    public Integer getReportmodulesid() {
        return reportmodulesid;
    }

    public void setReportmodulesid(Integer reportmodulesid) {
        this.reportmodulesid = reportmodulesid;
    }

    public String getPrimarymodule() {
        return primarymodule;
    }

    public void setPrimarymodule(String primarymodule) {
        this.primarymodule = primarymodule == null ? null : primarymodule.trim();
    }

    public String getSecondarymodules() {
        return secondarymodules;
    }

    public void setSecondarymodules(String secondarymodules) {
        this.secondarymodules = secondarymodules == null ? null : secondarymodules.trim();
    }
}