package com.crm.mapper.util;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.bean.crm.SearchField;
import com.crm.bean.easyui.Column;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.mapper.XmCvadvfilterMapper;
import com.crm.mapper.XmCvstdfilterMapper;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.util.JsonUtil;

@Component
public class CvFilter {
	
	XmCustomviewMapper XmCustomviewMapper;
	@Resource(name="XmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		XmCustomviewMapper = xmCustomviewMapper;
	}

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
		
		XmCustomview customview = this.XmCustomviewMapper.selectByPrimaryKey(viewid);
		XmCvstdfilter stdfilter = this.xmCvstdfilterMapper.getStdfilter(viewid);
		List<XmCvadvfilter> advfilters = this.xmCvadvfilterMapper.getAdvFilters(viewid);
		
		String filter = "";
		if(stdfilter!=null){
			if(stdfilter.getColumnname()!=null && stdfilter.getStartdate()!=null){
					SearchField std = (SearchField)JsonUtil.getObject4JsonString(stdfilter.getColumnname(), SearchField.class);
					filter +=" and "+customview.getEntitytype() +"."+std.getField() +">'"+stdfilter.getStartdate()+"' and "+customview.getEntitytype() +"."+std.getField()+"<'"+stdfilter.getEnddate()+"'";
			}
		}
		
		if(advfilters!=null){
			for(XmCvadvfilter advfilter:advfilters){
				SearchField adv = null;
				if(advfilter.getColumnname()!=null && !advfilter.getColumnname().equals("")){
					adv = (SearchField)JsonUtil.getObject4JsonString(advfilter.getColumnname(), SearchField.class);
					filter +=" and "+customview.getEntitytype() +"."+adv.getField()+this.getJudge(advfilter,adv);
				}
			}
		}
		
		return filter;
	}
	
	private String getJudge(XmCvadvfilter advfilter,SearchField adv){
		String c = "";
		String cpen = advfilter.getComparator();
		if(cpen.equals("e")){
			c = "="+getColumnVal(adv.getType(),advfilter.getValue());
		}else if(cpen.equals("n")){
			c = "!="+getColumnVal(adv.getType(),advfilter.getValue());
		}else if(cpen.equals("s")){
			c = "like "+getColumnVal(adv.getType(),advfilter.getValue()+"%");
		}else if(cpen.equals("c")){
			c = "like "+getColumnVal("%"+adv.getType(),advfilter.getValue()+"%");
		}else if(cpen.equals("k")){
			c = "not like "+getColumnVal("%"+adv.getType(),advfilter.getValue()+"%");
		}else if(cpen.equals("l")){
			c = "<"+getColumnVal(adv.getType(),advfilter.getValue());
		}else if(cpen.equals("g")){
			c = ">"+getColumnVal(adv.getType(),advfilter.getValue());
		}else if(cpen.equals("m")){
			c = "<="+getColumnVal(adv.getType(),advfilter.getValue());
		}else if(cpen.equals("h")){
			c = ">="+getColumnVal(adv.getType(),advfilter.getValue());
		}else if(cpen.equals("")){
			
		}
		return c;
	}

	private String getColumnVal(String type,String value) {
		if(type=="Date" || type=="String"){
			return "'"+value+"'";
		}else{
			return value;
		}
	}
	
	public String getFilter(XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters){
		String filter = "";
		if(stdfilter!=null){
			if(stdfilter.getColumnname()!=null && stdfilter.getStartdate()!=null){
					SearchField std = (SearchField)JsonUtil.getObject4JsonString(stdfilter.getColumnname(), SearchField.class);
					filter +=" and "+customview.getEntitytype() +"."+std.getField() +">'"+stdfilter.getStartdate()+"' and "+customview.getEntitytype() +"."+std.getField()+"<'"+stdfilter.getEnddate()+"'";
			}
		}
		
		if(advfilters!=null){
			for(XmCvadvfilter advfilter:advfilters){
				SearchField adv = null;
				if(advfilter.getColumnname()!=null && !advfilter.getColumnname().equals("")){
					adv = (SearchField)JsonUtil.getObject4JsonString(advfilter.getColumnname(), SearchField.class);
					filter +=" and "+customview.getEntitytype() +"."+adv.getField()+this.getJudge(advfilter,adv);
				}
			}
		}
		
		return filter;
	}

	public String getTotalFilter(int viewid, XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters,List<Column> cols) {
		String totalfilter = "";
		if(cols.size()>=1){
			totalfilter +="SELECT count(1) AS count FROM xm_"+customview.getEntitytype()+" " ;
			for(int i=0;i<cols.size();i++){
				Column n = cols.get(i);
				if(n.getField().indexOf("assigned_")!=-1){
					//totalfilter +=" INNER JOIN  "+customview.getEntitytype()+"."+n.getColumn()+" = "+n.getField().replace("assigned_", "").replace("_id", "") +" on "+n.getColumn();
					String tab = "xm_"+n.getField().replace("assigned_", "").replace("_id", "");
					totalfilter +=" INNER JOIN "+tab+" on "+customview.getEntitytype()+"."+n.getColumn()+"="+tab+".id";
				}else if(n.getField().indexOf("_")!=-1){
					String tab = n.getField().replace("_id", "");
					totalfilter += " INNER JOIN "+tab +" on "+customview.getEntitytype()+"."+n.getColumn()+"="+tab+"."+n.getField().replace("_id", "id");
				}
			}
		}else{
			totalfilter +="SELECT count(1) AS count FROM xm_"+customview.getEntitytype()+" where 1=1 " ;
		}
		return totalfilter+getFilter(customview, stdfilter, advfilters);
	}

	public String getListFilter(int viewid, XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters,List<Column> cols) {
		return null;
	}
}
