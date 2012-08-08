package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmWarehousecondtions {
    private Integer conditionsid;

    private Integer entityid;

    private String modulename;

    private String type;

    private Integer cangkusid;

    private Integer productid;

    private BigDecimal inputnum;

    private BigDecimal outputnum;

    private Date operationtime;

    private BigDecimal firstnum;

    private BigDecimal lastnum;

    private BigDecimal listprice;

    private BigDecimal costprice;

    private Integer smownerid;

    public Integer getConditionsid() {
        return conditionsid;
    }

    public void setConditionsid(Integer conditionsid) {
        this.conditionsid = conditionsid;
    }

    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCangkusid() {
        return cangkusid;
    }

    public void setCangkusid(Integer cangkusid) {
        this.cangkusid = cangkusid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public BigDecimal getInputnum() {
        return inputnum;
    }

    public void setInputnum(BigDecimal inputnum) {
        this.inputnum = inputnum;
    }

    public BigDecimal getOutputnum() {
        return outputnum;
    }

    public void setOutputnum(BigDecimal outputnum) {
        this.outputnum = outputnum;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public BigDecimal getFirstnum() {
        return firstnum;
    }

    public void setFirstnum(BigDecimal firstnum) {
        this.firstnum = firstnum;
    }

    public BigDecimal getLastnum() {
        return lastnum;
    }

    public void setLastnum(BigDecimal lastnum) {
        this.lastnum = lastnum;
    }

    public BigDecimal getListprice() {
        return listprice;
    }

    public void setListprice(BigDecimal listprice) {
        this.listprice = listprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public Integer getSmownerid() {
        return smownerid;
    }

    public void setSmownerid(Integer smownerid) {
        this.smownerid = smownerid;
    }
}