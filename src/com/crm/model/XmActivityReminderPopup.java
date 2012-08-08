package com.crm.model;

public class XmActivityReminderPopup {
    private String semodule;

    private Integer recordid;

    private Integer reminderTime;

    private Integer status;

    public String getSemodule() {
        return semodule;
    }

    public void setSemodule(String semodule) {
        this.semodule = semodule == null ? null : semodule.trim();
    }

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Integer getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Integer reminderTime) {
        this.reminderTime = reminderTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}