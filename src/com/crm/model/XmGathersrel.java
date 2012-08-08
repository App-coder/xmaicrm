package com.crm.model;

import java.math.BigDecimal;

public class XmGathersrel {
    private Integer gathersid;

    private Integer gathersrecordsid;

    private BigDecimal balanceamount;

    private BigDecimal collection;

    private Integer sequenceNo;

    public Integer getGathersid() {
        return gathersid;
    }

    public void setGathersid(Integer gathersid) {
        this.gathersid = gathersid;
    }

    public Integer getGathersrecordsid() {
        return gathersrecordsid;
    }

    public void setGathersrecordsid(Integer gathersrecordsid) {
        this.gathersrecordsid = gathersrecordsid;
    }

    public BigDecimal getBalanceamount() {
        return balanceamount;
    }

    public void setBalanceamount(BigDecimal balanceamount) {
        this.balanceamount = balanceamount;
    }

    public BigDecimal getCollection() {
        return collection;
    }

    public void setCollection(BigDecimal collection) {
        this.collection = collection;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
}