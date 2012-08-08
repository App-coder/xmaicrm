package com.crm.model;

public class XmMaillist {
    private Integer maillistid;

    private String maillistname;

    private String description;

    private String maillisttitle;

    private String maillisttype;

    private Integer queryid;

    private String maillistmsg;

    public Integer getMaillistid() {
        return maillistid;
    }

    public void setMaillistid(Integer maillistid) {
        this.maillistid = maillistid;
    }

    public String getMaillistname() {
        return maillistname;
    }

    public void setMaillistname(String maillistname) {
        this.maillistname = maillistname == null ? null : maillistname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMaillisttitle() {
        return maillisttitle;
    }

    public void setMaillisttitle(String maillisttitle) {
        this.maillisttitle = maillisttitle == null ? null : maillisttitle.trim();
    }

    public String getMaillisttype() {
        return maillisttype;
    }

    public void setMaillisttype(String maillisttype) {
        this.maillisttype = maillisttype == null ? null : maillisttype.trim();
    }

    public Integer getQueryid() {
        return queryid;
    }

    public void setQueryid(Integer queryid) {
        this.queryid = queryid;
    }

    public String getMaillistmsg() {
        return maillistmsg;
    }

    public void setMaillistmsg(String maillistmsg) {
        this.maillistmsg = maillistmsg == null ? null : maillistmsg.trim();
    }
}