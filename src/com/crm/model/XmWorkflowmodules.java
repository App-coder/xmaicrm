package com.crm.model;

public class XmWorkflowmodules {
    private Integer workflowmodulesid;

    private String primarymodule;

    private String secondarymodules;

    public Integer getWorkflowmodulesid() {
        return workflowmodulesid;
    }

    public void setWorkflowmodulesid(Integer workflowmodulesid) {
        this.workflowmodulesid = workflowmodulesid;
    }

    public String getPrimarymodule() {
        return primarymodule;
    }

    public void setPrimarymodule(String primarymodule) {
        this.primarymodule = primarymodule == null ? null : primarymodule.trim();
    }

    public String getSecondarymodules() {
        return secondarymodules;
    }

    public void setSecondarymodules(String secondarymodules) {
        this.secondarymodules = secondarymodules == null ? null : secondarymodules.trim();
    }
}