package com.crm.model;

import java.util.Date;

public class XmAttachments {
    private Integer attachmentsid;

    private String name;

    private String description;

    private String type;

    private String setype;

    private String path;

    private Integer smcreatorid;

    private Date createdtime;

    private Integer deleted;
    
    private String username;

    public Integer getAttachmentsid() {
        return attachmentsid;
    }

    public void setAttachmentsid(Integer attachmentsid) {
        this.attachmentsid = attachmentsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSetype() {
        return setype;
    }

    public void setSetype(String setype) {
        this.setype = setype == null ? null : setype.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getSmcreatorid() {
        return smcreatorid;
    }

    public void setSmcreatorid(Integer smcreatorid) {
        this.smcreatorid = smcreatorid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}