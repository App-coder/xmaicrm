package com.crm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmTab;

public interface XmTabService {

	XmTab getTabByName(String entitytype);

	List<XmTab> getAll();

	List<XmTab> getParentTabAll();

	List<XmTab> existParenttabList(int parenttabid);

	String getExistTabids(int parenttabid);

	List<XmTab> getHiddenParenttabs(String existtabids);

	List<XmTab> getTabPermission(int profileid);

	List<XmTab> getModules();

	List<XmTab> getModulesOfCustomMultiField();

	List<XmTab> getMultiApproveModule();

	/**
	 * 得到自定义共享规则的模块
	 * 
	 * @return
	 */
	List<XmTab> getCustomsharingsModule();

	/**
	 * 
	 * 默认全局字段的模块
	 * @return
	 */
	List<XmTab> getDefOrgFieldModule();

	/**
	 * 得到相关信息的模块
	 * @return
	 */
	List<XmTab> getRelatedModule();
	
	/**
	 * 得到产品关联字段的模块
	 * @return
	 */
	List<XmTab> getProductFieldModule();
	
	List<XmTab> getRelmodField();

	List<XmTab> getTabPermission();

	List<XmTab> getRecyclebinModule(String skipstr);
	
	XmTab selectByPrimaryKey(Integer tabid);



}
