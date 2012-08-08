package com.crm.model;

import java.util.Date;

public class XmSendsmsbox {
    private Integer id;

    private Date sendtime;

    private Integer success;

    private Integer userid;

    private String sendermobile;

    private String content;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSendermobile() {
        return sendermobile;
    }

    public void setSendermobile(String sendermobile) {
        this.sendermobile = sendermobile == null ? null : sendermobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}