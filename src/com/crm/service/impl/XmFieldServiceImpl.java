package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.XmFieldMapper;
import com.crm.mapper.XmTabMapper;
import com.crm.model.XmField;
import com.crm.model.XmTab;
import com.crm.service.XmFieldService;
import com.crm.util.ArrayUtil;
@Service("xmFieldService")
public class XmFieldServiceImpl implements XmFieldService{

	XmFieldMapper xmFieldMapper;
	@Resource(name="xmFieldMapper")
	public void setXmFieldMapper(XmFieldMapper xmFieldMapper) {
		this.xmFieldMapper = xmFieldMapper;
	}
	
	XmTabMapper xmTabMapper;
	@Resource(name="xmTabMapper")
	public void setXmTabMapper(XmTabMapper xmTabMapper) {
		this.xmTabMapper = xmTabMapper;
	}

	public List<XmField> getReportField(String tabname) {
		XmTab tab = this.xmTabMapper.getTabByName(tabname);
		try{
			List<XmField> fields = this.xmFieldMapper.getReportField(tab.getTabid());
			return fields;
		}catch(NullPointerException e){
			return null;
		}
	}

	@Override
	public List<XmField> getFieldByBlockAndTab(Integer tabid, Integer blockid) {
		return this.xmFieldMapper.getFieldByBlockAndTab(tabid,blockid);
	}

	@Override
	public List<XmField> getSearchFields(Integer tabid) {
		return this.xmFieldMapper.getSearchFields(tabid);
	}

	@Override
	public List<XmField> getReportItems(int tabid) {
		return this.xmFieldMapper.getReportItems(tabid);
	}

	@Override
	public List<XmField> getFieldsByTabid(Integer tabid) {
		return this.xmFieldMapper.getFieldsByTabid(tabid);
	}

	@Override
	public List<XmField> getProfileFieldsByTabid(Integer profileid,Integer tabid) {
		return this.xmFieldMapper.getProfileFieldsByTabid(profileid,tabid);
	}

	@Override
	public List<XmField> getEditFields(Integer tabid, String blockstr) {
		return this.xmFieldMapper.getEditFields(tabid,blockstr);
	}
	
	@Override
	public List<Object> getLayoutField(Integer tabid, Integer blockid) {
		return this.xmFieldMapper.getLayoutField(tabid, blockid);
	}
	
	@Override
	public int updateByPrimaryKeySelective(XmField xmField) {
		return this.xmFieldMapper.updateByPrimaryKeySelective(xmField);
	}

	@Override
	public List<Object> getDefOrgFields(int tabid) {
		return this.xmFieldMapper.getDefOrgFields(tabid);
	}
	
	@Override
	public int submit(int tabid, String ck_fieldid, String unck_fieldid) {
		String fieldids="";
		int affect=0;
		if(ck_fieldid.split(",").length>0 && !ck_fieldid.split(",")[0].equals("")){
			fieldids="("+ck_fieldid+")";
			affect+=this.xmFieldMapper.updateDefOrgVisible(tabid, 0, fieldids);
		}
		if(unck_fieldid.split(",").length>0 && !unck_fieldid.split(",")[0].equals("")){
			fieldids="("+unck_fieldid+")";
			affect+=this.xmFieldMapper.updateDefOrgVisible(tabid, 1, fieldids);
		}
		return affect;
	}
	
	@Override
	public List<Object> getProductField(String module) {
		return this.xmFieldMapper.getProductField(module);
	}
	
	@Override
	public List<Object> getRelmodField(String module, int tabid) {
		return this.xmFieldMapper.getRelmodField(module, tabid);
	}
	
	@Override
	public List<Object> getMultiLevel2(Integer tabid, String typeofdata) {
		return this.xmFieldMapper.getMultiLevel2(tabid, typeofdata);
	}
	

	@Override
	public List<XmField> getRecycleBinFields(int tabid, String[] columns) {
		List<XmField> recyclebinFields = this.xmFieldMapper.getRecycleBinFields(tabid,ArrayUtil.arrayToJoinStr(columns));
		return recyclebinFields;
	}
	
	//审批流程子节点的字段权限页面标题
	@Override
	public List<Object> getApproveStepFieldTab(Integer tabid) {
		return this.xmFieldMapper.getApproveStepFieldTab(tabid);
	}
	
	//审批流程子节点的字段权限内容
	@Override
	public List<Object> getApproveStepFieldTabDetail(Integer stepid,Integer tabid) {
		return this.xmFieldMapper.getApproveStepFieldTabDetail(stepid,tabid);
	}
	
	@Override
	public List<XmField> getApproveStepFilters(Integer tabid) {
		return this.xmFieldMapper.getApproveStepFilters(tabid);
	}

	@Override
	public List<XmField> getDisplayFields(Integer tabid, String blockstr) {
		return this.xmFieldMapper.getDisplayFields(tabid,blockstr);
	}

}
