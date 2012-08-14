package com.crm.service.module.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmActivityMapper;
import com.crm.model.XmActivity;
import com.crm.service.module.XmActivityService;
import com.crm.util.DateUtil;

@Service("xmActivityService")
public class XmActivityServiceImpl implements XmActivityService {

	XmActivityMapper xmActivityMapper;
	@Resource(name="xmActivityMapper")
	public void setXmActivityMapper(XmActivityMapper xmActivityMapper) {
		this.xmActivityMapper = xmActivityMapper;
	}


	@Override
	public List<XmActivity> getTopActivity(String smownerid) {
		
		Calendar calendar = Calendar.getInstance();
		String today = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		calendar.add(Calendar.DAY_OF_WEEK, -1);
		String dayend = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		
		return this.xmActivityMapper.getTopActivity(today,dayend,smownerid);
	}


	@Override
	public List<XmActivity> getDayActivity() {
		String now = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		String tomorrow = DateUtil.format(calendar.getTime(),DateUtil.C_DATE_PATTON_DEFAULT);
		return this.xmActivityMapper.getDayActivity(now,tomorrow);
	}


	@Override
	public List<XmActivity> getActivity(String start, String end) {
		String begin = DateUtil.format(DateUtil.parseDate(start),DateUtil.C_DATE_PATTON_DEFAULT);
		String finish = DateUtil.format(DateUtil.parseDate(end),DateUtil.C_DATE_PATTON_DEFAULT);
		return this.xmActivityMapper.getActivitiesInInterval(begin,finish);
	}


	@Override
	public int getMaxId() {
		String maxid = this.xmActivityMapper.getMaxId();
		if(maxid!=null&&maxid!=""){
			return Integer.parseInt(maxid); 
		}
		return 0;
	}

}
