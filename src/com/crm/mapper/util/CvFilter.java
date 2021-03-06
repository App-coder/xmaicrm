package com.crm.mapper.util;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.crm.bean.crm.SearchField;
import com.crm.bean.crm.customview.AdvSearch;
import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.bean.easyui.expand.FilterColumn;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.mapper.XmCvadvfilterMapper;
import com.crm.mapper.XmCvstdfilterMapper;
import com.crm.mapper.XmEntitynameMapper;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.model.XmEntityname;
import com.crm.model.XmTab;
import com.crm.util.DateUtil;
import com.crm.util.JsonUtil;
import com.crm.util.crm.CustomViewUtil;
import com.sun.xml.internal.stream.Entity;

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
	
	XmEntitynameMapper xmEntitynameMapper;
	@Resource(name="xmEntitynameMapper")
	public void setXmEntitynameMapper(XmEntitynameMapper xmEntitynameMapper) {
		this.xmEntitynameMapper = xmEntitynameMapper;
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
	
	public String getJudge(String reg,String val){
		String c = "";
		if(reg.equals("e")){
			c = " = '"+val+"'";;
		}else if(reg.equals("n")){
			c = " != '"+val+"'";;
		}else if(reg.equals("s")){
			c = " like '"+val+"%'";
		}else if(reg.equals("c")){
			c = " like "+"'%"+val+"%'";
		}else if(reg.equals("k")){
			c = " not like "+"'%"+val+"%'";
		}else if(reg.equals("l")){
			c = " < '"+val+"'";;
		}else if(reg.equals("g")){
			c = " > '"+val+"'";;
		}else if(reg.equals("m")){
			c = " <= '"+val+"'";;
		}else if(reg.equals("h")){
			c = " >= '"+val+"'";;
		}else if(reg.equals("")){
			
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
					filter +=" and "+en.getTablename() +"."+std.getField()+">'"+DateUtil.format(stdfilter.getStartdate(),DateUtil.C_DATE_PATTON_DEFAULT)+"' and "+en.getTablename() +"."+std.getField()+"<'"+DateUtil.format(stdfilter.getEnddate(),DateUtil.C_DATE_PATTON_DEFAULT)+"'";
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
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters,List<CVColumn> cols,String customfiter){
		String totalfilter = "";
		XmEntityname en = CustomViewUtil.getEntitynameByET(customview.getEntitytype());
		if(cols.size()>=1){
			totalfilter +="SELECT count(1) AS count FROM "+en.getTablename()+"" ;
			for(int i=0;i<cols.size();i++){
				CVColumn n = cols.get(i);
				XmEntityname cd = CustomViewUtil.getEntitynameByET(n.getEntitytype());
				if(n.getFieldname()!=null){
					if(n.getFieldname().indexOf("assigned_")!=-1){
						totalfilter +=" INNER JOIN xm_users on "+n.getFieldtabname()+"."+n.getFieldcolname()+"=xm_users.id";
					}
				}
			}
			totalfilter +=" where 1=1  ";
		}else{
			totalfilter +="SELECT count(1) AS count FROM "+en.getTablename() +" where 1=1 and "+en.getTablename()+".deleted = 0 " ;
		}
		return totalfilter+" and "+en.getTablename()+".deleted = 0 "+getFilter(customview, stdfilter, advfilters)+customfiter;
	}

	public String getListFilter(int viewid, XmCustomview customview,
			XmCvstdfilter stdfilter, List<XmCvadvfilter> advfilters,List<CVColumn> cols,String customfiter) {
		String order = "";
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
							columnstr +=",xm_users.last_name";
						}else{
							columnstr +="xm_users.last_name";;
						}

						joinstr +=" INNER JOIN xm_users on "+n.getFieldtabname()+"."+n.getFieldcolname()+"=xm_users.id";
						
					}else if(n.getFieldname().indexOf("_")!=-1 && n.getFieldname().split("_")[1].equals("id")){ 
						
						XmEntityname et  =  CustomViewUtil.getEntitynameByET(n.getEntitytype());
						XmEntityname eref = null;
						
						eref = CustomViewUtil.getEntitynameByEID(n.getFieldname().replace("_", ""));
						columnstr +=Join(columnstr)+"( select "+eref.getFieldname()+" from "+eref.getTablename()+" as tmp where tmp."+eref.getEntityidfield()+" = "+ey.getTablename()+"."+n.getFieldcolname()+" )  as "+n.getFieldcolname();
						
					}else{
						
						columnstr = CustomJoin(columnstr,n);
						
					}
				}
				
				
			}
			columnstr = en.getTablename()+"."+en.getEntityidfield()+","+columnstr;
			selectall +="select "+columnstr+" from "+en.getTablename()+" "+joinstr+"  ";
		}else{
			selectall +="SELECT "+en.getTablename()+".* FROM "+en.getTablename()+" " ;
		}
		
		order +="order by "+en.getTablename()+"." + en.getEntityidfield()+" desc";
		
		return selectall+" where 1=1 and "+en.getTablename()+".deleted = 0 "+getFilter(customview, stdfilter, advfilters) + customfiter +order;
	}
	
	private String CustomJoin(String columnstr, CVColumn n) {
		columnstr +=Join(columnstr)+n.getFieldtabname()+"."+n.getFieldcolname()+" ";
		return columnstr;
	}

	public String Join(String str){
		if(str!=null && !str.equals("")){
			return ",";
		}
		return "";
	}

	public String getObjectSql(int recordid, String entitytype) {
		StringBuffer sb = new StringBuffer();
		XmEntityname en = CustomViewUtil.getEntitynameByET(entitytype);
		sb.append("SELECT "+en.getTablename()+".* FROM "+en.getTablename()+" ");
		sb.append("where "+en.getTablename()+"."+en.getEntityidfield());
		sb.append(" = ");
		sb.append(recordid);
		return sb.toString();
	}

	public String getBasicSearchString(String entitytype,
			String basicsearchfield, String basicsearchvalue) {
		
		String search = "";
		XmEntityname en = CustomViewUtil.getEntitynameByET(entitytype);
		
		if(basicsearchfield.indexOf("assigned_")!=-1){
			search = " and xm_users.last_name like '%"+basicsearchvalue+"%'";
		}else if(basicsearchfield.indexOf("_")!=-1 && basicsearchfield.split("_")[1].equals("id")){
			XmEntityname relEntity = CustomViewUtil.getEntitynameByEID(basicsearchfield.replace("_", ""));
			search = " and "+relEntity.getTablename()+"."+relEntity.getFieldname()+" like "+"'%"+basicsearchvalue+"%' ";
		}else{
			if("last_name".equals(basicsearchfield)){
				search = " and xm_users."+basicsearchfield+" like "+"'%"+basicsearchvalue+"%' ";
			}else{
				search = " and "+en.getTablename()+"."+basicsearchfield+" like "+"'%"+basicsearchvalue+"%' ";
			}
		}
		
		return search;
	}

	public String getAdvSearchFilterString(String entitytype,
			String advfilters, String matchMeth) {
		
		List<FilterColumn> searchs = JsonUtil.getList4Json(advfilters, FilterColumn.class);
		XmEntityname en = CustomViewUtil.getEntitynameByET(entitytype);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<searchs.size();i++){
			if(searchs.get(i).getField().indexOf("assigned_")!=-1){
				sb.append(" "+matchMeth+" ");
				sb.append(" xm_users.last_name ");
				sb.append(getJudge(searchs.get(i).getReg(),searchs.get(i).getValue()));
				sb.append(" ");
			}else if(searchs.get(i).getField().indexOf("_")!=-1 && searchs.get(i).getField().split("_")[1].equals("id")){
				XmEntityname relEntity = CustomViewUtil.getEntitynameByEID(searchs.get(i).getField().replace("_", ""));
				sb.append(" "+matchMeth+" ");
				sb.append(relEntity.getTablename()+"."+relEntity.getFieldname());
				sb.append(getJudge(searchs.get(i).getReg(),searchs.get(i).getValue()));
				sb.append(" ");
			}else{
				if("last_name".equals(searchs.get(i).getField())){
					sb.append(" "+matchMeth+" ");
					sb.append(" xm_users.last_name ");
					sb.append(getJudge(searchs.get(i).getReg(),searchs.get(i).getValue()));
					sb.append(" ");
				}else{
					sb.append(" "+matchMeth+" ");
					sb.append(en.getTablename()+"."+searchs.get(i).getField());
					sb.append(getJudge(searchs.get(i).getReg(),searchs.get(i).getValue()));
					sb.append(" ");
				}
			}
		}
		
		if(matchMeth.equals("or")){
			return "and ("+sb.toString().replaceFirst("or", "")+")";
		}
		
		return sb.toString();
	}
	
}
