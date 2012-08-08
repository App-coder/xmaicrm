package com.crm.model;

public class XmStepadvfilters {
    private Integer stepid;

    private Integer columnindex;

    private String columnname;

    private String thevalue;

    public Integer getStepid() {
        return stepid;
    }

    public void setStepid(Integer stepid) {
        this.stepid = stepid;
    }

    public Integer getColumnindex() {
        return columnindex;
    }

    public void setColumnindex(Integer columnindex) {
        this.columnindex = columnindex;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getThevalue() {
        return thevalue;
    }

    public void setThevalue(String thevalue) {
        this.thevalue = thevalue == null ? null : thevalue.trim();
    }
}