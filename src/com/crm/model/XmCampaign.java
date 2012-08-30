package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmCampaign {
    private Integer campaignid;

    private String campaignname;

    private String campaigntype;

    private String campaignstatus;

    private BigDecimal expectedrevenue;

    private BigDecimal budgetcost;

    private BigDecimal actualcost;

    private String expectedresponse;

    private Long numsent;

    private Integer productId;

    private String sponsor;

    private String targetaudience;

    private Integer targetsize;

    private Integer expectedresponsecount;

    private Integer expectedsalescount;

    private BigDecimal expectedroi;

    private Integer actualresponsecount;

    private Integer actualsalescount;

    private BigDecimal actualroi;

    private Date closingdate;

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

    public Integer getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(Integer campaignid) {
        this.campaignid = campaignid;
    }

    public String getCampaignname() {
        return campaignname;
    }

    public void setCampaignname(String campaignname) {
        this.campaignname = campaignname == null ? null : campaignname.trim();
    }

    public String getCampaigntype() {
        return campaigntype;
    }

    public void setCampaigntype(String campaigntype) {
        this.campaigntype = campaigntype == null ? null : campaigntype.trim();
    }

    public String getCampaignstatus() {
        return campaignstatus;
    }

    public void setCampaignstatus(String campaignstatus) {
        this.campaignstatus = campaignstatus == null ? null : campaignstatus.trim();
    }

    public BigDecimal getExpectedrevenue() {
        return expectedrevenue;
    }

    public void setExpectedrevenue(BigDecimal expectedrevenue) {
        this.expectedrevenue = expectedrevenue;
    }

    public BigDecimal getBudgetcost() {
        return budgetcost;
    }

    public void setBudgetcost(BigDecimal budgetcost) {
        this.budgetcost = budgetcost;
    }

    public BigDecimal getActualcost() {
        return actualcost;
    }

    public void setActualcost(BigDecimal actualcost) {
        this.actualcost = actualcost;
    }

    public String getExpectedresponse() {
        return expectedresponse;
    }

    public void setExpectedresponse(String expectedresponse) {
        this.expectedresponse = expectedresponse == null ? null : expectedresponse.trim();
    }

    public Long getNumsent() {
        return numsent;
    }

    public void setNumsent(Long numsent) {
        this.numsent = numsent;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public String getTargetaudience() {
        return targetaudience;
    }

    public void setTargetaudience(String targetaudience) {
        this.targetaudience = targetaudience == null ? null : targetaudience.trim();
    }

    public Integer getTargetsize() {
        return targetsize;
    }

    public void setTargetsize(Integer targetsize) {
        this.targetsize = targetsize;
    }

    public Integer getExpectedresponsecount() {
        return expectedresponsecount;
    }

    public void setExpectedresponsecount(Integer expectedresponsecount) {
        this.expectedresponsecount = expectedresponsecount;
    }

    public Integer getExpectedsalescount() {
        return expectedsalescount;
    }

    public void setExpectedsalescount(Integer expectedsalescount) {
        this.expectedsalescount = expectedsalescount;
    }

    public BigDecimal getExpectedroi() {
        return expectedroi;
    }

    public void setExpectedroi(BigDecimal expectedroi) {
        this.expectedroi = expectedroi;
    }

    public Integer getActualresponsecount() {
        return actualresponsecount;
    }

    public void setActualresponsecount(Integer actualresponsecount) {
        this.actualresponsecount = actualresponsecount;
    }

    public Integer getActualsalescount() {
        return actualsalescount;
    }

    public void setActualsalescount(Integer actualsalescount) {
        this.actualsalescount = actualsalescount;
    }

    public BigDecimal getActualroi() {
        return actualroi;
    }

    public void setActualroi(BigDecimal actualroi) {
        this.actualroi = actualroi;
    }

    public Date getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(Date closingdate) {
        this.closingdate = closingdate;
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
}