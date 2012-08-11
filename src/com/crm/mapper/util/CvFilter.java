package com.crm.mapper.util;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.crm.bean.crm.SearchField;
import com.crm.mapper.XmCvadvfilterMapper;
import com.crm.mapper.XmCvstdfilterMapper;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.util.JsonUtil;

@Component
public class CvFilter {
	XmCvadvfilterMapper xmCvadvfilterMapper;
	@Resource(name="xmCvadvfilterMapper")
	public void setXmCvadvfilterMapper(XmCvadvfilterMapper xmCvadvfilterMapper) {
		this.xmCvadvfilterMapper = xmCvadvfilterMapper;
	}

	XmCvstdfilterMapper xmCvstdfilterMapper;
	@Resource(name="xmCvstdfilterMapper")
	public void setXmCvstdfilterMapper(XmCvstdfilterMapper xmCvstdfilterMapper) {
		this.xmCvstdfilterMapper = xmCvstdfilterMapper;
	}
	
	public String getFilter(int viewid) {
		XmCvstdfilter stdfilter = this.xmCvstdfilterMapper.getStdfilter(viewid);
		List<XmCvadvfilter> advfilters = this.xmCvadvfilterMapper.getAdvFilters(viewid);
		
		String filter = "";
		if(stdfilter!=null){
			if(stdfilter.getColumnname()!=null){
				SearchField std = (SearchField)JsonUtil.getObject4JsonString(stdfilter.getColumnname(), SearchField.class);
				filter +=" and "+ std.getField() +">'"+stdfilter.getStartdate()+"' and "+stdfilter.getColumnname()+"<'"+stdfilter.getEnddate()+"'";
			}
		}
		
		if(advfilters!=null){
			for(XmCvadvfilter advfilter:advfilters){
				SearchField adv = null;
				if(advfilter.getColumnname()!=null){
					adv = (SearchField)JsonUtil.getObject4JsonString(advfilter.getColumnname(), SearchField.class);
					filter +=" and "+adv.getField()+advfilter.getComparator()+this.getColumnVal(adv,advfilter);
				}
			}
		}
		
		return filter;
	}

	private String getColumnVal(SearchField adv,XmCvadvfilter advfilter) {
		if(adv.getType()=="Date" || adv.getType()=="String"){
			return "'"+advfilter.getValue()+"'";
		}else{
			return advfilter.getValue();
		}
	}
}
