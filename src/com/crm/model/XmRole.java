package com.crm.model;

public class XmRole {
    private String roleid;

    private String rolename;

    private String parentrole;

    private Integer depth;
    
    private String state;
    
    private Boolean relTemplate;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getParentrole() {
        return parentrole;
    }

    public void setParentrole(String parentrole) {
        this.parentrole = parentrole == null ? null : parentrole.trim();
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getRelTemplate() {
		return relTemplate;
	}

	public void setRelTemplate(Boolean relTemplate) {
		this.relTemplate = relTemplate;
	}
    
    
    
}