package com.crm.model;

public class XmMailAccounts {
    private Integer accountId;

    private Integer userId;

    private String displayName;

    private String mailId;

    private String accountName;

    private String mailProtocol;

    private String mailUsername;

    private String mailPassword;

    private String mailServername;

    private Integer boxRefresh;

    private Integer mailsPerPage;

    private String ssltype;

    private String sslmeth;

    private Integer intMailer;

    private String status;

    private Integer setDefault;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId == null ? null : mailId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getMailProtocol() {
        return mailProtocol;
    }

    public void setMailProtocol(String mailProtocol) {
        this.mailProtocol = mailProtocol == null ? null : mailProtocol.trim();
    }

    public String getMailUsername() {
        return mailUsername;
    }

    public void setMailUsername(String mailUsername) {
        this.mailUsername = mailUsername == null ? null : mailUsername.trim();
    }

    public String getMailPassword() {
        return mailPassword;
    }

    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword == null ? null : mailPassword.trim();
    }

    public String getMailServername() {
        return mailServername;
    }

    public void setMailServername(String mailServername) {
        this.mailServername = mailServername == null ? null : mailServername.trim();
    }

    public Integer getBoxRefresh() {
        return boxRefresh;
    }

    public void setBoxRefresh(Integer boxRefresh) {
        this.boxRefresh = boxRefresh;
    }

    public Integer getMailsPerPage() {
        return mailsPerPage;
    }

    public void setMailsPerPage(Integer mailsPerPage) {
        this.mailsPerPage = mailsPerPage;
    }

    public String getSsltype() {
        return ssltype;
    }

    public void setSsltype(String ssltype) {
        this.ssltype = ssltype == null ? null : ssltype.trim();
    }

    public String getSslmeth() {
        return sslmeth;
    }

    public void setSslmeth(String sslmeth) {
        this.sslmeth = sslmeth == null ? null : sslmeth.trim();
    }

    public Integer getIntMailer() {
        return intMailer;
    }

    public void setIntMailer(Integer intMailer) {
        this.intMailer = intMailer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSetDefault() {
        return setDefault;
    }

    public void setSetDefault(Integer setDefault) {
        this.setDefault = setDefault;
    }
}