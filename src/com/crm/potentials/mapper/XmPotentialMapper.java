package com.crm.potentials.mapper;

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

}
