package com.crm.model;

public class XmHometemplatesrole {
    private Integer hometemplatesid;

    private String roleid;
    
    private String rolename;

    public Integer getHometemplatesid() {
        return hometemplatesid;
    }

    public void setHometemplatesid(Integer hometemplatesid) {
        this.hometemplatesid = hometemplatesid;
    }

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
		this.rolename = rolename;
	}
    
    
    
}