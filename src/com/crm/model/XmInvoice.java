package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmInvoice {
    private Integer invoiceid;

    private String subject;

    private Integer salesorderid;

    private Integer contactid;

    private String notes;

    private Date invoicedate;

    private Date duedate;

    private String invoiceterms;

    private String type;

    private String currency;

    private BigDecimal currencyRate;

    private BigDecimal salestax;

    private BigDecimal adjustment;

    private BigDecimal salescommission;

    private BigDecimal exciseduty;

    private BigDecimal subtotal;

    private BigDecimal total;

    private String taxtype;

    private BigDecimal discountPercent;

    private BigDecimal discountAmount;

    private BigDecimal sHAmount;

    private String shipping;

    private Integer accountid;

    private String invoicestatus;

    private String invoicenumber;

    private String salesorders;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String delitype;

    private String gatherstatus;

    private String termsConditions;

    private String description;

    public Integer getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getSalesorderid() {
        return salesorderid;
    }

    public void setSalesorderid(Integer salesorderid) {
        this.salesorderid = salesorderid;
    }

    public Integer getContactid() {
        return contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getInvoiceterms() {
        return invoiceterms;
    }

    public void setInvoiceterms(String invoiceterms) {
        this.invoiceterms = invoiceterms == null ? null : invoiceterms.trim();
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

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
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

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping == null ? null : shipping.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus == null ? null : invoicestatus.trim();
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber == null ? null : invoicenumber.trim();
    }

    public String getSalesorders() {
        return salesorders;
    }

    public void setSalesorders(String salesorders) {
        this.salesorders = salesorders == null ? null : salesorders.trim();
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

    public String getDelitype() {
        return delitype;
    }

    public void setDelitype(String delitype) {
        this.delitype = delitype == null ? null : delitype.trim();
    }

    public String getGatherstatus() {
        return gatherstatus;
    }

    public void setGatherstatus(String gatherstatus) {
        this.gatherstatus = gatherstatus == null ? null : gatherstatus.trim();
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