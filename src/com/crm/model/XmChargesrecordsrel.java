package com.crm.model;

import java.math.BigDecimal;

public class XmChargesrecordsrel {
    private Integer chargesid;

    private Integer chargesrecordsid;

    private BigDecimal balanceamount;

    private BigDecimal collection;

    private Integer sequenceNo;

    public Integer getChargesid() {
        return chargesid;
    }

    public void setChargesid(Integer chargesid) {
        this.chargesid = chargesid;
    }

    public Integer getChargesrecordsid() {
        return chargesrecordsid;
    }

    public void setChargesrecordsid(Integer chargesrecordsid) {
        this.chargesrecordsid = chargesrecordsid;
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