package com.crm.model;

public class XmQunfa {
    private Integer qunfaid;

    private String qunfaname;

    private String description;

    private String qunfamsg;

    private String qunfatype;

    private Integer queryid;

    public Integer getQunfaid() {
        return qunfaid;
    }

    public void setQunfaid(Integer qunfaid) {
        this.qunfaid = qunfaid;
    }

    public String getQunfaname() {
        return qunfaname;
    }

    public void setQunfaname(String qunfaname) {
        this.qunfaname = qunfaname == null ? null : qunfaname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getQunfamsg() {
        return qunfamsg;
    }

    public void setQunfamsg(String qunfamsg) {
        this.qunfamsg = qunfamsg == null ? null : qunfamsg.trim();
    }

    public String getQunfatype() {
        return qunfatype;
    }

    public void setQunfatype(String qunfatype) {
        this.qunfatype = qunfatype == null ? null : qunfatype.trim();
    }

    public Integer getQueryid() {
        return queryid;
    }

    public void setQueryid(Integer queryid) {
        this.queryid = queryid;
    }
}