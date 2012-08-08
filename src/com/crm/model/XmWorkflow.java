package com.crm.model;

public class XmWorkflow {
    private Integer workflowid;

    private Integer folderid;

    private String workflowname;

    private String description;

    private String workflowtype;

    private Integer queryid;

    private Integer alertid;

    private String state;

    private Integer customizable;

    private Integer category;

    public Integer getWorkflowid() {
        return workflowid;
    }

    public void setWorkflowid(Integer workflowid) {
        this.workflowid = workflowid;
    }

    public Integer getFolderid() {
        return folderid;
    }

    public void setFolderid(Integer folderid) {
        this.folderid = folderid;
    }

    public String getWorkflowname() {
        return workflowname;
    }

    public void setWorkflowname(String workflowname) {
        this.workflowname = workflowname == null ? null : workflowname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getWorkflowtype() {
        return workflowtype;
    }

    public void setWorkflowtype(String workflowtype) {
        this.workflowtype = workflowtype == null ? null : workflowtype.trim();
    }

    public Integer getQueryid() {
        return queryid;
    }

    public void setQueryid(Integer queryid) {
        this.queryid = queryid;
    }

    public Integer getAlertid() {
        return alertid;
    }

    public void setAlertid(Integer alertid) {
        this.alertid = alertid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getCustomizable() {
        return customizable;
    }

    public void setCustomizable(Integer customizable) {
        this.customizable = customizable;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}