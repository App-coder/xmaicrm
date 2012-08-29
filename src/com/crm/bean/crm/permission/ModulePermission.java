package com.crm.bean.crm.permission;

import java.util.HashMap;
import java.util.List;

import com.crm.model.XmDefOrgField;
import com.crm.model.XmField;

public class ModulePermission {

	int profileid;
	int tabid;

	String tablabel;
	int tabpermission;

	int create = -1;
	int edit = -1;
	int view = -1;
	int del = -1;

	// 对应的字段权限
	List<XmField> profile2fields;
	
	HashMap<Integer, XmDefOrgField> defOrgFields;

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
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	public List<XmField> getProfile2fields() {
		return profile2fields;
	}
	public void setProfile2fields(List<XmField> profile2fields) {
		this.profile2fields = profile2fields;
	}
	public HashMap<Integer, XmDefOrgField> getDefOrgFields() {
		return defOrgFields;
	}
	public void setDefOrgFields(HashMap<Integer, XmDefOrgField> defOrgFields) {
		this.defOrgFields = defOrgFields;
	}

}
