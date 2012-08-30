package com.crm.model;

import java.util.Date;

public class XmReceivesmsbox {
    private Integer id;

    private String frommobile;

    private String tomobile;

    private Date receivetime;

    private Integer readed;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrommobile() {
        return frommobile;
    }

    public void setFrommobile(String frommobile) {
        this.frommobile = frommobile == null ? null : frommobile.trim();
    }

    public String getTomobile() {
        return tomobile;
    }

    public void setTomobile(String tomobile) {
        this.tomobile = tomobile == null ? null : tomobile.trim();
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Integer getReaded() {
        return readed;
    }

    public void setReaded(Integer readed) {
        this.readed = readed;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}