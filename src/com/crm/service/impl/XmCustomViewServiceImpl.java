package com.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.amcharts.ReportData;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.mapper.XmCustomviewMapper;
import com.crm.mapper.util.CvFilter;
import com.crm.model.XmContactdetails;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvstdfilter;
import com.crm.model.XmEntityname;
import com.crm.service.XmContactdetailsService;
import com.crm.service.XmCustomViewService;
import com.crm.util.JsonUtil;

@Service("xmCustomViewService")
public class XmCustomViewServiceImpl implements XmCustomViewService {
	
	CvFilter cvFilter;
	@Resource(name="cvFilter")
	public void setCvFilter(CvFilter cvFilter) {
		this.cvFilter = cvFilter;
	}
	
	XmContactdetailsService xmContactdetailsService;
	@Resource(name="xmContactdetailsService")
    public void setXmContactdetailsService(
			XmContactdetailsService xmContactdetailsService) {
		this.xmContactdetailsService = xmContactdetailsService;
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
		}else if(viewid == -2){ 
			XmCustomview cv = this.xmCustomviewMapper.getDefaultCView(entitytype);
			//先取值默认的，如果不存在，取第一个
			if(cv==null){
				cv = this.xmCustomviewMapper.getFirstCView(entitytype);
			}
			return cv;
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
			List<CVColumn> cols,String customfiter) {
		String totalsql = this.cvFilter.getTotalFilter(viewid,customview,stdfilter,advfilter,cols,customfiter);
		return this.xmCustomviewMapper.getTotalBySql(totalsql);
	}

	@Override
	public List<Map> loadList(int page, int rows, int viewid,
			XmCustomview customview, XmCvstdfilter stdfilter,
			List<XmCvadvfilter> advfilter, List<CVColumn> cols,String customfiter) {
		String listsql = this.cvFilter.getListFilter(viewid,customview,stdfilter,advfilter,cols,customfiter);
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

	@Override
	public List<Object> getChartData(String grouptype,List<CVColumn> cols,String pickfieldtable,String pickfieldname,String pickfieldcolname) {
		
		//用户关联的判断
		String userjoin = "";
		if(cols.size()>0){
			for(int i=0;i<cols.size();i++){
				if(cols.get(i).getFieldname().equals("assigned_user_id")){
					userjoin += " INNER JOIN xm_users on "+cols.get(i).getFieldtabname()+"."+cols.get(i).getFieldcolname()+"=xm_users.id ";
					break;
				}
			}
		}
		
		String resultsql = null;
		if(grouptype.equals("count")){
			resultsql = "SELECT "+pickfieldtable+"."+pickfieldname+",count(*) as totalcountval FROM "+pickfieldtable+" "+userjoin+" WHERE "+pickfieldtable+".deleted = 0 group by "+pickfieldtable+"."+pickfieldname+" ";
		}else{
			ReportData rdata = (ReportData)JsonUtil.getObject4JsonString(grouptype, ReportData.class);
			resultsql = "SELECT "+pickfieldtable+"."+pickfieldname+",sum("+pickfieldtable+"."+rdata.getFieldname()+") as totalcountval FROM "+pickfieldtable+" "+userjoin+" WHERE "+pickfieldtable+".deleted = 0 group by "+pickfieldtable+"."+pickfieldname+"  ";
		}
		
		return xmCustomviewMapper.getChartData(resultsql);
	}

	@Override
	public XmCustomview selectByPrimaryKey(int cvid) {
		return this.xmCustomviewMapper.selectByPrimaryKey(cvid);
	}

	@Override
	public int insert(String sql) {
		return this.xmCustomviewMapper.insertsql(sql);
	}

	@Override
	public Map getObject(int recordid, String entitytype) {
		String sql = this.cvFilter.getObjectSql(recordid,entitytype);
		return this.xmCustomviewMapper.getObject(sql);
	}

	@Override
	public String getFieldValue(XmEntityname et, String mapVal) {
		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		sb.append(et.getFieldname());
		sb.append(" from ");
		sb.append(et.getTablename());
		sb.append(" where ");
		sb.append(et.getEntityidfield());
		sb.append(" = ");
		sb.append(mapVal);
		return this.xmCustomviewMapper.getFieldValue(sb.toString());
	}

	@Override
	public int update(String sql) {
		return this.xmCustomviewMapper.update(sql);
	}

	@Override
	public String getModuleVal(String module, String val,String column) {
		String table = "";
		String valfield = "";
		String idfield = "";
		String sql = "";
		if(module.equals("Campaigns")){
			if(column.equals("smownerid")){
				table = "xm_users";
				valfield = "last_name";
				idfield = "id";
				sql += "select "+valfield+" from "+table +" where "+idfield+" = "+val;
				val = this.xmCustomviewMapper.getModuleVal(sql);
			}else if(column.equals("product_id")){
				table = "xm_products";
				valfield = "productname";
				idfield = "productid";
				sql += "select "+valfield+" from "+table +" where "+idfield+" = "+val;
				val = this.xmCustomviewMapper.getModuleVal(sql);
			}
		}
		return val;
	}

	@Override
	public int getAccountByContactid(String mv) {
		String id = this.xmCustomviewMapper.getAccountByContactid(mv);
		return id==null?0:Integer.parseInt(id);
	}

	@Override
	public List<XmContactdetails> getContactdetailsByAccountid(int accountid) {
		return this.xmContactdetailsService.getContactdetailsByAccountid(accountid+"");
	}

}
