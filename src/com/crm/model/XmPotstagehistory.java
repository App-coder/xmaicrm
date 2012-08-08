package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmPotstagehistory {
    private Integer historyid;

    private Integer potentialid;

    private Long amount;

    private String stage;

    private BigDecimal probability;

    private Long expectedrevenue;

    private Date closedate;

    private Date lastmodified;

    private Integer userid;

    private String description;

    public Integer getHistoryid() {
        return historyid;
    }

    public void setHistoryid(Integer historyid) {
        this.historyid = historyid;
    }

    public Integer getPotentialid() {
        return potentialid;
    }

    public void setPotentialid(Integer potentialid) {
        this.potentialid = potentialid;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public BigDecimal getProbability() {
        return probability;
    }

    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public Long getExpectedrevenue() {
        return expectedrevenue;
    }

    public void setExpectedrevenue(Long expectedrevenue) {
        this.expectedrevenue = expectedrevenue;
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}