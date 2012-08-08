package com.crm.model;

import java.math.BigDecimal;

public class XmCurrencyInfo {
    private Integer id;

    private String currencyName;

    private String currencyCode;

    private String currencySymbol;

    private BigDecimal conversionRate;

    private String currencyStatus;

    private String defaultid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName == null ? null : currencyName.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol == null ? null : currencySymbol.trim();
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getCurrencyStatus() {
        return currencyStatus;
    }

    public void setCurrencyStatus(String currencyStatus) {
        this.currencyStatus = currencyStatus == null ? null : currencyStatus.trim();
    }

    public String getDefaultid() {
        return defaultid;
    }

    public void setDefaultid(String defaultid) {
        this.defaultid = defaultid == null ? null : defaultid.trim();
    }
}