package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmExpenselists {
    private Integer expensesid;

    private String expensecategory;

    private String expenselistname;

    private Date starttime;

    private Date lasttime;

    private String expensesite;

    private BigDecimal expensetotal;

    private String expensebill;

    private String descri;

    private Integer sequenceNo;

    public Integer getExpensesid() {
        return expensesid;
    }

    public void setExpensesid(Integer expensesid) {
        this.expensesid = expensesid;
    }

    public String getExpensecategory() {
        return expensecategory;
    }

    public void setExpensecategory(String expensecategory) {
        this.expensecategory = expensecategory == null ? null : expensecategory.trim();
    }

    public String getExpenselistname() {
        return expenselistname;
    }

    public void setExpenselistname(String expenselistname) {
        this.expenselistname = expenselistname == null ? null : expenselistname.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getExpensesite() {
        return expensesite;
    }

    public void setExpensesite(String expensesite) {
        this.expensesite = expensesite == null ? null : expensesite.trim();
    }

    public BigDecimal getExpensetotal() {
        return expensetotal;
    }

    public void setExpensetotal(BigDecimal expensetotal) {
        this.expensetotal = expensetotal;
    }

    public String getExpensebill() {
        return expensebill;
    }

    public void setExpensebill(String expensebill) {
        this.expensebill = expensebill == null ? null : expensebill.trim();
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri == null ? null : descri.trim();
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
}