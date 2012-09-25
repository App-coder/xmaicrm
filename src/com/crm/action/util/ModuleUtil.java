package com.crm.action.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.crm.action.BaseController;
import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.model.XmCustomview;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.model.XmTab;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.service.XmFieldService;
import com.crm.util.JsonUtil;
import com.crm.util.crm.CustomViewUtil;

/**
 * 
 * 对于不同的模块需要的基本工具
 * 
 * User: zhujun
 * Date: 2012-8-13
 * Time: 下午3:30:36
 */
@Component("moduleUtil")
public class ModuleUtil extends BaseController{
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	XmCvcolumnlistService xmCvcolumnlistService;
	@Resource(name="xmCvcolumnlistService")
	public void setXmCvcolumnlistService(XmCvcolumnlistService xmCvcolumnlistService) {
		this.xmCvcolumnlistService = xmCvcolumnlistService;
	}
	
	XmFieldService xmFieldService;
	@Resource(name="xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}
	
	/**
	 * 设置默认视图的默认视图column,底部报表
	 * 
	 * @param modelMap
	 * @param tabname 表名
	 */
	public void setViewProp(ModelMap modelMap,String tabname){
		//得到默认的view
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(tabname,-1);
		try {
			List<CVColumn> cols = this.xmCvcolumnlistService.getColumns(customview);
			List<Column> reset = new ArrayList<Column>();
			if(cols!=null){
				for(int i=0;i<cols.size();i++){
					CVColumn n = cols.get(i);
					Column ne = new Column();
					if(n!=null){
						if(n.getFieldname()!=null){
							if(n.getFieldname().indexOf("assigned_")!=-1){
								ne.setField("user_name");
							}else if(n.getFieldname().indexOf("_")!=-1){
								XmTab tab = CustomViewUtil.getTabByLab(n.getFieldlabel());
								XmEntityname et = CustomViewUtil.getEntitynameByET(tab.getName());
								ne.setField(et.getFieldname());
							}else{
								ne.setField(n.getFieldcolname());
							}
							ne.setTitle(n.getTitle());
							ne.setResizable(false);
							reset.add(ne);
						}
					}
				}
			}
			modelMap.addAttribute("dview",arrayToJson(reset));
		} catch (net.sf.json.JSONException e) {
			modelMap.addAttribute("dview",null);
		}
		modelMap.addAttribute("customview",customview);
		
		//配置customview,这个是视图的列表
		List<XmCustomview> views = this.xmCustomViewService.queryByEntityType(tabname);
		modelMap.addAttribute("views",views);
		
		//底部报表
		List<XmField> repfields = this.xmFieldService.getReportField(tabname);
		if(!customview.getEntitytype().equals("Products")&&!customview.getEntitytype().equals("Faq")&&!customview.getEntitytype().equals("PriceBooks")){
			XmField uf = new XmField();
			uf.setFieldname("assign_user_id");
			uf.setTablename("xm_users");
			uf.setColumnname("user_name");
			uf.setFieldlabel("负责人");
			repfields.add(uf);
		}
		modelMap.addAttribute("repfields",repfields);
	}
}
