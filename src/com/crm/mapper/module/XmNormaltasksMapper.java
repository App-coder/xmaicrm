package com.crm.mapper.module;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmNormaltasks;

public interface XmNormaltasksMapper {
    int deleteByPrimaryKey(Integer normaltasksid);

    int insert(XmNormaltasks record);

    int insertSelective(XmNormaltasks record);

    XmNormaltasks selectByPrimaryKey(Integer normaltasksid);

    int updateByPrimaryKeySelective(XmNormaltasks record);

    int updateByPrimaryKeyWithBLOBs(XmNormaltasks record);

    int updateByPrimaryKey(XmNormaltasks record);

	int getCountByStatus(int i);

	int getCountOfOverTime(@Param("enddate") String enddate);

	int getCountOfOutTimeFinished();

	int getCountOfRollOut();

	List loadListNotDo(@Param("start") int start,@Param("rows") int rows);

	List loadListFollow(@Param("start") int start,@Param("rows") int rows);

	List loadListChange(@Param("start") int start,@Param("rows") int rows);

	List loadListOverTime(@Param("start") int start,@Param("rows") int rows,@Param("enddate") String enddate);

	List loadListFinished(@Param("start") int start,@Param("rows") int rows);

	List loadListOutTimeFinished(@Param("start") int start,@Param("rows") int rows);

	List loadListRollOut(@Param("start") int start,@Param("rows") int rows);

}