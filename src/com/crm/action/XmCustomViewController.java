package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ListBean;
import com.crm.bean.easyui.expand.CVColumn;
import com.crm.bean.html.TimeOptions;
import com.crm.model.XmBlocks;
import com.crm.model.XmCustomview;
import com.crm.model.XmCvadvfilter;
import com.crm.model.XmCvcolumnlist;
import com.crm.model.XmCvstdfilter;
import com.crm.model.XmEntityname;
import com.crm.model.XmField;
import com.crm.model.XmTab;
import com.crm.service.XmBlocksService;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvadvfilterService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.service.XmCvstdfilterService;
import com.crm.service.XmFieldService;
import com.crm.service.XmSequenceService;
import com.crm.service.XmTabService;
import com.crm.util.DateUtil;
import com.crm.util.HtmlUtil;
import com.crm.util.crm.CustomViewUtil;

@Controller
@RequestMapping(value = "customview")
public class XmCustomViewController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name="moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}

	XmCustomViewService xmCustomViewService;
	@Resource(name = "xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}

	XmCvcolumnlistService xmCvcolumnlistService;
	@Resource(name = "xmCvcolumnlistService")
	public void setXmCvcolumnlistService(
			XmCvcolumnlistService xmCvcolumnlistService) {
		this.xmCvcolumnlistService = xmCvcolumnlistService;
	}

	XmCvadvfilterService xmCvadvfilterService;
	@Resource(name = "xmCvadvfilterService")
	public void setXmCvadvfilterService(
			XmCvadvfilterService xmCvadvfilterService) {
		this.xmCvadvfilterService = xmCvadvfilterService;
	}

	XmCvstdfilterService xmCvstdfilterService;
	@Resource(name = "xmCvstdfilterService")
	public void setXmCvstdfilterService(
			XmCvstdfilterService xmCvstdfilterService) {
		this.xmCvstdfilterService = xmCvstdfilterService;
	}

	XmTabService xmTabService;
	@Resource(name = "xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
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
	
	XmSequenceService xmSequenceService;
	@Resource(name="xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}

	@RequestMapping(value = "/queryByEntityType", method = RequestMethod.GET)
	public String getViewList(@RequestParam("entitytype") String entitytype) {
		List<XmCustomview> list = this.xmCustomViewService
				.queryByEntityType(entitytype);
		return this.arrayToJson(list);
	}

	/**
	 * 
	 * 取得COLUMN的JSON字符串
	 * 
	 * @param entitytype
	 *            实体类型
	 * @param viewid
	 *            视图ID
	 * @return
	 */
	@RequestMapping(value = "/getViewColumn", method = RequestMethod.GET)
	@ResponseBody
	public String getViewColumn(String entitytype, int viewid) {

		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(
				entitytype, viewid);
		List<CVColumn> cols = this.xmCvcolumnlistService
				.getViewColumn(customview);

		return arrayToJson(cols);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@Param("entitytype") String entitytype,
			ModelMap modelmap) {

		XmTab tab = this.xmTabService.getTabByName(entitytype);
		modelmap.addAttribute("tab",tab);
		List<XmBlocks> blocks = this.xmBlocksService.getBlocksByTabId(tab
				.getTabid());
		List<List<XmField>> fieldsList = new ArrayList<List<XmField>>();
		for (int i = 0; i < blocks.size(); i++) {
			XmBlocks b = blocks.get(i);
			List<XmField> fds = this.xmFieldService.getFieldByBlockAndTab(
					tab.getTabid(), b.getBlockid());
			fieldsList.add(fds);
		}

		modelmap.addAttribute("optionstr",
				HtmlUtil.getMultSelect(blocks, fieldsList,entitytype));
		modelmap.addAttribute("colloptionstr",
				HtmlUtil.getCollectSelect(blocks, fieldsList));
		modelmap.addAttribute("filter", HtmlUtil.getFilter());
		modelmap.addAttribute("entitytype", entitytype);

		modelmap.addAttribute("timeoptions", new TimeOptions());

		// 选择查询字段
		List<XmField> searchFields = this.xmFieldService.getSearchFields(tab
				.getTabid());
		modelmap.addAttribute("searchfields",
				HtmlUtil.getSearchFields(searchFields));

		return "public/customview";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@Param("entitytype") String entitytype) {

		List<XmCustomview> list = this.xmCustomViewService
				.loadCViewByEntitytype(entitytype);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());

		return objToJson(bean);
	}

	@RequestMapping(value = "/load", method = RequestMethod.POST)
	@ResponseBody
	public String load(@Param("entitytype") String entitytype,int page,int rows) {
		List<XmCustomview> list = this.xmCustomViewService.loadList(entitytype,page,rows);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		return objToJson(bean);
	}

	@RequestMapping(value = "/setDef", method = RequestMethod.POST)
	@ResponseBody
	public String setDef(@Param("cvid") int cvid,
			@Param("entitytype") String entitytype) {
		boolean result = this.xmCustomViewService.setDef(cvid, entitytype);
		Message msg = new Message();
		if (result) {
			msg.setMessage("默认设置成功！");
			msg.setType(true);
		} else {
			msg.setMessage("默认设置失败！");
			msg.setType(true);
		}
		return objToJson(msg);
	}

	@RequestMapping(value = "/deleteCv", method = RequestMethod.POST)
	@ResponseBody
	public String deleteCv(@Param("cvid") int cvid) {
		boolean result = this.xmCustomViewService.deleteCv(cvid);
		this.xmCvcolumnlistService.deleteCv(cvid);
		this.xmCvadvfilterService.deleteCv(cvid);
		this.xmCvstdfilterService.deleteCv(cvid);

		Message msg = new Message();
		if (result) {
			msg.setMessage("视图删除成功！");
			msg.setType(true);
		} else {
			msg.setMessage("视图删除失败！");
			msg.setType(true);
		}
		return objToJson(msg);
	}
	

	@RequestMapping(value = "/editView", method = RequestMethod.POST)
	@ResponseBody
	public String editView(String action, String advfiltercol_1,
			String advfiltercol_2, String advfiltercol_3,
			String advfiltercol_4, String advfiltercol_5, String column_1,
			String column_2, String column_3, String column_4, String column_5,
			String column_6, String column_7, String column_8, String column_9,
			String column_collect, String column_stdfilter,
			String comparator_1, String comparator_2, String comparator_3,
			String comparator_4, String comparator_5, String enddate,
			String fv_1, String fv_2, String fv_3, String fv_4, String fv_5,
			Integer id, String startdate, String stddatefilter, String viewname,
			String entitytype,Integer setdefault,Integer setmetrics,String setpublic,Integer ispublic) {
		
		if(action.equals("update")){
			//编辑
			XmCustomview cv = new XmCustomview();
			
			//设置view
			cv.setCvid(id);
			cv.setViewname(viewname);
			cv.setCollectcolumn(column_collect);
			cv.setEntitytype(entitytype);
			cv.setSetdefault(setdefault);
			cv.setSetmetrics(setmetrics);
			
			if(ispublic==0){
				//角色，或，0
				cv.setSetpublic("0");
			}else{
				//设置roles
				cv.setSetpublic(setpublic);
			}
			
			this.xmCustomViewService.update(cv);
			
			//删除column
			this.xmCvcolumnlistService.deleteCvColumnlistByCvid(id);
			
			//1.设置column 2.标准条件 ，3.高级条件
			if(!"".equals(column_1)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(0);
				col.setColumnname(column_1);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_2)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(1);
				col.setColumnname(column_2);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_3)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(2);
				col.setColumnname(column_3);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_4)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(3);
				col.setColumnname(column_4);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_5)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(4);
				col.setColumnname(column_5);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_6)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(5);
				col.setColumnname(column_6);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_7)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(6);
				col.setColumnname(column_7);
				this.xmCvcolumnlistService.insert(col);
			}

			
			this.xmCvstdfilterService.deleteCv(id);
			//标准条件
			XmCvstdfilter stdfilter = new XmCvstdfilter();
			stdfilter.setCvid(id);
			stdfilter.setColumnname(column_stdfilter);
			stdfilter.setEnddate(DateUtil.parseDate(enddate));
			stdfilter.setStartdate(DateUtil.parseDate(startdate));
			stdfilter.setStdfilter(stddatefilter);
			this.xmCvstdfilterService.insert(stdfilter);
			
			
			this.xmCvadvfilterService.deleteCv(id);
			//高级条件
			if(!"".equals(advfiltercol_1)&&!"".equals(comparator_1)&&!"".equals(fv_1)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setColumnname(advfiltercol_1);
				advfilter.setComparator(comparator_1);
				advfilter.setCvid(id);
				advfilter.setValue(fv_1);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_2)&&!"".equals(comparator_2)&&!"".equals(fv_2)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setColumnname(advfiltercol_2);
				advfilter.setComparator(comparator_2);
				advfilter.setCvid(id);
				advfilter.setValue(fv_2);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_3)&&!"".equals(comparator_3)&&!"".equals(fv_3)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setColumnname(advfiltercol_3);
				advfilter.setComparator(comparator_3);
				advfilter.setCvid(id);
				advfilter.setValue(fv_3);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_4)&&!"".equals(comparator_4)&&!"".equals(fv_4)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setColumnname(advfiltercol_4);
				advfilter.setComparator(comparator_4);
				advfilter.setCvid(id);
				advfilter.setValue(fv_4);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_5)&&!"".equals(comparator_5)&&!"".equals(fv_5)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setColumnname(advfiltercol_5);
				advfilter.setComparator(comparator_5);
				advfilter.setCvid(id);
				advfilter.setValue(fv_5);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(setdefault == 1){
				this.xmCustomViewService.setDef(id, entitytype);
			}
			
		}else{
			//添加
			Integer keyid = this.xmSequenceService.getSequenceId("customview");
			
			XmCustomview cv = new XmCustomview();
			
			//设置view
			cv.setViewname(viewname);
			cv.setCollectcolumn(column_collect);
			cv.setEntitytype(entitytype);
			cv.setSetdefault(setdefault);
			cv.setSetmetrics(setmetrics);
			//角色，或，0
			cv.setSetpublic(setpublic);
			cv.setCvid(keyid);
			
			this.xmCustomViewService.insert(cv);
			
			//1.设置column 2.标准条件 ，3.高级条件
			if(!"".equals(column_1)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(0);
				col.setColumnname(column_1);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_2)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(1);
				col.setColumnname(column_2);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_3)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(2);
				col.setColumnname(column_3);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_4)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(3);
				col.setColumnname(column_4);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_5)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(4);
				col.setColumnname(column_5);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_6)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(5);
				col.setColumnname(column_6);
				this.xmCvcolumnlistService.insert(col);
			}
			
			if(!"".equals(column_7)){
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(6);
				col.setColumnname(column_7);
				this.xmCvcolumnlistService.insert(col);
			}

			//标准条件
			XmCvstdfilter stdfilter = new XmCvstdfilter();
			stdfilter.setCvid(keyid);
			stdfilter.setColumnname(column_stdfilter);
			stdfilter.setEnddate(DateUtil.parseDate(enddate));
			stdfilter.setStartdate(DateUtil.parseDate(startdate));
			stdfilter.setStdfilter(stddatefilter);
			this.xmCvstdfilterService.insert(stdfilter);
			
			//高级条件
			if(!"".equals(advfiltercol_1)&&!"".equals(comparator_1)&&!"".equals(fv_1)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setColumnname(advfiltercol_1);
				advfilter.setComparator(comparator_1);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_1);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_2)&&!"".equals(comparator_2)&&!"".equals(fv_2)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setColumnname(advfiltercol_2);
				advfilter.setComparator(comparator_2);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_2);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_3)&&!"".equals(comparator_3)&&!"".equals(fv_3)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setColumnname(advfiltercol_3);
				advfilter.setComparator(comparator_3);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_3);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_4)&&!"".equals(comparator_4)&&!"".equals(fv_4)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setColumnname(advfiltercol_4);
				advfilter.setComparator(comparator_4);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_4);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(!"".equals(advfiltercol_5)&&!"".equals(comparator_5)&&!"".equals(fv_5)){
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setColumnname(advfiltercol_5);
				advfilter.setComparator(comparator_5);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_5);
				this.xmCvadvfilterService.insert(advfilter);
			}else{
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}
			
			if(setdefault == 1){
				this.xmCustomViewService.setDef(keyid, entitytype);
			}
			
		}
		
		Message msg = new Message();
		msg.setMessage("视图编辑成功！");
		msg.setType(true);
		return objToJson(msg);
	}

	@RequestMapping(value = "/getView", method = RequestMethod.POST)
	@ResponseBody
	public String getView(int viewid){
		XmCustomview customview = this.xmCustomViewService.getView(viewid);
		return objToJson(customview);
	}
	
	/**
	 * 
	 * 得到columns
	 * 
	 * @param viewid
	 * @return
	 */
	@RequestMapping(value = "/getColumns", method = RequestMethod.POST)
	@ResponseBody
	public String getColumns(int viewid){
		List<XmCvcolumnlist> columns = this.xmCvcolumnlistService.getXmCvcolumnlistByCvid(viewid);
		return arrayToJson(columns);
	}
	
	/**
	 * 
	 * 
	 * @param viewid
	 * @return
	 */
	@RequestMapping(value = "/getStdfilter", method = RequestMethod.POST)
	@ResponseBody
	public String getStdfilter(int viewid){
		XmCvstdfilter stdfilter = this.xmCvstdfilterService.getStdfilterByCvid(viewid);
		return objToJson(stdfilter); 
	}
	
	/**
	 * 
	 * 高级查询信息
	 * 
	 * @param viewid
	 * @return
	 */
	@RequestMapping(value = "/getAdvfilter", method = RequestMethod.POST)
	@ResponseBody
	public String getAdvfilter(int viewid){
		List<XmCvadvfilter> advfilters = this.xmCvadvfilterService.getAdvFilters(viewid);
		return arrayToJson(advfilters);
	}
	
	
	/**
	 * 公共视图载入
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/viewIndex", method = RequestMethod.GET)
	public String viewIndex(String entitytype,ModelMap modelMap){
		try{
		this.moduleUtil.setViewProp(modelMap,entitytype);
		}catch(java.lang.NullPointerException e){
			
		}
		XmEntityname entityname = CustomViewUtil.getEntitynameByET(entitytype);
		XmTab tab = CustomViewUtil.getTabByName(entitytype);
		modelMap.addAttribute("tab",tab);
		modelMap.addAttribute("viewid",entityname.getEntityidfield());
		modelMap.addAttribute("entitytype",entitytype);
		modelMap.addAttribute("entityname",entityname);
		return "public/viewcv";
	}
	
	/**
	 * 根据视图ID返回对应的JSON
	 * 
	 * @param page 页数
	 * @param rows 行数
	 * @param viewid 视图ID
	 * @return
	 */
	@RequestMapping(value = "/renderView", method = RequestMethod.POST)
	@ResponseBody
	public String renderView(int page,int rows,String entitytype,int viewid){
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(entitytype,viewid);
		List<CVColumn> cols = this.xmCvcolumnlistService.getViewColumn(customview);
		XmCvstdfilter stdfilter = xmCvstdfilterService.getStdfilterByCvid(viewid);
		List<XmCvadvfilter> advfilter = xmCvadvfilterService.getAdvFilters(viewid);
		
		int total = this.xmCustomViewService.getTotal(viewid,customview,stdfilter,advfilter,cols);
		List<Object> ls = this.xmCustomViewService.loadList(page,rows,viewid,customview,stdfilter,advfilter,cols);
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);
//		JsonConfig jsonConfig = new JsonConfig();
//		jsonConfig.registerJsonValueProcessor(java.sql.Date.class, new JsonDateValueProcessor("yyyy-MM-dd"));
		
		return JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd");
	}
	
	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public String report(){
		return "public/report/index";
	}
	
}
