package com.crm.mapper.settings.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.model.XmUsers;

public interface XmUsersMapper {

	List<Object> getSysUser(@Param("start") int start,@Param("rows") int rows);

	int getTotal();

	List<XmUsers> getActiveUser();

    int deleteByPrimaryKey(Integer id);

    int insert(XmUsers record);

    int insertSelective(XmUsers record);

    XmUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XmUsers record);

    int updateByPrimaryKeyWithBLOBs(XmUsers record);

    int updateByPrimaryKey(XmUsers record);

	Object getUserById(@Param("id") int id);

	int setDeleteStatus(@Param("id") int id,@Param("delete") int delete);

	XmUsers selectUserByPassword(XmUsers user);

	List<XmUsers> getOptionsUser();

	Integer existUserName(@Param("username") String username);

	List<Object> getRelUser(@Param("start") int start,@Param("rows") int rows,@Param("roleid") String roleid);

	int getTotalRelUser(@Param("roleid") String roleid);

	List<XmUsers> loadAll();

	int setUserStatus(@Param("userid") Integer userid,@Param("status") String status,@Param("lastPing") String lastPing);

	int setUsersUnvalid(@Param("now") String now);

	List<XmUsers> getOnlineusers(@Param("now") String now);
	
}
