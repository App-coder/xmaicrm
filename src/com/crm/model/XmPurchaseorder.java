package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmPurchaseorder {
    private Integer purchaseorderid;

    private String subject;

    private Integer quoteid;

    private Integer vendorid;

    private String requisitionNo;

    private String trackingNo;

    private Integer contactid;

    private Date duedate;

    private String carrier;

    private String type;

    private String currency;

    private BigDecimal currencyRate;

    private BigDecimal salestax;

    private BigDecimal adjustment;

    private BigDecimal salescommission;

    private BigDecimal exciseduty;

    private BigDecimal total;

    private BigDecimal subtotal;

    private String taxtype;

    private BigDecimal discountPercent;

    private BigDecimal discountAmount;

    private BigDecimal sHAmount;

    private String postatus;

    private String salesorderid;

    private Integer projectsid;

    private Integer vcontactsid;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String rukutype;

    private String chargestatus;

    private Integer adjustcost;

    private String termsConditions;

    private String description;

    public Integer getPurchaseorderid() {
        return purchaseorderid;
    }

    public void setPurchaseorderid(Integer purchaseorderid) {
        this.purchaseorderid = purchaseorderid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getQuoteid() {
        return quoteid;
    }

    public void setQuoteid(Integer quoteid) {
        this.quoteid = quoteid;
    }

    public Integer getVendorid() {
        return vendorid;
    }

    public void setVendorid(Integer vendorid) {
        this.vendorid = vendorid;
    }

    public String getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(String requisitionNo) {
        this.requisitionNo = requisitionNo == null ? null : requisitionNo.trim();
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo == null ? null : trackingNo.trim();
    }

    public Integer getContactid() {
        return contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public BigDecimal getSalestax() {
        return salestax;
    }

    public void setSalestax(BigDecimal salestax) {
        this.salestax = salestax;
    }

    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
    }

    public BigDecimal getSalescommission() {
        return salescommission;
    }

    public void setSalescommission(BigDecimal salescommission) {
        this.salescommission = salescommission;
    }

    public BigDecimal getExciseduty() {
        return exciseduty;
    }

    public void setExciseduty(BigDecimal exciseduty) {
        this.exciseduty = exciseduty;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
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

    public String getPostatus() {
        return postatus;
    }

    public void setPostatus(String postatus) {
        this.postatus = postatus == null ? null : postatus.trim();
    }

    public String getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(String salesorderid) {
        this.salesorderid = salesorderid == null ? null : salesorderid.trim();
    }

    public Integer getProjectsid() {
        return projectsid;
    }

    public void setProjectsid(Integer projectsid) {
        this.projectsid = projectsid;
    }

    public Integer getVcontactsid() {
        return vcontactsid;
    }

    public void setVcontactsid(Integer vcontactsid) {
        this.vcontactsid = vcontactsid;
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

    public String getRukutype() {
        return rukutype;
    }

    public void setRukutype(String rukutype) {
        this.rukutype = rukutype == null ? null : rukutype.trim();
    }

    public String getChargestatus() {
        return chargestatus;
    }

    public void setChargestatus(String chargestatus) {
        this.chargestatus = chargestatus == null ? null : chargestatus.trim();
    }

    public Integer getAdjustcost() {
        return adjustcost;
    }

    public void setAdjustcost(Integer adjustcost) {
        this.adjustcost = adjustcost;
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