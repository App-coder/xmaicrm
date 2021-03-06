package com.crm.service;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmField;
import com.crm.model.XmProfile2field;

public interface XmFieldService {
	
	/**
	 * 返回根据对应的表返回对应的报表字段
	 * 
	 * @param tabname 表名
	 * @return
	 */
	List<XmField> getReportField(String tabname);

	List<XmField> getFieldByBlockAndTab(Integer tabid, Integer blockid);

	List<XmField> getSearchFields(Integer tabid);

	List<XmField> getReportItems(int tabid);

	/**
	 * 根据表的ID获取，字段信息
	 * @param tabid
	 * @return
	 */
	List<XmField> getFieldsByTabid(Integer tabid);

	
	List<XmField> getProfileFieldsByTabid(Integer profileid,Integer tabid);

	/**
	 * 视图编辑的字段
	 * 
	 * @param tabid
	 * @param blockstr
	 * @return
	 */
	List<XmField> getEditFields(Integer tabid, String blockstr);
	
	List<Object> getLayoutField(Integer tabid,Integer blockid);
	
	int updateByPrimaryKeySelective(XmField xmField);

	/**
	 * 
	 * 全局字段，根据TABID，进行查询
	 * 
	 * @param tabid
	 * @return
	 */
	List<Object> getDefOrgFields(int tabid);
	
	int submit(int tabid,String ck_fieldid,String unck_fieldid);
	
	List<Object> getProductField(String module);
	
	List<Object> getRelmodField(String module,int tabid);

	List<Object> getMultiLevel2(Integer tabid,String typeofdata);
	/**
	 * @param tabid 模块的ID
	 * @param columns 回收站显示字段
	 * @return 
	 */
	List<XmField> getRecycleBinFields(int tabid, String[] columns);
	
	List<Object> getApproveStepFieldTab(Integer tabid);
	
	List<Object> getApproveStepFieldTabDetail(Integer stepid,Integer tabid);
	
	List<XmField> getApproveStepFilters(Integer tabid);

	public List<XmField> getDisplayFields(Integer tabid, String blockstr);

}
