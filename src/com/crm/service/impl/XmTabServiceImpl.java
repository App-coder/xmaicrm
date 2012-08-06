package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmTabMapper;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
@Service("xmTabService")
public class XmTabServiceImpl implements XmTabService {
	
	XmTabMapper xmTabMapper;
	@Resource(name="xmTabMapper")
	public void setXmTabMapper(XmTabMapper xmTabMapper) {
		this.xmTabMapper = xmTabMapper;
	}
	@Override
	public XmTab getTabByName(String entitytype) {
		return xmTabMapper.getTabByName(entitytype);
	}
	@Override
	public List<XmTab> getAll() {
		return xmTabMapper.getAll();
	}
	@Override
	public List<XmTab> getParentTabAll() {
		return this.xmTabMapper.getParentTabAll();
	}
	@Override
	public List<XmTab> existParenttabList(int parenttabid) {
		return this.xmTabMapper.existParenttabList(parenttabid);
	}
	@Override
	public String getExistTabids(int parenttabid) {
		return this.xmTabMapper.getExistTabids(parenttabid);
	}
	@Override
	public List<XmTab> getHiddenParenttabs(String existtabids) {
		return this.xmTabMapper.getHiddenParenttabs(existtabids);
	}
	@Override
	public List<XmTab> getTabPermission(int profileid) {
		return this.xmTabMapper.getTabPermission(profileid);
	}
	@Override
	public List<XmTab> getModules() {
		return this.xmTabMapper.getModules();
	}
	@Override
	public List<XmTab> getModulesOfCustomMultiField() {
		return this.xmTabMapper.getModulesOfCustomMultiField();
	}
	@Override
	public List<XmTab> getMultiApproveModule() {
		return this.xmTabMapper.getMultiApproveModule();
	}

	@Override
	public List<XmTab> getCustomsharingsModule() {
		return this.xmTabMapper.getCustomsharingsModule();
	}
	@Override
	public List<XmTab> getDefOrgFieldModule() {
		return this.xmTabMapper.getDefOrgFieldModule();
	}
	@Override
	public List<XmTab> getRelatedModule() {
		return this.xmTabMapper.getRelatedModule();
	}
	
	

}
