package com.crm.model;

public class XmFreetags {
    private Integer id;

    private String tag;

    private String rawTag;
    
    private String quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getRawTag() {
        return rawTag;
    }

    public void setRawTag(String rawTag) {
        this.rawTag = rawTag == null ? null : rawTag.trim();
    }

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
    
    
    
}