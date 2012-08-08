package com.crm.model;

public class XmActivityReminder {
    private Integer activityId;

    private Integer recurringid;

    private Integer reminderTime;

    private Integer reminderSent;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getRecurringid() {
        return recurringid;
    }

    public void setRecurringid(Integer recurringid) {
        this.recurringid = recurringid;
    }

    public Integer getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Integer reminderTime) {
        this.reminderTime = reminderTime;
    }

    public Integer getReminderSent() {
        return reminderSent;
    }

    public void setReminderSent(Integer reminderSent) {
        this.reminderSent = reminderSent;
    }
}