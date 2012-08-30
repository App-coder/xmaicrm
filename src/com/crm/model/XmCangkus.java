package com.crm.model;

public class XmCangkus {
    private Integer cangkusid;

    private String cangkuname;

    private String description;

    private Integer isused;

    public Integer getCangkusid() {
        return cangkusid;
    }

    public void setCangkusid(Integer cangkusid) {
        this.cangkusid = cangkusid;
    }

    public String getCangkuname() {
        return cangkuname;
    }

    public void setCangkuname(String cangkuname) {
        this.cangkuname = cangkuname == null ? null : cangkuname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
    }
}