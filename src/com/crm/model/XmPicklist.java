package com.crm.model;

public class XmPicklist {
    private Integer id;

    private String colvalue;

    private String colname;

    private Integer sequence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColvalue() {
        return colvalue;
    }

    public void setColvalue(String colvalue) {
        this.colvalue = colvalue == null ? null : colvalue.trim();
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}