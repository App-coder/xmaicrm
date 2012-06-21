package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmField;
import com.crm.model.XmTab;

public interface XmTabMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(XmTab record);

    int insertSelective(XmTab record);

    XmTab selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(XmTab record);

    int updateByPrimaryKey(XmTab record);

	XmTab getTabByName(@Param("tabname") String tabname);

	List<XmTab> getAll();

	List<XmTab> getParentTabAll();

	List<XmTab> existParenttabList(@Param("parenttabid") int parenttabid);

	String getExistTabids(@Param("parenttabid") int parenttabid);

	List<XmTab> getHiddenParenttabs(@Param("existtabids") String existtabids);

	List<XmTab> getTabPermission(@Param("profileid") int profileid);

	List<XmTab> getModules();

	List<XmTab> getModulesOfCustomMultiField();

	List<XmTab> getMultiApproveModule();

	List<XmTab> getCustomsharingsModule();

	List<XmTab> getDefOrgFieldModule();

	List<XmTab> getRelatedModule();
	
	List<XmTab> getProductFieldModule();
	
	List<XmTab> getRelmodField();
	
}