package com.crm.service.module.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.module.XmNormaltasksMapper;
import com.crm.service.module.XmNormaltasksService;
import com.crm.util.DateUtil;

@Service("xmNormaltasksService")
public class XmNormaltasksServiceImpl implements XmNormaltasksService {

	XmNormaltasksMapper xmNormaltasksMapper;
	@Resource(name="xmNormaltasksMapper")
	public void setXmNormaltasksMapper(XmNormaltasksMapper xmNormaltasksMapper) {
		this.xmNormaltasksMapper = xmNormaltasksMapper;
	}


	@Override
	public int getCountByStatus(int i) {
		return this.xmNormaltasksMapper.getCountByStatus(i);
	}


	@Override
	public int getCountOfOverTime() {
		String enddate = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT); 
		return this.xmNormaltasksMapper.getCountOfOverTime(enddate);
	}


	@Override
	public int getCountOfOutTimeFinished() {
		return this.xmNormaltasksMapper.getCountOfOutTimeFinished();
	}


	@Override
	public int getCountOfRollOut() {
		return this.xmNormaltasksMapper.getCountOfRollOut();
	}


	@Override
	public List loadListNotDo(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListNotDo(start,rows);
	}


	@Override
	public List loadListFollow(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListFollow(start,rows);
	}


	@Override
	public List loadListChange(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListChange(start,rows);
	}


	@Override
	public List loadListOverTime(int page, int rows) {
		String enddate = DateUtil.format(new Date(),DateUtil.C_DATE_PATTON_DEFAULT); 
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListOverTime(start,rows,enddate);
	}


	@Override
	public List loadListFinished(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListFinished(start,rows);
	}


	@Override
	public List loadListOutTimeFinished(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListOutTimeFinished(start,rows);
	}


	@Override
	public List loadListRollOut(int page, int rows) {
		int start = (page-1)*rows;
		return this.xmNormaltasksMapper.loadListRollOut(start,rows);
	}



}
