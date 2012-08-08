package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmQuotes {
    private Integer quoteid;

    private String subject;

    private Integer potentialid;

    private String quotestage;

    private Date validtill;

    private Integer contactid;

    private String currency;

    private BigDecimal currencyRate;

    private BigDecimal subtotal;

    private String carrier;

    private String shipping;

    private Integer inventorymanager;

    private String type;

    private BigDecimal tax;

    private BigDecimal adjustment;

    private BigDecimal total;

    private String taxtype;

    private BigDecimal discountPercent;

    private BigDecimal discountAmount;

    private BigDecimal sHAmount;

    private Integer accountid;

    private Integer projectsid;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String termsConditions;

    private String description;

    public Integer getQuoteid() {
        return quoteid;
    }

    public void setQuoteid(Integer quoteid) {
        this.quoteid = quoteid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getPotentialid() {
        return potentialid;
    }

    public void setPotentialid(Integer potentialid) {
        this.potentialid = potentialid;
    }

    public String getQuotestage() {
        return quotestage;
    }

    public void setQuotestage(String quotestage) {
        this.quotestage = quotestage == null ? null : quotestage.trim();
    }

    public Date getValidtill() {
        return validtill;
    }

    public void setValidtill(Date validtill) {
        this.validtill = validtill;
    }

    public Integer getContactid() {
        return contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping == null ? null : shipping.trim();
    }

    public Integer getInventorymanager() {
        return inventorymanager;
    }

    public void setInventorymanager(Integer inventorymanager) {
        this.inventorymanager = inventorymanager;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(String taxtype) {
        this.taxtype = taxtype == null ? null : taxtype.trim();
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getsHAmount() {
        return sHAmount;
    }

    public void setsHAmount(BigDecimal sHAmount) {
        this.sHAmount = sHAmount;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getProjectsid() {
        return projectsid;
    }

    public void setProjectsid(Integer projectsid) {
        this.projectsid = projectsid;
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(Integer approvedby) {
        this.approvedby = approvedby;
    }

    public String getTermsConditions() {
        return termsConditions;
    }

    public void setTermsConditions(String termsConditions) {
        this.termsConditions = termsConditions == null ? null : termsConditions.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}