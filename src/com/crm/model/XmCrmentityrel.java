package com.crm.model;

public class XmCrmentityrel {
    private String module;

    private String relmodule;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getRelmodule() {
        return relmodule;
    }

    public void setRelmodule(String relmodule) {
        this.relmodule = relmodule == null ? null : relmodule.trim();
    }
}