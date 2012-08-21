package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.easyui.expand.CVColumn;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.service.XmCustomViewService;

@Service("xmCustomViewService")
public class XmCustomViewServiceImpl implements XmCustomViewService {
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}
	
    XmCustomviewMapper xmCustomviewMapper;
    @Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
	}

	public List<XmCustomview> queryByEntityType(String entitytype) {
		return this.xmCustomviewMapper.queryByEntityType(entitytype);
	}

	@Override
	public int getDefault(String string) {
		return this.xmCustomviewMapper.getDefault(string);
	}

	@Override
	public XmCustomview selectByPrimaryKey(String entitytype, int viewid) {
		if(viewid==-1){
			return this.xmCustomviewMapper.getDefaultCView(entitytype);
		}
		return this.xmCustomviewMapper.selectByPrimaryKey(viewid);
	}

	@Override
	public List<XmCustomview> loadCViewByEntitytype(String entitytype) {
		return this.xmCustomviewMapper.loadCViewByEntitytype(entitytype);
	}

	@Override
	public List<XmCustomview> loadList(String entitytype) {
		return this.xmCustomviewMapper.loadList(entitytype);
	}

	@Override
	public boolean setDef(int cvid, String entitytype) {
		this.xmCustomviewMapper.setAllNotDef(entitytype);
		int result = this.xmCustomviewMapper.setDef(cvid);
		if(result==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCv(int cvid) {
		int result = this.xmCustomviewMapper.deleteByPrimaryKey(cvid);
		if(result==1){
			return true;
		}
		return false;
	}

	@Override
	public Integer insert(XmCustomview cv) {
		return this.xmCustomviewMapper.insert(cv);
	}

	@Override
	public void update(XmCustomview cv) {
		this.xmCustomviewMapper.updateByPrimaryKey(cv);
	}

	@Override
	public XmCustomview getView(int viewid) {
		return this.xmCustomviewMapper.selectByPrimaryKey(viewid);
	}

	@Override
	public int getTotal(int viewid, XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilter,
			List<CVColumn> cols) {
		String totalsql = this.cvFilter.getTotalFilter(viewid,customview,stdfilter,advfilter,cols);
		return this.xmCustomviewMapper.getTotalBySql(totalsql);
	}

	@Override
	public List<Object> loadList(int page, int rows, int viewid,
			XmCustomview customview, XmCvstdfilter stdfilter,
			List<XmCvadvfilter> advfilter, List<CVColumn> cols) {
		String listsql = this.cvFilter.getListFilter(viewid,customview,stdfilter,advfilter,cols);
		int start = (page-1)*rows;
		return this.xmCustomviewMapper.loadListBySql(start,rows,listsql);
	}

	@Override
	public List<XmCustomview> loadList(String entitytype, int page, int rows) {
		int start = (page-1)*rows;
		return this.xmCustomviewMapper.loadListByPage(entitytype,start,rows);
	}

	@Override
	public int getTotal(String entitytype) {
		return this.xmCustomviewMapper.getTotal(entitytype);
	}
}
