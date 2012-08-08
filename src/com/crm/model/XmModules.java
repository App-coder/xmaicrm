package com.crm.model;

public class XmModules {
    private Integer id;

    private String enname;

    private String cnname;

    private String status;

    private Integer parenttabid;

    private Integer displayorder;

    private Integer deleted;

    private String description;

    private Integer isAccountid;

    private Integer isContactid;

    private Integer approve;

    private Integer importexport;

    private Integer attachment;

    private Integer product;

    private String relatedmodule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getParenttabid() {
        return parenttabid;
    }

    public void setParenttabid(Integer parenttabid) {
        this.parenttabid = parenttabid;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsAccountid() {
        return isAccountid;
    }

    public void setIsAccountid(Integer isAccountid) {
        this.isAccountid = isAccountid;
    }

    public Integer getIsContactid() {
        return isContactid;
    }

    public void setIsContactid(Integer isContactid) {
        this.isContactid = isContactid;
    }

    public Integer getApprove() {
        return approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    public Integer getImportexport() {
        return importexport;
    }

    public void setImportexport(Integer importexport) {
        this.importexport = importexport;
    }

    public Integer getAttachment() {
        return attachment;
    }

    public void setAttachment(Integer attachment) {
        this.attachment = attachment;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public String getRelatedmodule() {
        return relatedmodule;
    }

    public void setRelatedmodule(String relatedmodule) {
        this.relatedmodule = relatedmodule == null ? null : relatedmodule.trim();
    }
}