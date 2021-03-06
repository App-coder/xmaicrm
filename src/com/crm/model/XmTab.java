package com.crm.model;

import java.io.Serializable;

public class XmTab implements Serializable{
	
	private static final long serialVersionUID = -1252024588479189121L;

	private Integer tabid;

    private String name;

    private Integer presence;

    private Integer tabsequence;

    private String tablabel;

    private Integer modifiedby;

    private Integer modifiedtime;

    private Integer customized;

    private Integer reportable;
    
    //用于权限控制的字段
    private Integer permissions;
    
    private Integer profileid;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public Integer getTabsequence() {
        return tabsequence;
    }

    public void setTabsequence(Integer tabsequence) {
        this.tabsequence = tabsequence;
    }

    public String getTablabel() {
        return tablabel;
    }

    public void setTablabel(String tablabel) {
        this.tablabel = tablabel == null ? null : tablabel.trim();
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Integer modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getCustomized() {
        return customized;
    }

    public void setCustomized(Integer customized) {
        this.customized = customized;
    }

    public Integer getReportable() {
        return reportable;
    }

    public void setReportable(Integer reportable) {
        this.reportable = reportable;
    }

	public Integer getPermissions() {
		return permissions;
	}

	public void setPermissions(Integer permissions) {
		this.permissions = permissions;
	}

	public Integer getProfileid() {
		return profileid;
	}

	public void setProfileid(Integer profileid) {
		this.profileid = profileid;
	}
    
    
    
}