package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmSendsmsbox;

public interface XmSendsmsboxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XmSendsmsbox record);

    int insertSelective(XmSendsmsbox record);

    XmSendsmsbox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmSendsmsbox record);

    int updateByPrimaryKeyWithBLOBs(XmSendsmsbox record);

    int updateByPrimaryKey(XmSendsmsbox record);

	List<XmSendsmsbox> loadList(@Param("start") int start,@Param("rows") int rows,@Param("userid") int userid);

	int getTotal(@Param("userid") Integer userid);
}