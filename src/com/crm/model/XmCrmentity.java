package com.crm.model;

public class XmCrmentity {
    private Integer crmid;

    private String setype;

    public Integer getCrmid() {
        return crmid;
    }

    public void setCrmid(Integer crmid) {
        this.crmid = crmid;
    }

    public String getSetype() {
        return setype;
    }

    public void setSetype(String setype) {
        this.setype = setype == null ? null : setype.trim();
    }
}