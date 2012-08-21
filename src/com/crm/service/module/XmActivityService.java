package com.crm.service.module;

import java.util.List;

import com.crm.bean.crm.UserPermission;
import com.crm.model.XmActivity;

public interface XmActivityService {

	List<XmActivity> getTopActivity(String smownerid);

	/**
	 * 得到当天的日程安排
	 * 
	 * @return
	 */
	List<XmActivity> getDayActivity();

	/**
	 * 根据时间间隔取得事件，日程
	 * 
	 * @param start
	 * @param end
	 * @param smowner 
	 * @return
	 */
	List<XmActivity> getActivity(String start, String end, String smowner,UserPermission userPermission);

	int getMaxId(); 

}
