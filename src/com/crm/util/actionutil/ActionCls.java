package com.crm.util.actionutil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.alibaba.fastjson.JSON;
import com.crm.model.XmBlocks;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.model.XmParenttab;
import com.crm.model.XmProducts;
import com.crm.model.XmRelatedlists;
import com.crm.model.XmTab;
import com.crm.model.XmUsers;
import com.crm.service.XmBlocksService;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmEntitynameService;
import com.crm.service.XmFieldService;
import com.crm.service.XmPicklistService;
import com.crm.service.XmSequenceService;
import com.crm.service.module.XmProductsService;
import com.crm.service.module.XmRelatedlistsServie;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ArrayUtil;
import com.crm.util.CacheUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.HtmlUtil;
import com.crm.util.crm.CustomViewUtil;

@Component("actionCls")
public class ActionCls {
	
	XmPicklistService xmPicklistService;
	@Resource(name = "xmPicklistService")
	public void setXmPicklistService(XmPicklistService xmPicklistService) {
		this.xmPicklistService = xmPicklistService;
	}

	XmEntitynameService xmEntitynameService;
	@Resource(name = "xmEntitynameService")
	public void setXmEntitynameService(XmEntitynameService xmEntitynameService) {
		this.xmEntitynameService = xmEntitynameService;
	}

	XmUsersService xmUsersService;
	@Resource(name = "xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}

	XmBlocksService xmBlocksService;
	@Resource(name = "xmBlocksService")
	public void setXmBlocksService(XmBlocksService xmBlocksService) {
		this.xmBlocksService = xmBlocksService;
	}

	XmFieldService xmFieldService;
	@Resource(name = "xmFieldService")
	public void setXmFieldService(XmFieldService xmFieldService) {
		this.xmFieldService = xmFieldService;
	}
	
	XmCustomViewService xmCustomViewService;
	@Resource(name="xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}
	
	XmRelatedlistsServie xmRelatedlistsServie;
	@Resource(name="xmRelatedlistsServie")
	public void setXmRelatedlistsServie(XmRelatedlistsServie xmRelatedlistsServie) {
		this.xmRelatedlistsServie = xmRelatedlistsServie;
	}
	

	public void showEdit(int ptb, String module, ModelMap modelmap, int recordid) {
		Map obj = null;
		modelmap.addAttribute("recordid",recordid);
		if(recordid!=0){
			obj = this.xmCustomViewService.getObject(recordid,module);
			modelmap.addAttribute("record",obj);
		}
		
		XmTab tab = CustomViewUtil.getTabByName(module);
		modelmap.addAttribute("tab",tab );

		HashMap<Integer, XmParenttab> parenttabs = (HashMap<Integer, XmParenttab>) CacheUtil
				.getFromCache(Constant.PARENTTAB);
		XmParenttab parenttab = parenttabs.get(ptb);
		modelmap.addAttribute("ptb", parenttab);
		
		// 初始化编辑窗口
		XmEntityname entity = this.xmEntitynameService.getEntityByModule(module);
		modelmap.addAttribute("entity", entity);

		// 得到block，
		List<XmBlocks> blocks = this.xmBlocksService.getFieldBlocksByTabId(entity
				.getTabid());

		List<Object> blockArray = new ArrayList<Object>();
		for (int i = 0; i < blocks.size(); i++) {
			blockArray.add(blocks.get(i).getBlockid());
		}
		String blockstr = ArrayUtil.arrayToJoinStr(blockArray, ",", true);

		List<XmField> fields = this.xmFieldService.getEditFields(
				entity.getTabid(), blockstr);
		Set setblock = new HashSet();

		if (fields.size() > 0) {
			for (int i = 0; i < fields.size(); i++) {
				fields.get(i).setFieldHtml(
						HtmlUtil.getFieldHtml(fields.get(i),
								this.xmPicklistService, this.xmUsersService,obj,this.xmCustomViewService));
				setblock.add(fields.get(i).getBlock());
			}
		}
//		modelmap.addAttribute("fields", fields);

		// 整理后的block modelmap.addAttribute("blocks",blocks);
		List<XmBlocks> arrangeBlock = new ArrayList<XmBlocks>();
		for (int i = 0; i < blocks.size(); i++) {
			if (setblock.contains(blocks.get(i).getBlockid())) {
				List<XmField> fs = new ArrayList<XmField>();
				//添加对应的fields
				if (fields.size() > 0) {
					for (int j = 0; j < fields.size(); j++) {
						if(fields.get(j).getBlock().equals(blocks.get(i).getBlockid())){
							fs.add(fields.get(j));
						}
					}
				}
				blocks.get(i).setFields(fs);
				arrangeBlock.add(blocks.get(i));
			}
		}
		modelmap.addAttribute("blocks", arrangeBlock);

	}

	public Boolean add(HttpServletRequest request,int insertid,int smownerid) {
		
		String module = request.getParameter("edit_module");
		XmEntityname entity = this.xmEntitynameService.getEntityByModule(module);
		int tabid  = Integer.parseInt(request.getParameter("edit_tabid"));
		
		List<XmBlocks> blocks = this.xmBlocksService.getFieldBlocksByTabId(tabid);

		List<Object> blockArray = new ArrayList<Object>();
		for (int i = 0; i < blocks.size(); i++) {
			blockArray.add(blocks.get(i).getBlockid());
		}
		String blockstr = ArrayUtil.arrayToJoinStr(blockArray, ",", true);

		List<XmField> fields = this.xmFieldService.getEditFields(tabid, blockstr);
		
		StringBuffer sb = new StringBuffer();
		sb.append("insert into ");
		sb.append(entity.getTablename());
		
		List<Object> colobjs = new ArrayList<Object>();
		StringBuffer valobjs = new StringBuffer();
		
		for(int i=0;i<fields.size();i++){
			
			if(request.getParameter(fields.get(i).getColumnname())!=null&&request.getParameter(fields.get(i).getColumnname())!=""){
				colobjs.add(fields.get(i).getColumnname());
				if(!valobjs.toString().isEmpty()){
					valobjs.append(",");
				}
				valobjs.append(CustomViewUtil.getColumnVal(fields.get(i).getTypeofdata(),request.getParameter(fields.get(i).getColumnname())));
			}
			
		}
		
		colobjs.add(entity.getEntityidfield());
		
		sb.append("(");
		sb.append(ArrayUtil.arrayToColumns(colobjs));
		//附加的数据录入
		//营销活动
		if(module.equals("Campaigns")){
			sb.append(",");
			sb.append("smownerid");
			sb.append(",");
			sb.append("createdtime");
			sb.append(",");
			sb.append("modifiedtime");
		}else if(module.equals("Events")){
			sb.append(",");
			sb.append("time_start");
			sb.append(",");
			sb.append("time_end");
			sb.append(",");
			sb.append("smcreatorid");
			sb.append(",");
			sb.append("createdtime");
			sb.append(",");
			sb.append("modifiedtime");
		}
		
		
		sb.append(")");
		sb.append(" values ");
		sb.append("(");
		sb.append(valobjs.toString());
		sb.append(",");
		sb.append(insertid);
		//附加的数据录入
		if(module.equals("Campaigns")){
			sb.append(",");
			sb.append(smownerid);
			sb.append(",");
			sb.append("\'"+DateUtil.format(new Date(), DateUtil.C_TIME_PATTON_DEFAULT)+"\'");
			sb.append(",");
			sb.append("\'"+DateUtil.format(new Date(), DateUtil.C_TIME_PATTON_DEFAULT)+"\'");
		}else if(module.equals("Events")){
			
			Date start = DateUtil.parseDateTime(request.getParameter("date_start"));
			Date end = DateUtil.parseDateTime(request.getParameter("due_date"));
			String timestart = DateUtil.format(start, DateUtil.C_TIME_PATTON_HHMM);
			String timeend = DateUtil.format(end, DateUtil.C_TIME_PATTON_HHMM);
			
			sb.append(",");
			sb.append("'"+timestart+"'");
			sb.append(",");
			sb.append("'"+timeend+"'");
			sb.append(",");
			sb.append(smownerid);
			sb.append(",");
			sb.append("\'"+DateUtil.format(new Date(), DateUtil.C_TIME_PATTON_DEFAULT)+"\'");
			sb.append(",");
			sb.append("\'"+DateUtil.format(new Date(), DateUtil.C_TIME_PATTON_DEFAULT)+"\'");
		}
		sb.append(")");
		
		int affectrows = this.xmCustomViewService.insert(sb.toString());
		
		if(affectrows == 1){
			return true;
		}
		return false;
	}


	//编辑操作
	public Boolean update(HttpServletRequest request, int recordid) {
		String module = request.getParameter("edit_module");
		XmEntityname entity = this.xmEntitynameService.getEntityByModule(module);
		int tabid  = Integer.parseInt(request.getParameter("edit_tabid"));
		
		List<XmBlocks> blocks = this.xmBlocksService.getFieldBlocksByTabId(tabid);

		List<Object> blockArray = new ArrayList<Object>();
		for (int i = 0; i < blocks.size(); i++) {
			blockArray.add(blocks.get(i).getBlockid());
		}
		String blockstr = ArrayUtil.arrayToJoinStr(blockArray, ",", true);

		List<XmField> fields = this.xmFieldService.getEditFields(tabid, blockstr);
		
		StringBuffer sb = new StringBuffer();
		sb.append("update ");
		sb.append(entity.getTablename());
		sb.append(" set ");
		
		StringBuffer cols = new StringBuffer();
		for(int i=0;i<fields.size();i++){
			if(request.getParameter(fields.get(i).getFieldname())!=null&&request.getParameter(fields.get(i).getFieldname())!=""){
				
				if(!cols.toString().isEmpty()){
					cols.append(",");
				}
				cols.append(fields.get(i).getFieldname());
				cols.append(" = ");
				cols.append(CustomViewUtil.getColumnVal(fields.get(i).getTypeofdata(),request.getParameter(fields.get(i).getFieldname())));
				cols.append(" ");
				
			}
			
		}
		
		sb.append(cols.toString());
		sb.append(" where ");
		sb.append(entity.getEntityidfield());
		sb.append(" = ");
		sb.append(recordid);
		
		int affectrows = this.xmCustomViewService.update(sb.toString());
		
		if(affectrows == 1){
			return true;
		}
		return false;
	}

	public void showView(int ptb, String module, ModelMap modelmap, int recordid,XmTab tab) {
		Map obj = null;
		if(recordid!=0){
			modelmap.addAttribute("recordid",recordid);
			obj = this.xmCustomViewService.getObject(recordid,module);
			modelmap.addAttribute("record",obj);
		}
		
		modelmap.addAttribute("tab",tab );

		HashMap<Integer, XmParenttab> parenttabs = (HashMap<Integer, XmParenttab>) CacheUtil
				.getFromCache(Constant.PARENTTAB);
		XmParenttab parenttab = parenttabs.get(ptb);
		modelmap.addAttribute("ptb", parenttab);
		
		// 初始化编辑窗口
		XmEntityname entity = this.xmEntitynameService.getEntityByModule(module);
		modelmap.addAttribute("entity", entity);

		// 得到block，
		List<XmBlocks> blocks = this.xmBlocksService.getFieldBlocksByTabId(entity
				.getTabid());

		List<Object> blockArray = new ArrayList<Object>();
		for (int i = 0; i < blocks.size(); i++) {
			blockArray.add(blocks.get(i).getBlockid());
		}
		String blockstr = ArrayUtil.arrayToJoinStr(blockArray, ",", true);

		List<XmField> fields = this.xmFieldService.getDisplayFields(
				entity.getTabid(), blockstr);
		Set setblock = new HashSet();

		if (fields.size() > 0) {
			for (int i = 0; i < fields.size(); i++) {
				//根据模块进行字段的特殊处理，主要用于关联字段值的设置
				String val = HtmlUtil.getMapVal(obj,fields.get(i).getColumnname());
				val = resetVal(module,fields.get(i).getColumnname(),val);
				fields.get(i).setFieldHtml(val);
				setblock.add(fields.get(i).getBlock());
			}
		}

		// 整理后的block modelmap.addAttribute("blocks",blocks);
		List<XmBlocks> arrangeBlock = new ArrayList<XmBlocks>();
		for (int i = 0; i < blocks.size(); i++) {
			if (setblock.contains(blocks.get(i).getBlockid())) {
				List<XmField> fs = new ArrayList<XmField>();
				//添加对应的fields
				if (fields.size() > 0) {
					for (int j = 0; j < fields.size(); j++) {
						if(fields.get(j).getBlock().equals(blocks.get(i).getBlockid())){
							fs.add(fields.get(j));
						}
					}
				}
				blocks.get(i).setFields(fs);
				arrangeBlock.add(blocks.get(i));
			}
		}
		modelmap.addAttribute("blocks", arrangeBlock);
	}

	/**
	 * @param module 模块
	 * @param columnname 字段对应COLUMN
	 * @param val 字段的值
	 * @return
	 */
	private String resetVal(String module, String columnname, String val) {
		if(val==null||val==""){
			return "";
		}
		return this.xmCustomViewService.getModuleVal(module,val,columnname);
	}

	/**
	 * 
	 * 相关信息
	 * 
	 * @param tab 模块
	 * @param modelmap
	 */
	public void setRelatedlist(XmTab tab,ModelMap modelmap){
		
		List<XmRelatedlists> relatedlists = this.xmRelatedlistsServie.getRelatedlistByTabid(tab.getTabid());
		modelmap.addAttribute("relatedlists",relatedlists);
		
		List<String> relatedstr = new ArrayList<String>();
		for(int i=0;i<relatedlists.size();i++){
			relatedstr.add(relatedlists.get(i).getName());
		}
		modelmap.addAttribute("relatedstr",JSON.toJSON(relatedstr));
		
	}
	
}
