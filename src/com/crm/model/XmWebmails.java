package com.crm.model;

public class XmWebmails {
    private String msgid;

    private String size;

    private String localname;

    private String flags;

    private String date;

    private String subject;

    private String fromname;

    private String fromEmail;

    private String toname;

    private String toEmail;

    private String messageId;

    private String priority;

    private String ccEmail;

    private String bccEmail;

    private String attach;

    private String smimecrypt;

    private String folder;

    private Integer userid;

    private Integer deleted;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid == null ? null : msgid.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname == null ? null : localname.trim();
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags == null ? null : flags.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getFromname() {
        return fromname;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname == null ? null : fromname.trim();
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail == null ? null : fromEmail.trim();
    }

    public String getToname() {
        return toname;
    }

    public void setToname(String toname) {
        this.toname = toname == null ? null : toname.trim();
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail == null ? null : toEmail.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail == null ? null : ccEmail.trim();
    }

    public String getBccEmail() {
        return bccEmail;
    }

    public void setBccEmail(String bccEmail) {
        this.bccEmail = bccEmail == null ? null : bccEmail.trim();
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    public String getSmimecrypt() {
        return smimecrypt;
    }

    public void setSmimecrypt(String smimecrypt) {
        this.smimecrypt = smimecrypt == null ? null : smimecrypt.trim();
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder == null ? null : folder.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}