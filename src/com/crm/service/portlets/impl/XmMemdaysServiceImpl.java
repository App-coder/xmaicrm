package com.crm.service.portlets.impl;

import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.mapper.XmMemdaysMapper;
import com.crm.model.XmMemdays;
import com.crm.service.portlets.XmMemdaysService;
import com.crm.util.time.TimeGet;

@Component("com.crm.service.portlets.impl.xmMemdaysService")
public class XmMemdaysServiceImpl implements XmMemdaysService{

	XmMemdaysMapper xmMemdaysMapper;
	@Resource(name="xmMemdaysMapper")
	public void setXmMemdaysMapper(XmMemdaysMapper xmMemdaysMapper) {
		this.xmMemdaysMapper = xmMemdaysMapper;
	}


	@Override
	public List<XmMemdays> getAccountMemdays() {
		TimeGet tg = new TimeGet();
		return this.xmMemdaysMapper.getAccountMemdays(tg.getFirstDayOfMonth(Calendar.getInstance()),tg.getLastDayOfMonth(Calendar.getInstance()));
	}

}
