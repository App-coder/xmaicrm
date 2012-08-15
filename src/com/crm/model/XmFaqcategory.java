package com.crm.model;

public class XmFaqcategory {
    private String faqcategoryid;

    private String faqcategoryname;

    private String parentfaqcategory;

    private Integer depth;

    private String parentfaqcategoryid;

    private Integer sortorder;
    
    private String state;
    
    

    public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFaqcategoryid() {
        return faqcategoryid;
    }

    public void setFaqcategoryid(String faqcategoryid) {
        this.faqcategoryid = faqcategoryid == null ? null : faqcategoryid;
    }

    public String getFaqcategoryname() {
        return faqcategoryname;
    }

    public void setFaqcategoryname(String faqcategoryname) {
        this.faqcategoryname = faqcategoryname == null ? null : faqcategoryname.trim();
    }

    public String getParentfaqcategory() {
        return parentfaqcategory;
    }

    public void setParentfaqcategory(String parentfaqcategory) {
        this.parentfaqcategory = parentfaqcategory == null ? null : parentfaqcategory.trim();
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getParentfaqcategoryid() {
        return parentfaqcategoryid;
    }

    public void setParentfaqcategoryid(String parentfaqcategoryid) {
        this.parentfaqcategoryid = parentfaqcategoryid == null ? null : parentfaqcategoryid;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }
}