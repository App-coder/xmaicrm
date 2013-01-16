package com.crm.service.portlets;

import java.util.List;

import com.crm.model.XmActivity;

public interface XmActivityService {

	List<XmActivity> getNotokcalendar(Integer userid);
	/**
	 * 
	 * 用户7内行程
	 * 
	 * @param userid
	 * @return
	 */
	List<XmActivity> getTopCalendar(String string);


}
