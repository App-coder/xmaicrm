package com.crm.model;

public class XmAlerts {
    private Integer alertid;

    private String alertname;

    private String alerttoemails;

    private String alertcontent;

    public Integer getAlertid() {
        return alertid;
    }

    public void setAlertid(Integer alertid) {
        this.alertid = alertid;
    }

    public String getAlertname() {
        return alertname;
    }

    public void setAlertname(String alertname) {
        this.alertname = alertname == null ? null : alertname.trim();
    }

    public String getAlerttoemails() {
        return alerttoemails;
    }

    public void setAlerttoemails(String alerttoemails) {
        this.alerttoemails = alerttoemails == null ? null : alerttoemails.trim();
    }

    public String getAlertcontent() {
        return alertcontent;
    }

    public void setAlertcontent(String alertcontent) {
        this.alertcontent = alertcontent == null ? null : alertcontent.trim();
    }
}