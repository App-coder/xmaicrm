package com.crm.model;

public class XmCatalog {
    private String catalogid;

    private String catalogname;

    private String parentcatalog;

    private Integer sortorder;

    private Integer depth;

    private String parentcatalogid;
    
    private Integer childcount;

    public String getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(String catalogid) {
        this.catalogid = catalogid == null ? null : catalogid.trim();
    }

    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname == null ? null : catalogname.trim();
    }

    public String getParentcatalog() {
        return parentcatalog;
    }

    public void setParentcatalog(String parentcatalog) {
        this.parentcatalog = parentcatalog == null ? null : parentcatalog.trim();
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getParentcatalogid() {
        return parentcatalogid;
    }

    public void setParentcatalogid(String parentcatalogid) {
        this.parentcatalogid = parentcatalogid == null ? null : parentcatalogid.trim();
    }

	public Integer getChildcount() {
		return childcount;
	}

	public void setChildcount(Integer childcount) {
		this.childcount = childcount;
	}

}