package com.crm.model;

import java.io.Serializable;

public class XmEntityname implements Serializable{
	private static final long serialVersionUID = -3507566292319036257L;

	private Integer tabid;

    private String modulename;

    private String tablename;

    private String fieldname;

    private String entityidfield;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    public String getEntityidfield() {
        return entityidfield;
    }

    public void setEntityidfield(String entityidfield) {
        this.entityidfield = entityidfield == null ? null : entityidfield.trim();
    }
}