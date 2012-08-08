package com.crm.model;

public class XmWorkflowtask {
    private Integer taskid;

    private String tasksubject;

    private String taskAssignedUserid;

    private String calendartype;

    private String taskstartdate;

    private String taskenddate;

    private Integer startDays;

    private Integer endDays;

    private String starthr;

    private String startmin;

    private String startfmt;

    private String endhr;

    private String endmin;

    private String endfmt;

    private String eventstatus;

    private String taskpriority;

    private String taskdescription;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getTasksubject() {
        return tasksubject;
    }

    public void setTasksubject(String tasksubject) {
        this.tasksubject = tasksubject == null ? null : tasksubject.trim();
    }

    public String getTaskAssignedUserid() {
        return taskAssignedUserid;
    }

    public void setTaskAssignedUserid(String taskAssignedUserid) {
        this.taskAssignedUserid = taskAssignedUserid == null ? null : taskAssignedUserid.trim();
    }

    public String getCalendartype() {
        return calendartype;
    }

    public void setCalendartype(String calendartype) {
        this.calendartype = calendartype == null ? null : calendartype.trim();
    }

    public String getTaskstartdate() {
        return taskstartdate;
    }

    public void setTaskstartdate(String taskstartdate) {
        this.taskstartdate = taskstartdate == null ? null : taskstartdate.trim();
    }

    public String getTaskenddate() {
        return taskenddate;
    }

    public void setTaskenddate(String taskenddate) {
        this.taskenddate = taskenddate == null ? null : taskenddate.trim();
    }

    public Integer getStartDays() {
        return startDays;
    }

    public void setStartDays(Integer startDays) {
        this.startDays = startDays;
    }

    public Integer getEndDays() {
        return endDays;
    }

    public void setEndDays(Integer endDays) {
        this.endDays = endDays;
    }

    public String getStarthr() {
        return starthr;
    }

    public void setStarthr(String starthr) {
        this.starthr = starthr == null ? null : starthr.trim();
    }

    public String getStartmin() {
        return startmin;
    }

    public void setStartmin(String startmin) {
        this.startmin = startmin == null ? null : startmin.trim();
    }

    public String getStartfmt() {
        return startfmt;
    }

    public void setStartfmt(String startfmt) {
        this.startfmt = startfmt == null ? null : startfmt.trim();
    }

    public String getEndhr() {
        return endhr;
    }

    public void setEndhr(String endhr) {
        this.endhr = endhr == null ? null : endhr.trim();
    }

    public String getEndmin() {
        return endmin;
    }

    public void setEndmin(String endmin) {
        this.endmin = endmin == null ? null : endmin.trim();
    }

    public String getEndfmt() {
        return endfmt;
    }

    public void setEndfmt(String endfmt) {
        this.endfmt = endfmt == null ? null : endfmt.trim();
    }

    public String getEventstatus() {
        return eventstatus;
    }

    public void setEventstatus(String eventstatus) {
        this.eventstatus = eventstatus == null ? null : eventstatus.trim();
    }

    public String getTaskpriority() {
        return taskpriority;
    }

    public void setTaskpriority(String taskpriority) {
        this.taskpriority = taskpriority == null ? null : taskpriority.trim();
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription == null ? null : taskdescription.trim();
    }
}