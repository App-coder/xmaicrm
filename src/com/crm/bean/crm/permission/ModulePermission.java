package com.crm.bean.crm.permission;

public class ModulePermission {
	int profileid;
	int tabid;
	
	String tablabel;
	int tabpermission;
	
	int permission;
	int create;
	int edit;
	int view;
	int del;
	
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
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
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
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	
}
