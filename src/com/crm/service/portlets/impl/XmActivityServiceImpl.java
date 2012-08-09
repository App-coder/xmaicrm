package com.crm.service.portlets.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.module.XmActivityMapper;
import com.crm.model.XmActivity;
import com.crm.service.portlets.XmActivityService;
import com.crm.util.DateUtil;

@Component("com.crm.service.portlets.impl.xmActivityService")
public class XmActivityServiceImpl implements XmActivityService {
	
	XmActivityMapper xmActivityMapper;
	@Resource(name="xmActivityMapper")
	public void setXmActivityMapper(XmActivityMapper xmActivityMapper) {
		this.xmActivityMapper = xmActivityMapper;
	}


	@Override
	public List<XmActivity> getNotokcalendar(Integer userid) {
		String today = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		return this.xmActivityMapper.getNotokcalendar(today,userid);
	}


	@Override
	public List<XmActivity> getTopCalendar(String userid) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.WEEK_OF_MONTH, 1);
		
		String now = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		String next = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
				
		return this.xmActivityMapper.getTopCalendar(userid,now,next);
	}

}
