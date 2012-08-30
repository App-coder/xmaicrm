package com.crm.model;

import java.util.Date;

public class XmSalesobject {
    private Integer userid;

    private String objectType;

    private Integer objectNum;

    private String objectYear;

    private Date requirement562;

    private String objectMonth;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    public Integer getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
    }

    public String getObjectYear() {
        return objectYear;
    }

    public void setObjectYear(String objectYear) {
        this.objectYear = objectYear == null ? null : objectYear.trim();
    }

    public Date getRequirement562() {
        return requirement562;
    }

    public void setRequirement562(Date requirement562) {
        this.requirement562 = requirement562;
    }

    public String getObjectMonth() {
        return objectMonth;
    }

    public void setObjectMonth(String objectMonth) {
        this.objectMonth = objectMonth == null ? null : objectMonth.trim();
    }
}