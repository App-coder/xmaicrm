package com.crm.model;

public class XmRelationships {
    private Integer id;

    private String parentmodule;

    private String parenttable;

    private String parentid;

    private String childmodule;

    private String childtable;

    private String childid;

    private String childparentid;

    private String relationtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentmodule() {
        return parentmodule;
    }

    public void setParentmodule(String parentmodule) {
        this.parentmodule = parentmodule == null ? null : parentmodule.trim();
    }

    public String getParenttable() {
        return parenttable;
    }

    public void setParenttable(String parenttable) {
        this.parenttable = parenttable == null ? null : parenttable.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getChildmodule() {
        return childmodule;
    }

    public void setChildmodule(String childmodule) {
        this.childmodule = childmodule == null ? null : childmodule.trim();
    }

    public String getChildtable() {
        return childtable;
    }

    public void setChildtable(String childtable) {
        this.childtable = childtable == null ? null : childtable.trim();
    }

    public String getChildid() {
        return childid;
    }

    public void setChildid(String childid) {
        this.childid = childid == null ? null : childid.trim();
    }

    public String getChildparentid() {
        return childparentid;
    }

    public void setChildparentid(String childparentid) {
        this.childparentid = childparentid == null ? null : childparentid.trim();
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype == null ? null : relationtype.trim();
    }
}