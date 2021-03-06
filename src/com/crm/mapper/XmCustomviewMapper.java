package com.crm.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmCustomview;

public interface XmCustomviewMapper {
    int deleteByPrimaryKey(Integer cvid);

    int insert(XmCustomview record);

    int insertSelective(XmCustomview record);

    XmCustomview selectByPrimaryKey(@Param("cvid")  Integer cvid);

    int updateByPrimaryKeySelective(XmCustomview record);

    int updateByPrimaryKey(XmCustomview record);
    
    List<XmCustomview> queryByEntityType(@Param("entitytype") String entitytype);

	int getDefault(@Param("entitytype") String entitytype);

	XmCustomview getDefaultCView(@Param("entitytype") String entitytype);
	
	List<XmCustomview> loadCViewByEntitytype(@Param("entitytype") String entitytype);

	List<XmCustomview> loadList(@Param("entitytype") String entitytype);

	int setAllNotDef(@Param("entitytype") String entitytype);
	
	int setDef(@Param("cvid") int cvid);

	int deleteCv(@Param("cvid") int cvid);

	int getTotalBySql(@Param("totalsql") String totalsql);

	List<Map> loadListBySql(@Param("start") int start,@Param("rows") int rows,@Param("listsql") String listsql);

	List<XmCustomview> loadListByPage(@Param("entitytype") String entitytype,@Param("start") int start,@Param("rows") int rows);

	int getTotal(@Param("entitytype") String entitytype);

	List<Object> getChartData(@Param("resultsql") String resultsql);

	List<XmCustomview> getKeyCustomview();

	XmCustomview getFirstCView(@Param("entitytype") String entitytype);

	int insertsql(@Param("sql") String sql);

	Map getObject(@Param("sql") String sql);

	String getFieldValue(@Param("sql") String sql);

	int update(@Param("sql") String sql);

	String getModuleVal(@Param("sql") String sql);

	String getAccountByContactid(@Param("contactid") String contactid);

	int updateSmowner(@Param("updatesql") String updatesql);
	
}