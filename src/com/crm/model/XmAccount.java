package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmAccount {
    private Integer accountid;

    private String accountname;

    private String customernum;

    private Integer parentid;

    private String accountType;

    private String industry;

    private String annualrevenue;

    private String rating;

    private String grade;

    private String phone;

    private String otherphone;

    private String email1;

    private String email2;

    private String website;

    private String fax;

    private String employees;

    private String ownership;

    private String leadsource;

    private Date contactDate;

    private Date buildDate;

    private String notifyOwner;

    private String bankname;

    private String bankAccountname;

    private String bankAccountid;

    private String bankTaxid;

    private String paymentType;

    private String paymentCredit;

    private String prefix;

    private Integer ordernum;

    private BigDecimal ordertotal;

    private Date lastcontacttime;

    private Integer contacttimes;

    private Date invoicedate;

    private Date orderdate;

    private Date quotedate;

    private String assignstatus;

    private Date startdate;

    private Date enddate;

    private String billCity;

    private String billCode;

    private String billCountry;

    private String billState;

    private String billStreet;

    private String billPobox;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String cf498;

    private String cf500;

    private String cf502;

    private String cf504;

    private String cf535;

    private String keycontact;

    private String keymobile;

    private String latestnote;

    private String ispools;

    private String cf686;

    private String description;

    //负责人 
    private String username;
    
    private Integer crmid;
    
    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getCustomernum() {
        return customernum;
    }

    public void setCustomernum(String customernum) {
        this.customernum = customernum == null ? null : customernum.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getAnnualrevenue() {
        return annualrevenue;
    }

    public void setAnnualrevenue(String annualrevenue) {
        this.annualrevenue = annualrevenue == null ? null : annualrevenue.trim();
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOtherphone() {
        return otherphone;
    }

    public void setOtherphone(String otherphone) {
        this.otherphone = otherphone == null ? null : otherphone.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees == null ? null : employees.trim();
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
    }

    public String getLeadsource() {
        return leadsource;
    }

    public void setLeadsource(String leadsource) {
        this.leadsource = leadsource == null ? null : leadsource.trim();
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public String getNotifyOwner() {
        return notifyOwner;
    }

    public void setNotifyOwner(String notifyOwner) {
        this.notifyOwner = notifyOwner == null ? null : notifyOwner.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankAccountname() {
        return bankAccountname;
    }

    public void setBankAccountname(String bankAccountname) {
        this.bankAccountname = bankAccountname == null ? null : bankAccountname.trim();
    }

    public String getBankAccountid() {
        return bankAccountid;
    }

    public void setBankAccountid(String bankAccountid) {
        this.bankAccountid = bankAccountid == null ? null : bankAccountid.trim();
    }

    public String getBankTaxid() {
        return bankTaxid;
    }

    public void setBankTaxid(String bankTaxid) {
        this.bankTaxid = bankTaxid == null ? null : bankTaxid.trim();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getPaymentCredit() {
        return paymentCredit;
    }

    public void setPaymentCredit(String paymentCredit) {
        this.paymentCredit = paymentCredit == null ? null : paymentCredit.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(BigDecimal ordertotal) {
        this.ordertotal = ordertotal;
    }

    public Date getLastcontacttime() {
        return lastcontacttime;
    }

    public void setLastcontacttime(Date lastcontacttime) {
        this.lastcontacttime = lastcontacttime;
    }

    public Integer getContacttimes() {
        return contacttimes;
    }

    public void setContacttimes(Integer contacttimes) {
        this.contacttimes = contacttimes;
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getQuotedate() {
        return quotedate;
    }

    public void setQuotedate(Date quotedate) {
        this.quotedate = quotedate;
    }

    public String getAssignstatus() {
        return assignstatus;
    }

    public void setAssignstatus(String assignstatus) {
        this.assignstatus = assignstatus == null ? null : assignstatus.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity == null ? null : billCity.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String billCountry) {
        this.billCountry = billCountry == null ? null : billCountry.trim();
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState == null ? null : billState.trim();
    }

    public String getBillStreet() {
        return billStreet;
    }

    public void setBillStreet(String billStreet) {
        this.billStreet = billStreet == null ? null : billStreet.trim();
    }

    public String getBillPobox() {
        return billPobox;
    }

    public void setBillPobox(String billPobox) {
        this.billPobox = billPobox == null ? null : billPobox.trim();
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

    public String getCf498() {
        return cf498;
    }

    public void setCf498(String cf498) {
        this.cf498 = cf498 == null ? null : cf498.trim();
    }

    public String getCf500() {
        return cf500;
    }

    public void setCf500(String cf500) {
        this.cf500 = cf500 == null ? null : cf500.trim();
    }

    public String getCf502() {
        return cf502;
    }

    public void setCf502(String cf502) {
        this.cf502 = cf502 == null ? null : cf502.trim();
    }

    public String getCf504() {
        return cf504;
    }

    public void setCf504(String cf504) {
        this.cf504 = cf504 == null ? null : cf504.trim();
    }

    public String getCf535() {
        return cf535;
    }

    public void setCf535(String cf535) {
        this.cf535 = cf535 == null ? null : cf535.trim();
    }

    public String getKeycontact() {
        return keycontact;
    }

    public void setKeycontact(String keycontact) {
        this.keycontact = keycontact == null ? null : keycontact.trim();
    }

    public String getKeymobile() {
        return keymobile;
    }

    public void setKeymobile(String keymobile) {
        this.keymobile = keymobile == null ? null : keymobile.trim();
    }

    public String getLatestnote() {
        return latestnote;
    }

    public void setLatestnote(String latestnote) {
        this.latestnote = latestnote == null ? null : latestnote.trim();
    }

    public String getIspools() {
        return ispools;
    }

    public void setIspools(String ispools) {
        this.ispools = ispools == null ? null : ispools.trim();
    }

    public String getCf686() {
        return cf686;
    }

    public void setCf686(String cf686) {
        this.cf686 = cf686 == null ? null : cf686.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getCrmid() {
		return crmid;
	}

	public void setCrmid(Integer crmid) {
		this.crmid = crmid;
	}
}