package com.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.mapper.XmCvcolumnlistMapper;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvcolumnlist;
import com.crm.service.XmCvcolumnlistService;
import com.crm.util.JsonUtil;
@Service("xmCvcolumnlistService")
public class XmCvcolumnlistServiceImpl implements XmCvcolumnlistService {
	
	XmCvcolumnlistMapper xmCvcolumnlistMapper;
	@Resource(name="xmCvcolumnlistMapper")
	public void setXmCvcolumnlistMapper(XmCvcolumnlistMapper xmCvcolumnlistMapper) {
		this.xmCvcolumnlistMapper = xmCvcolumnlistMapper;
	}


	@Override
	public List<XmCvcolumnlist> getXmCvcolumnlistByCvid(int viewid) {
		return this.xmCvcolumnlistMapper.getXmCvcolumnlistByCvid(viewid);
	}


	@Override
	public List<CVColumn> getViewColumn(XmCustomview customview) {
		if(customview==null){
			return null;
		}
		List<CVColumn> cols = new ArrayList<CVColumn>();
		List<XmCvcolumnlist> columns = this.getXmCvcolumnlistByCvid(customview.getCvid());
		if(columns.size()>=1){
			for(XmCvcolumnlist column : columns){
				CVColumn c = (CVColumn)JsonUtil.getObject4JsonString(column.getColumnname(), CVColumn.class);
				c.setResizable(false);
				cols.add(c);
			}
		}
		
		if(customview.getCollectcolumn()!=null && !customview.getCollectcolumn().equals("")){
			CVColumn collect = (CVColumn)JsonUtil.getObject4JsonString(customview.getCollectcolumn(), CVColumn.class);
			collect.setResizable(false);
			boolean exist = false;
			for(CVColumn co :cols){
				if(co.getField().equals(collect.getField())){
					exist = true;
				}
			}
			if(!exist){
				cols.add(collect);
			}
		}
		return cols;
	}


	@Override
	public void deleteCv(int cvid) {
		this.xmCvcolumnlistMapper.deleteCv(cvid);
		
	}


	@Override
	public void insert(XmCvcolumnlist col) {
		this.xmCvcolumnlistMapper.insert(col);
	}


	@Override
	public void deleteCvColumnlistByCvid(Integer id) {
		this.xmCvcolumnlistMapper.deleteCv(id);
		
	}


	@Override
	public List<CVColumn> getColumns(XmCustomview customview) {
		if(customview==null){
			return null;
		}
		List<CVColumn> cols = new ArrayList<CVColumn>();
		List<XmCvcolumnlist> columns = this.getXmCvcolumnlistByCvid(customview.getCvid());
		if(columns.size()>=1){
			for(XmCvcolumnlist column : columns){
				CVColumn c = (CVColumn)JsonUtil.getObject4JsonString(column.getColumnname(), CVColumn.class);
				cols.add(c);
			}
		}
		
		if(customview.getCollectcolumn()!=null && !customview.getCollectcolumn().equals("")){
			CVColumn collect = (CVColumn)JsonUtil.getObject4JsonString(customview.getCollectcolumn(), CVColumn.class);
			collect.setResizable(false);
			boolean exist = false;
			for(CVColumn co :cols){
				if(co.getField().equals(collect.getField())){
					exist = true;
				}
			}
			if(!exist){
				cols.add(collect);
			}
		}
		return cols;
	}

}
