package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmPotential {
    private Integer potentialid;

    private Integer accountid;

    private Integer contactId;

    private String potentialname;

    private BigDecimal amount;

    private BigDecimal total;

    private String currency;

    private Date closingdate;

    private String typeofrevenue;

    private String nextstep;

    private Integer private_;

    private Integer probability;

    private Integer campaignid;

    private String salesStage;

    private String potentialtype;

    private String leadsource;

    private Integer productid;

    private String productversion;

    private String quotationref;

    private String partnercontact;

    private String remarks;

    private Integer runtimefee;

    private Date followupdate;

    private String evaluationstatus;

    private Integer forecastcategory;

    private Integer outcomeanalysis;

    private BigDecimal probableamount;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String description;
    
    /**
     * 客户名称
     */
    private String accountname;

    public Integer getPotentialid() {
        return potentialid;
    }

    public void setPotentialid(Integer potentialid) {
        this.potentialid = potentialid;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getPotentialname() {
        return potentialname;
    }

    public void setPotentialname(String potentialname) {
        this.potentialname = potentialname == null ? null : potentialname.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Date getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(Date closingdate) {
        this.closingdate = closingdate;
    }

    public String getTypeofrevenue() {
        return typeofrevenue;
    }

    public void setTypeofrevenue(String typeofrevenue) {
        this.typeofrevenue = typeofrevenue == null ? null : typeofrevenue.trim();
    }

    public String getNextstep() {
        return nextstep;
    }

    public void setNextstep(String nextstep) {
        this.nextstep = nextstep == null ? null : nextstep.trim();
    }


    public Integer getPrivate_() {
		return private_;
	}

	public void setPrivate_(Integer private_) {
		this.private_ = private_;
	}

	public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Integer getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(Integer campaignid) {
        this.campaignid = campaignid;
    }

    public String getSalesStage() {
        return salesStage;
    }

    public void setSalesStage(String salesStage) {
        this.salesStage = salesStage == null ? null : salesStage.trim();
    }

    public String getPotentialtype() {
        return potentialtype;
    }

    public void setPotentialtype(String potentialtype) {
        this.potentialtype = potentialtype == null ? null : potentialtype.trim();
    }

    public String getLeadsource() {
        return leadsource;
    }

    public void setLeadsource(String leadsource) {
        this.leadsource = leadsource == null ? null : leadsource.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductversion() {
        return productversion;
    }

    public void setProductversion(String productversion) {
        this.productversion = productversion == null ? null : productversion.trim();
    }

    public String getQuotationref() {
        return quotationref;
    }

    public void setQuotationref(String quotationref) {
        this.quotationref = quotationref == null ? null : quotationref.trim();
    }

    public String getPartnercontact() {
        return partnercontact;
    }

    public void setPartnercontact(String partnercontact) {
        this.partnercontact = partnercontact == null ? null : partnercontact.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getRuntimefee() {
        return runtimefee;
    }

    public void setRuntimefee(Integer runtimefee) {
        this.runtimefee = runtimefee;
    }

    public Date getFollowupdate() {
        return followupdate;
    }

    public void setFollowupdate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public String getEvaluationstatus() {
        return evaluationstatus;
    }

    public void setEvaluationstatus(String evaluationstatus) {
        this.evaluationstatus = evaluationstatus == null ? null : evaluationstatus.trim();
    }

    public Integer getForecastcategory() {
        return forecastcategory;
    }

    public void setForecastcategory(Integer forecastcategory) {
        this.forecastcategory = forecastcategory;
    }

    public Integer getOutcomeanalysis() {
        return outcomeanalysis;
    }

    public void setOutcomeanalysis(Integer outcomeanalysis) {
        this.outcomeanalysis = outcomeanalysis;
    }

    public BigDecimal getProbableamount() {
        return probableamount;
    }

    public void setProbableamount(BigDecimal probableamount) {
        this.probableamount = probableamount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
    
    
}