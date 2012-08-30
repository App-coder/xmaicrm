package com.crm.model;

public class XmReportgraph {
    private Integer reportgraphid;

    private String reportgraphname;

    private String xfieldname;

    private String yfieldname;

    private String groupfieldname;

    public Integer getReportgraphid() {
        return reportgraphid;
    }

    public void setReportgraphid(Integer reportgraphid) {
        this.reportgraphid = reportgraphid;
    }

    public String getReportgraphname() {
        return reportgraphname;
    }

    public void setReportgraphname(String reportgraphname) {
        this.reportgraphname = reportgraphname == null ? null : reportgraphname.trim();
    }

    public String getXfieldname() {
        return xfieldname;
    }

    public void setXfieldname(String xfieldname) {
        this.xfieldname = xfieldname == null ? null : xfieldname.trim();
    }

    public String getYfieldname() {
        return yfieldname;
    }

    public void setYfieldname(String yfieldname) {
        this.yfieldname = yfieldname == null ? null : yfieldname.trim();
    }

    public String getGroupfieldname() {
        return groupfieldname;
    }

    public void setGroupfieldname(String groupfieldname) {
        this.groupfieldname = groupfieldname == null ? null : groupfieldname.trim();
    }
}