package com.crm.bean.crm;

import java.util.List;

import com.crm.model.XmHomestuff;
import com.crm.model.XmHometemplates;
import com.crm.model.XmHometemplatesrole;
import com.crm.model.XmRole;

public class Hometemplates {
	private XmHometemplates xmHometemplates;
	private List<XmHomestuff> homestuffs;
	private List<XmHometemplatesrole> hometemplatesroles;
	private List<XmRole> relRoles;
	
	public XmHometemplates getXmHometemplates() {
		return xmHometemplates;
	}
	public void setXmHometemplates(XmHometemplates xmHometemplates) {
		this.xmHometemplates = xmHometemplates;
	}
	public List<XmHomestuff> getHomestuffs() {
		return homestuffs;
	}
	public void setHomestuffs(List<XmHomestuff> homestuffs) {
		this.homestuffs = homestuffs;
	}
	public List<XmHometemplatesrole> getHometemplatesroles() {
		return hometemplatesroles;
	}
	public void setHometemplatesroles(List<XmHometemplatesrole> hometemplatesroles) {
		this.hometemplatesroles = hometemplatesroles;
	}
	public List<XmRole> getRelRoles() {
		return relRoles;
	}
	public void setRelRoles(List<XmRole> relRoles) {
		this.relRoles = relRoles;
	}
	
}
