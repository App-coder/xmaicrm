package com.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class XmProducts {
    private Integer productid;

    private String productname;

    private String productcode;

    private String catalogid;

    private String manufacturer;

    private BigDecimal qtyPerUnit;

    private BigDecimal unitPrice;

    private BigDecimal referencePrice;

    private BigDecimal costPrice;

    private BigDecimal weight;

    private Integer packSize;

    private Date salesStartDate;

    private Date salesEndDate;

    private Date startDate;

    private Date expiryDate;

    private Integer costFactor;

    private BigDecimal commissionrate;

    private String commissionmethod;

    private Integer discontinued;

    private String usageunit;

    private Integer handler;

    private String currency;

    private Integer reorderlevel;

    private String website;

    private String taxclass;

    private String mfrPartNo;

    private String vendorPartNo;

    private String serialno;

    private BigDecimal qtyinstock;

    private String productsheet;

    private BigDecimal qtyindemand;

    private String glacct;

    private Integer vendorId;

    private Integer smcreatorid;

    private Integer smownerid;

    private Integer modifiedby;

    private Integer groupid;

    private Date createdtime;

    private Date modifiedtime;

    private Integer deleted;

    private Integer approved;

    private Integer approvedby;

    private String isserialnumbers;

    private Integer socknum;

    private Integer onnum;

    private String productDescription;

    private String imagename;

    private String description;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public String getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(String catalogid) {
        this.catalogid = catalogid == null ? null : catalogid.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public BigDecimal getQtyPerUnit() {
        return qtyPerUnit;
    }

    public void setQtyPerUnit(BigDecimal qtyPerUnit) {
        this.qtyPerUnit = qtyPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPackSize() {
        return packSize;
    }

    public void setPackSize(Integer packSize) {
        this.packSize = packSize;
    }

    public Date getSalesStartDate() {
        return salesStartDate;
    }

    public void setSalesStartDate(Date salesStartDate) {
        this.salesStartDate = salesStartDate;
    }

    public Date getSalesEndDate() {
        return salesEndDate;
    }

    public void setSalesEndDate(Date salesEndDate) {
        this.salesEndDate = salesEndDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getCostFactor() {
        return costFactor;
    }

    public void setCostFactor(Integer costFactor) {
        this.costFactor = costFactor;
    }

    public BigDecimal getCommissionrate() {
        return commissionrate;
    }

    public void setCommissionrate(BigDecimal commissionrate) {
        this.commissionrate = commissionrate;
    }

    public String getCommissionmethod() {
        return commissionmethod;
    }

    public void setCommissionmethod(String commissionmethod) {
        this.commissionmethod = commissionmethod == null ? null : commissionmethod.trim();
    }

    public Integer getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        this.discontinued = discontinued;
    }

    public String getUsageunit() {
        return usageunit;
    }

    public void setUsageunit(String usageunit) {
        this.usageunit = usageunit == null ? null : usageunit.trim();
    }

    public Integer getHandler() {
        return handler;
    }

    public void setHandler(Integer handler) {
        this.handler = handler;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Integer getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Integer reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getTaxclass() {
        return taxclass;
    }

    public void setTaxclass(String taxclass) {
        this.taxclass = taxclass == null ? null : taxclass.trim();
    }

    public String getMfrPartNo() {
        return mfrPartNo;
    }

    public void setMfrPartNo(String mfrPartNo) {
        this.mfrPartNo = mfrPartNo == null ? null : mfrPartNo.trim();
    }

    public String getVendorPartNo() {
        return vendorPartNo;
    }

    public void setVendorPartNo(String vendorPartNo) {
        this.vendorPartNo = vendorPartNo == null ? null : vendorPartNo.trim();
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public BigDecimal getQtyinstock() {
        return qtyinstock;
    }

    public void setQtyinstock(BigDecimal qtyinstock) {
        this.qtyinstock = qtyinstock;
    }

    public String getProductsheet() {
        return productsheet;
    }

    public void setProductsheet(String productsheet) {
        this.productsheet = productsheet == null ? null : productsheet.trim();
    }

    public BigDecimal getQtyindemand() {
        return qtyindemand;
    }

    public void setQtyindemand(BigDecimal qtyindemand) {
        this.qtyindemand = qtyindemand;
    }

    public String getGlacct() {
        return glacct;
    }

    public void setGlacct(String glacct) {
        this.glacct = glacct == null ? null : glacct.trim();
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
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

    public String getIsserialnumbers() {
        return isserialnumbers;
    }

    public void setIsserialnumbers(String isserialnumbers) {
        this.isserialnumbers = isserialnumbers == null ? null : isserialnumbers.trim();
    }

    public Integer getSocknum() {
        return socknum;
    }

    public void setSocknum(Integer socknum) {
        this.socknum = socknum;
    }

    public Integer getOnnum() {
        return onnum;
    }

    public void setOnnum(Integer onnum) {
        this.onnum = onnum;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}