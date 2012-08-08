package com.crm.model;

public class XmModulelist {
    private Integer tabid;

    private String type;

    private String filename;

    private String filememo;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFilememo() {
        return filememo;
    }

    public void setFilememo(String filememo) {
        this.filememo = filememo == null ? null : filememo.trim();
    }
}