package com.crm.model;

public class XmModuleentityrel {
    private Integer crmid;

    private String module;

    private Integer relcrmid;

    private String relmodule;

    public Integer getCrmid() {
        return crmid;
    }

    public void setCrmid(Integer crmid) {
        this.crmid = crmid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public Integer getRelcrmid() {
        return relcrmid;
    }

    public void setRelcrmid(Integer relcrmid) {
        this.relcrmid = relcrmid;
    }

    public String getRelmodule() {
        return relmodule;
    }

    public void setRelmodule(String relmodule) {
        this.relmodule = relmodule == null ? null : relmodule.trim();
    }
}