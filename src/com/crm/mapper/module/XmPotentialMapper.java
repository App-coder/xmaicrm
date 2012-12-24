package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.mapper.ModuleMapper;
import com.crm.model.XmPotential;


public interface XmPotentialMapper extends ModuleMapper<XmPotential>{

    int deleteByPrimaryKey(@Param("potentialid") Integer potentialid);

    int insert(@Param("record") XmPotential record);

    int insertSelective(@Param("record") XmPotential record);

    XmPotential selectByPrimaryKey(@Param("potentialid") Integer potentialid);

    int updateByPrimaryKeySelective(@Param("record") XmPotential record);

    int updateByPrimaryKeyWithBLOBs(@Param("record") XmPotential record);

    int updateByPrimaryKey(@Param("record") XmPotential record);

	List<XmPotential> getTopPotential();

	String getSalesCountByPick(@Param("colvalue") String colvalue,@Param("range") String range,@Param("firstday") String firstday,
		@Param("lastday") String lastday);

	int getPotentialOfUserAndLast(@Param("userid") Integer userid,@Param("start") String start,@Param("end") String end);

	List<XmPotential> getOpportunities(@Param("start") int start,@Param("rows") int rows,@Param("crmid") int crmid);

	int getTotalForOpportunities(@Param("crmid") int crmid);


}
