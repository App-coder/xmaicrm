package com.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.easyui.Column;
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
	public List<Column> getViewColumn(XmCustomview customview) {
		List<Column> cols = new ArrayList<Column>();
		List<XmCvcolumnlist> columns = this.getXmCvcolumnlistByCvid(customview.getCvid());
		if(columns.size()>=1){
			for(XmCvcolumnlist column : columns){
				Column c = (Column)JsonUtil.getObject4JsonString(column.getColumnname(), Column.class);
				c.setResizable(false);
				cols.add(c);
			}
		}
		
		if(customview.getCollectcolumn()!=null && !customview.getCollectcolumn().equals("")){
			Column collect = (Column)JsonUtil.getObject4JsonString(customview.getCollectcolumn(), Column.class);
			collect.setResizable(false);
			boolean exist = false;
			for(Column co :cols){
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
