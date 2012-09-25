package com.crm.mapper.util;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.bean.crm.SearchField;
import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.mapper.XmCvadvfilterMapper;
import com.crm.mapper.XmCvstdfilterMapper;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.util.JsonUtil;
import com.crm.util.crm.CustomViewUtil;

@Component
public class CvFilter {
	
	XmCustomviewMapper xmCustomviewMapper;
	@Resource(name="xmCustomviewMapper")
	public void setXmCustomviewMapper(XmCustomviewMapper xmCustomviewMapper) {
		this.xmCustomviewMapper = xmCustomviewMapper;
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
	
	private String getJudge(XmCvadvfilter advfilter,CVColumn adv){
		String c = "";
		String cpen = advfilter.getComparator();
		if(cpen.equals("e")){
			c = " = "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue());
		}else if(cpen.equals("n")){
			c = " != "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue());
		}else if(cpen.equals("s")){
			c = " like "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue()+"%");
		}else if(cpen.equals("c")){
			c = " like "+getColumnVal("%"+adv.getFieldtypeofdata(),advfilter.getValue()+"%");
		}else if(cpen.equals("k")){
			c = " not like "+getColumnVal("%"+adv.getFieldtypeofdata(),advfilter.getValue()+"%");
		}else if(cpen.equals("l")){
			c = " < "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue());
		}else if(cpen.equals("g")){
			c = " > "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue());
		}else if(cpen.equals("m")){
			c = " <= "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue());
		}else if(cpen.equals("h")){
			c = " >= "+getColumnVal(adv.getFieldtypeofdata(),advfilter.getValue());
		}else if(cpen.equals("")){
			
		}
		return c;
	}

	private String getColumnVal(String type,String value) {
		type = getType(type);
		if(type=="Date" || type=="Varchar"){
			return "'"+value+"'";
		}else{
			return value;
		}
	}
	
	public String getType(String type){
		String typestr = "";
		if(type.indexOf("C")!=-1){
			typestr = "Boolean";
		}else if(type.indexOf("D")!=-1){
			typestr = "Date";
		}else if(type.indexOf("DT")!=-1){
			typestr = "DateTime";
		}else if(type.indexOf("E")!=-1){
			typestr = "EMail";
		}else if(type.indexOf("I")!=-1){
			typestr = "Integer";
		}else if(type.indexOf("N")!=-1){
			typestr = "Number";
		}else if(type.indexOf("V")!=-1){
			typestr = "Varchar";
		}
		return typestr;
	}
	
	/**
	 * 
	 * 得到过滤，条件，用于拼接sql串
	 * 
	 * @param customview 视图
	 * @param stdfilter 标准过滤条件
	 * @param advfilters 高级过滤条件
	 * @return
	 */
	public String getFilter(XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters){
		String filter = "";
		XmEntityname en = CustomViewUtil.getEntitynameByET(customview.getEntitytype());
		if(stdfilter!=null){
			if(stdfilter.getColumnname()!=null && stdfilter.getStartdate()!=null){
					CVColumn std = (CVColumn)JsonUtil.getObject4JsonString(stdfilter.getColumnname(), CVColumn.class);
					filter +=" and "+en.getTablename() +"."+std.getField()+">'"+stdfilter.getStartdate()+"' and "+en.getTablename() +"."+std.getField()+"<'"+stdfilter.getEnddate()+"'";
			}
		}
		
		if(advfilters!=null){
			for(XmCvadvfilter advfilter:advfilters){
				CVColumn adv = null;
				if(advfilter.getColumnname()!=null && !advfilter.getColumnname().equals("")){
					adv = (CVColumn)JsonUtil.getObject4JsonString(advfilter.getColumnname(), CVColumn.class);
					if(adv.getField().indexOf("assigned_")!=-1){
						filter +=" and xm_users.id"+this.getJudge(advfilter,adv);
					}else{
						XmEntityname ey = CustomViewUtil.getEntitynameByET(adv.getEntitytype());
						filter +=" and "+ey.getTablename() +"."+adv.getField()+this.getJudge(advfilter,adv);
					}
					
					
				}
			}
		}
		
		return filter;
	}

	public String getTotalFilter(int viewid, XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters,List<CVColumn> cols) {
		String totalfilter = "";
		XmEntityname en = CustomViewUtil.getEntitynameByET(customview.getEntitytype());
		if(cols.size()>=1){
			totalfilter +="SELECT count(1) AS count FROM "+en.getTablename()+" " ;
			for(int i=0;i<cols.size();i++){
				CVColumn n = cols.get(i);
				XmEntityname cd = CustomViewUtil.getEntitynameByET(n.getEntitytype());
				if(n.getFieldname()!=null){
					if(n.getFieldname().indexOf("assigned_")!=-1){
						totalfilter +=" INNER JOIN xm_users on "+n.getFieldtabname()+"."+n.getFieldcolname()+"=xm_users.id";
					}
					/*
					else if(n.getFieldname().indexOf("_")!=-1){
						XmTab tab = CustomViewUtil.getTabByLab(n.getFieldlabel());
						XmEntityname et = CustomViewUtil.getEntitynameByET(tab.getName());
						totalfilter += " INNER JOIN "+et.getTablename() +" on "+n.getFieldtabname()+"."+n.getFieldcolname()+"="+cd.getTablename()+"."+cd.getEntityidfield();
					}
					*/
				}
			}
		}else{
			totalfilter +="SELECT count(1) AS count FROM "+en.getTablename() +" where "+en.getTablename()+".deleted = 0 " ;
		}
		return totalfilter+" where 1=1 and "+en.getTablename()+".deleted = 0 "+getFilter(customview, stdfilter, advfilters);
	}

	public String getListFilter(int viewid, XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters,List<CVColumn> cols) {
		String selectall = "";
		String columnstr = "";
		String joinstr = "";
		XmEntityname en = CustomViewUtil.getEntitynameByET(customview.getEntitytype());
		
		if(cols.size()>=1){
			for(int i=0;i<cols.size();i++){
				CVColumn n = cols.get(i);
				XmEntityname ey = CustomViewUtil.getEntitynameByET(n.getEntitytype());
				if(n.getFieldname()!=null){
					if(n.getFieldname().indexOf("assigned_")!=-1){
						if(columnstr!=""){
							columnstr +=",xm_users.user_name";
						}else{
							columnstr +="xm_users.user_name";;
						}

						joinstr +=" INNER JOIN xm_users on "+n.getFieldtabname()+"."+n.getFieldcolname()+"=xm_users.id";
						
					}
					/*
					else if(n.getFieldname().indexOf("_")!=-1){
						XmTab tab = CustomViewUtil.getTabByLab(n.getFieldlabel());
						XmEntityname et = CustomViewUtil.getEntitynameByET(tab.getName());
						if(columnstr!=""){
							columnstr +=","+et.getTablename()+"."+et.getFieldname();
						}else{
							columnstr +=et.getTablename()+"."+et.getFieldname();
						}

						joinstr += " INNER JOIN "+et.getTablename() +" on "+n.getFieldtabname()+"."+n.getFieldcolname()+"="+et.getTablename()+"."+et.getEntityidfield();
						
					}
					*/
					else if(n.getFieldname().indexOf("_")!=-1){
						XmTab tab = CustomViewUtil.getTabByLab(n.getFieldlabel());
						XmEntityname et = CustomViewUtil.getEntitynameByET(tab.getName());
						if(columnstr!=""){
							columnstr +=",( select "+et.getFieldname()+" from "+et.getTablename()+" where "+et.getEntityidfield()+" = "+ey.getTablename()+"."+n.getFieldname()+"  )  as "+et.getFieldname();
						}else{
							columnstr +="( select "+et.getFieldname()+" from "+et.getTablename()+" where "+et.getEntityidfield()+" = "+ey.getTablename()+"."+n.getFieldname()+" )  as  "+et.getFieldname();
						}

						
					}else{
						if(columnstr!=""){
							columnstr +=","+n.getFieldtabname()+"."+n.getFieldcolname()+" ";
						}else{
							columnstr +=n.getFieldtabname()+"."+n.getFieldcolname();
						}
					}
				}
				
				
			}
			
			selectall +="select "+columnstr+" from "+en.getTablename()+" "+joinstr;
		}else{
			selectall +="SELECT "+en.getTablename()+".* FROM "+en.getTablename()+" where 1=1 " ;
		}
		return selectall+" where 1=1 and "+en.getTablename()+".deleted = 0 "+getFilter(customview, stdfilter, advfilters);
	}
	
	
}
