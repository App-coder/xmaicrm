package com.crm.bean.crm;

public class Permission {
	int profileid;
	int tabid;
	
	String tablabel;
	int tabpermission;
	
	int create;
	int edit;
	int view;
	int delete;
	
	public int getProfileid() {
		return profileid;
	}
	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}
	public int getTabid() {
		return tabid;
	}
	public void setTabid(int tabid) {
		this.tabid = tabid;
	}
	public String getTablabel() {
		return tablabel;
	}
	public void setTablabel(String tablabel) {
		this.tablabel = tablabel;
	}
	public int getTabpermission() {
		return tabpermission;
	}
	public void setTabpermission(int tabpermission) {
		this.tabpermission = tabpermission;
	}
	public int getCreate() {
		return create;
	}
	public void setCreate(int create) {
		this.create = create;
	}
	public int getEdit() {
		return edit;
	}
	public void setEdit(int edit) {
		this.edit = edit;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
	
	
	
}