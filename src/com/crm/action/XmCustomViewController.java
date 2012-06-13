package com.crm.action;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.amcharts.ChartAssemble;
import com.crm.bean.amcharts.ChartData;
import com.crm.bean.amcharts.chartdata.ChartObject;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.Column;
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
import com.crm.model.XmParenttab;
import com.crm.model.XmTab;
import com.crm.service.XmBlocksService;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvadvfilterService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.service.XmCvstdfilterService;
import com.crm.service.XmEntitynameService;
import com.crm.service.XmFieldService;
import com.crm.service.XmPicklistService;
import com.crm.service.XmSequenceService;
import com.crm.service.XmTabService;
import com.crm.service.module.XmNoteplansService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ArrayUtil;
import com.crm.util.CacheManager;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.HtmlUtil;
import com.crm.util.JsonUtil;
import com.crm.util.crm.CustomViewUtil;

@Controller
@RequestMapping(value = "crm/customview")
public class XmCustomViewController extends BaseController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
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
	@Resource(name = "xmSequenceService")
	public void setXmSequenceService(XmSequenceService xmSequenceService) {
		this.xmSequenceService = xmSequenceService;
	}

	XmPicklistService xmPicklistService;
	@Resource(name = "xmPicklistService")
	public void setXmPicklistService(XmPicklistService xmPicklistService) {
		this.xmPicklistService = xmPicklistService;
	}
	
	XmEntitynameService xmEntitynameService;
	@Resource(name="xmEntitynameService")
	public void setXmEntitynameService(XmEntitynameService xmEntitynameService) {
		this.xmEntitynameService = xmEntitynameService;
	}
	
	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}
	
	XmNoteplansService xmNoteplansService;
	@Resource(name="xmNoteplansService")
	public void setXmNoteplansService(XmNoteplansService xmNoteplansService) {
		this.xmNoteplansService = xmNoteplansService;
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

	/**
	 * 视图编辑
	 * 
	 * @param entitytype
	 * @param ptb
	 * @param modelmap
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@Param("entitytype") String entitytype,int ptb,
			ModelMap modelmap) {

		XmTab tab = this.xmTabService.getTabByName(entitytype);
		modelmap.addAttribute("tab", tab);
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
				HtmlUtil.getMultSelect(blocks, fieldsList, entitytype));
		modelmap.addAttribute("colloptionstr",
				HtmlUtil.getCollectSelect(blocks, fieldsList, entitytype));
		modelmap.addAttribute("filter", HtmlUtil.getFilter());
		modelmap.addAttribute("entitytype", entitytype);

		modelmap.addAttribute("timeoptions", new TimeOptions());

		// 选择查询字段
		List<XmField> searchFields = this.xmFieldService.getSearchFields(tab
				.getTabid());
		modelmap.addAttribute("searchfields",
				HtmlUtil.getSearchFields(searchFields));
		
		HashMap<Integer, XmParenttab> parenttabs = (HashMap<Integer, XmParenttab>) CacheManager
				.getFromCache(Constant.PARENTTAB);
		XmParenttab parenttab = parenttabs.get(ptb);
		modelmap.addAttribute("ptb", parenttab);

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
	public String load(@Param("entitytype") String entitytype, int page,
			int rows) {
		List<XmCustomview> list = this.xmCustomViewService.loadList(entitytype,
				page, rows);
		int total = this.xmCustomViewService.getTotal(entitytype);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(total);
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
			Integer id, String startdate, String stddatefilter,
			String viewname, String entitytype, Integer setdefault,
			Integer setmetrics, String setpublic, String ispublic) {

		if (action.equals("update")) {
			// 编辑
			XmCustomview cv = new XmCustomview();

			// 设置view
			cv.setCvid(id);
			cv.setViewname(viewname);
			cv.setCollectcolumn(column_collect);
			cv.setEntitytype(entitytype);
			cv.setSetdefault(setdefault);
			cv.setSetmetrics(setmetrics);
			cv.setSetpublic(setpublic);

			this.xmCustomViewService.update(cv);

			// 删除column
			this.xmCvcolumnlistService.deleteCvColumnlistByCvid(id);

			// 1.设置column 2.标准条件 ，3.高级条件
			if (!"".equals(column_1)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(0);
				col.setColumnname(column_1);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_2)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(1);
				col.setColumnname(column_2);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_3)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(2);
				col.setColumnname(column_3);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_4)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(3);
				col.setColumnname(column_4);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_5)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(4);
				col.setColumnname(column_5);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_6)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(5);
				col.setColumnname(column_6);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_7)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(6);
				col.setColumnname(column_7);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_8)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(7);
				col.setColumnname(column_8);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_9)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(id);
				col.setColumnindex(8);
				col.setColumnname(column_9);
				this.xmCvcolumnlistService.insert(col);
			}

			this.xmCvstdfilterService.deleteCv(id);
			// 标准条件
			XmCvstdfilter stdfilter = new XmCvstdfilter();
			stdfilter.setCvid(id);
			stdfilter.setColumnname(column_stdfilter);
			stdfilter.setEnddate(DateUtil.parseDate(enddate));
			stdfilter.setStartdate(DateUtil.parseDate(startdate));
			stdfilter.setStdfilter(stddatefilter);
			this.xmCvstdfilterService.insert(stdfilter);

			this.xmCvadvfilterService.deleteCv(id);
			// 高级条件
			if (!"".equals(advfiltercol_1) && !"".equals(comparator_1)
					&& !"".equals(fv_1)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setColumnname(advfiltercol_1);
				advfilter.setComparator(comparator_1);
				advfilter.setCvid(id);
				advfilter.setValue(fv_1);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_2) && !"".equals(comparator_2)
					&& !"".equals(fv_2)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setColumnname(advfiltercol_2);
				advfilter.setComparator(comparator_2);
				advfilter.setCvid(id);
				advfilter.setValue(fv_2);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_3) && !"".equals(comparator_3)
					&& !"".equals(fv_3)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setColumnname(advfiltercol_3);
				advfilter.setComparator(comparator_3);
				advfilter.setCvid(id);
				advfilter.setValue(fv_3);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_4) && !"".equals(comparator_4)
					&& !"".equals(fv_4)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setColumnname(advfiltercol_4);
				advfilter.setComparator(comparator_4);
				advfilter.setCvid(id);
				advfilter.setValue(fv_4);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_5) && !"".equals(comparator_5)
					&& !"".equals(fv_5)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setColumnname(advfiltercol_5);
				advfilter.setComparator(comparator_5);
				advfilter.setCvid(id);
				advfilter.setValue(fv_5);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setCvid(id);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (setdefault == 1) {
				this.xmCustomViewService.setDef(id, entitytype);
			}

		} else {
			// 添加
			Integer keyid = this.xmSequenceService.getSequenceId("customview");

			XmCustomview cv = new XmCustomview();

			// 设置view
			cv.setViewname(viewname);
			cv.setCollectcolumn(column_collect);
			cv.setEntitytype(entitytype);
			cv.setSetdefault(setdefault);
			cv.setSetmetrics(setmetrics);
			// 角色，或，0
			cv.setSetpublic(setpublic);
			cv.setCvid(keyid);

			this.xmCustomViewService.insert(cv);

			// 1.设置column 2.标准条件 ，3.高级条件
			if (!"".equals(column_1)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(0);
				col.setColumnname(column_1);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_2)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(1);
				col.setColumnname(column_2);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_3)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(2);
				col.setColumnname(column_3);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_4)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(3);
				col.setColumnname(column_4);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_5)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(4);
				col.setColumnname(column_5);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_6)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(5);
				col.setColumnname(column_6);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_7)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(6);
				col.setColumnname(column_7);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_8)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(7);
				col.setColumnname(column_8);
				this.xmCvcolumnlistService.insert(col);
			}

			if (!"".equals(column_9)) {
				XmCvcolumnlist col = new XmCvcolumnlist();
				col.setCvid(keyid);
				col.setColumnindex(8);
				col.setColumnname(column_9);
				this.xmCvcolumnlistService.insert(col);
			}

			// 标准条件
			XmCvstdfilter stdfilter = new XmCvstdfilter();
			stdfilter.setCvid(keyid);
			stdfilter.setColumnname(column_stdfilter);
			stdfilter.setEnddate(DateUtil.parseDate(enddate));
			stdfilter.setStartdate(DateUtil.parseDate(startdate));
			stdfilter.setStdfilter(stddatefilter);
			this.xmCvstdfilterService.insert(stdfilter);

			// 高级条件
			if (!"".equals(advfiltercol_1) && !"".equals(comparator_1)
					&& !"".equals(fv_1)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setColumnname(advfiltercol_1);
				advfilter.setComparator(comparator_1);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_1);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(0);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_2) && !"".equals(comparator_2)
					&& !"".equals(fv_2)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setColumnname(advfiltercol_2);
				advfilter.setComparator(comparator_2);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_2);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(1);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_3) && !"".equals(comparator_3)
					&& !"".equals(fv_3)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setColumnname(advfiltercol_3);
				advfilter.setComparator(comparator_3);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_3);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(2);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_4) && !"".equals(comparator_4)
					&& !"".equals(fv_4)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setColumnname(advfiltercol_4);
				advfilter.setComparator(comparator_4);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_4);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(3);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (!"".equals(advfiltercol_5) && !"".equals(comparator_5)
					&& !"".equals(fv_5)) {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setColumnname(advfiltercol_5);
				advfilter.setComparator(comparator_5);
				advfilter.setCvid(keyid);
				advfilter.setValue(fv_5);
				this.xmCvadvfilterService.insert(advfilter);
			} else {
				XmCvadvfilter advfilter = new XmCvadvfilter();
				advfilter.setColumnindex(4);
				advfilter.setCvid(keyid);
				this.xmCvadvfilterService.insert(advfilter);
			}

			if (setdefault == 1) {
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
	public String getView(int viewid) {
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
	public String getColumns(int viewid) {
		List<XmCvcolumnlist> columns = this.xmCvcolumnlistService
				.getXmCvcolumnlistByCvid(viewid);
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
	public String getStdfilter(int viewid) {
		XmCvstdfilter stdfilter = this.xmCvstdfilterService
				.getStdfilterByCvid(viewid);
		return JSON.toJSONStringWithDateFormat(stdfilter, "yyyy-MM-dd");
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
	public String getAdvfilter(int viewid) {
		List<XmCvadvfilter> advfilters = this.xmCvadvfilterService
				.getAdvFilters(viewid);
		return JSON.toJSONStringWithDateFormat(advfilters, "yyyy-MM-dd");
	}

	/**
	 * 公共视图载入
	 * 
	 * @param modelMap
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/viewIndex", method = RequestMethod.GET)
	public String viewIndex(String entitytype,String ptb,ModelMap modelMap) throws UnsupportedEncodingException {
		XmTab tab = CustomViewUtil.getTabByName(entitytype);
		this.moduleUtil.setViewProp(modelMap, entitytype, tab);
		XmEntityname entityname = CustomViewUtil.getEntitynameByET(entitytype);
		modelMap.addAttribute("tab", tab);
		modelMap.addAttribute("viewid", entityname.getEntityidfield());
		modelMap.addAttribute("entitytype", entitytype);
		modelMap.addAttribute("entityname", entityname);
		
		modelMap.addAttribute("ptb",new String(ptb.getBytes("ISO-8859-1"),
				"utf-8"));
		return "public/viewcv";
	}
	
	/**
	 * 查询选择的框子，弹出窗的window
	 * 
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/viewPop", method = RequestMethod.GET)
	public String viewPop(String modulename,String columnname, ModelMap modelMap){
		XmTab tab = CustomViewUtil.getTabByName(modulename);
		this.moduleUtil.setViewProp(modelMap, modulename, tab);
		XmEntityname entityname = CustomViewUtil.getEntitynameByET(modulename);
		modelMap.addAttribute("tab", tab);
		modelMap.addAttribute("viewid", entityname.getEntityidfield());
		modelMap.addAttribute("entitytype", modulename);
		modelMap.addAttribute("entityname", entityname);
		modelMap.addAttribute("columnname",columnname);
		return "module/"+modulename.toLowerCase()+"/viewpop";
	}

	/**
	 * 根据视图ID返回对应的JSON
	 * 
	 * @param page
	 *            页数
	 * @param rows
	 *            行数
	 * @param viewid
	 *            视图ID
	 * @return
	 */
	@RequestMapping(value = "/renderView", method = RequestMethod.POST)
	@ResponseBody
	public String renderView(int page, int rows, String entitytype, int viewid,HttpServletRequest request) {
		
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(
				entitytype, viewid);
		List<CVColumn> cols = this.xmCvcolumnlistService
				.getViewColumn(customview);
		XmCvstdfilter stdfilter = xmCvstdfilterService
				.getStdfilterByCvid(viewid);
		List<XmCvadvfilter> advfilter = xmCvadvfilterService
				.getAdvFilters(viewid);

		String customfilter = getCustomFilter(entitytype,request);
		
		int total = this.xmCustomViewService.getTotal(viewid, customview,
				stdfilter, advfilter, cols,customfilter);
		List<Map> ls = this.xmCustomViewService.loadList(page, rows, viewid,
				customview, stdfilter, advfilter, cols,customfilter);

		
		//根据模块的不同，整理生成的数据……
		if(entitytype.equalsIgnoreCase("Noteplans")){
			if(ls.size()>0){
				for(int i=0;i<ls.size();i++){
					Iterator iter = ls.get(i).entrySet().iterator();
					while (iter.hasNext()) {
						Map.Entry entry = (Map.Entry) iter.next();
						Object key = entry.getKey();
						if(key.equals("executor")){
							entry.setValue(xmNoteplansService.getExecutor(entry.getValue()));
						}
					}
				}
			}
		}
		
		ListBean list = new ListBean();
		list.setRows(ls);
		list.setTotal(total);

		try {
			List<HashMap<String, String>> listfooter = new ArrayList<HashMap<String, String>>();
			if (customview.getCollectcolumn() != null) {
				HashMap hs_collect = new HashMap();
				CVColumn collect = (CVColumn) JsonUtil.getObject4JsonString(
						customview.getCollectcolumn(), CVColumn.class);

				BigDecimal collectall = new BigDecimal(0);
				if (ls.size() >= 1) {
					for (int i = 0; i < ls.size(); i++) {
						HashMap<String, String> h = (HashMap<String, String>) ls
								.get(i);
						Iterator iter = h.entrySet().iterator();
						while (iter.hasNext()) {
							Map.Entry entry = (Map.Entry) iter.next();
							if (entry.getKey().equals(collect.getFieldname())) {
								collectall = collectall.add(new BigDecimal(
										entry.getValue() + ""));
							}
						}
					}
				}
				hs_collect.put("statname", collect.getFieldlabel() + "合计");
				hs_collect.put("statnum", collectall.doubleValue());
				listfooter.add(hs_collect);
				list.setFooter(listfooter);
			}
		} catch (Exception e) {

		}
		return JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd");
	}
	
	/**
	 * 根据类型获取和组合自定义的过滤条件
	 * 
	 * @param entitytype
	 * @param request
	 * @return
	 */
	public String getCustomFilter(String entitytype,HttpServletRequest request){
		StringBuffer sb = new StringBuffer();
		//入库单管理
		if(entitytype.equals("Warehouses")){
			int cangku = Integer.parseInt(request.getParameter("cangku"));
			if(cangku!=1){
				sb.append(" and xm_warehouses.cangkusid = "+cangku);
			}
		}else if(entitytype.equals("Deliverys")){
			int cangku = Integer.parseInt(request.getParameter("cangku"));
			if(cangku!=1){
				sb.append(" and xm_deliverys.cangkusid = "+cangku);
			}
		}else if(entitytype.equals("Products")){
			//catalogid
			String catalogid = request.getParameter("catalogid");
			if(catalogid!=null && !catalogid.equals("H1")){
				sb.append(" and xm_products.catalogid = '"+catalogid+"'");
			}
		}
		return sb.toString();
	}

	/**
	 * @return 得到报表数据
	 */
	@RequestMapping(value = "/getChartData", method = RequestMethod.POST)
	@ResponseBody
	private String getChartData(String graphtype, String grouptype, int cvid,
			String pickfieldtable, String pickfieldname, String pickfieldcolname) {
		ChartAssemble assemble = new ChartAssemble();
		ChartData chartdata = new ChartData();
		XmCustomview customview = new XmCustomview();
		customview.setCvid(cvid);
		List<CVColumn> cols = this.xmCvcolumnlistService
				.getViewColumn(customview);

		// 设置数据
		List<Object> datalist = this.xmCustomViewService.getChartData(
				grouptype, cols, pickfieldtable, pickfieldname,
				pickfieldcolname);
		List<ChartObject> chartobjs = new ArrayList<ChartObject>();

		if (datalist.size() > 0) {
			for (int i = 0; i < datalist.size(); i++) {
				Iterator iter = ((HashMap) datalist.get(i)).entrySet()
						.iterator();
				int j = 0;
				ChartObject co = new ChartObject();
				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					Object key = entry.getValue();
					if (j == 0) {
						co.setCategoryField(key.toString());
					} else {
						// 设置颜色
						co.setValueField(key.toString());
						if (graphtype.equals("vertical3D")) {
							co.setColorField(HtmlUtil.setColor(i, 17));
						}
						chartobjs.add(co);
					}
					j++;
				}
			}
		}

		chartdata.setData(chartobjs);

		// Picklist
		List<Object> picklist = this.xmPicklistService
				.getPickList(pickfieldcolname);

		assemble.setData(chartdata);
		assemble.setPicklist(picklist);

		return JSON.toJSONString(assemble);
	}

	/**
	 * @return 得到报表数据
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/createChart", method = RequestMethod.GET)
	public String createChart(String graphtype, String grouptype, int cvid,
			String pickfieldtable, String pickfieldname,
			String pickfieldcolname, String title, String grouptitle,
			String reporttext, ModelMap modelmap)
			throws UnsupportedEncodingException {

		modelmap.addAttribute("grouptitle", new String(grouptitle.getBytes("ISO-8859-1"),"utf-8"));
		modelmap.addAttribute("graphtype", new String(graphtype.getBytes("ISO-8859-1"),"utf-8"));
		modelmap.addAttribute("reporttext", new String(reporttext.getBytes("ISO-8859-1"),"utf-8"));
		// 设置一下转码
		modelmap.addAttribute("title", new String(title.getBytes("ISO-8859-1"),
				"utf-8"));

		ChartAssemble assemble = new ChartAssemble();
		ChartData chartdata = new ChartData();
		XmCustomview customview = new XmCustomview();
		customview.setCvid(cvid);
		List<CVColumn> cols = this.xmCvcolumnlistService
				.getViewColumn(customview);

		// 设置数据
		List<Object> datalist = this.xmCustomViewService.getChartData(
				grouptype, cols, pickfieldtable, pickfieldname,
				pickfieldcolname);
		List<ChartObject> chartobjs = new ArrayList<ChartObject>();

		if (datalist.size() > 0) {
			for (int i = 0; i < datalist.size(); i++) {
				Iterator iter = ((HashMap) datalist.get(i)).entrySet()
						.iterator();
				int j = 0;
				ChartObject co = new ChartObject();
				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					Object key = entry.getValue();
					if (j == 0) {
						co.setCategoryField(key.toString());
					} else {
						// 设置颜色
						co.setValueField(key.toString());
						if (graphtype.equals("vertical3D")) {
							co.setColorField(HtmlUtil.setColor(i, 17));
						}
						chartobjs.add(co);
					}
					j++;
				}
			}
		}

		chartdata.setData(chartobjs);

		// Picklist
		List<Object> picklist = this.xmPicklistService
				.getPickList(pickfieldcolname);

		assemble.setData(chartdata);
		assemble.setPicklist(picklist);

		modelmap.addAttribute("assembleobj", assemble);
		modelmap.addAttribute("assemble", JSON.toJSONString(assemble));

		return "public/report/index";
	}
	
	/**
	 * 显示编辑窗口
	 * 
	 * @param recordid 记录ID
	 * @param module 模块
	 * @param modelmap
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/showEdit", method = RequestMethod.GET)
	public String showEdit(int recordid,String module,String ptb,ModelMap modelmap) throws UnsupportedEncodingException{
		
		
		XmTab tab = CustomViewUtil.getTabByName(module);
		modelmap.addAttribute("tab",tab );
		
		modelmap.addAttribute("ptb",new String(ptb.getBytes("ISO-8859-1"),
				"utf-8"));
		
		//加载对应的数据
		if(recordid!=0){
			modelmap.addAttribute("recordid",recordid);
		}
		
		//初始化编辑窗口
		XmEntityname entity = xmEntitynameService.getEntityByModule(module);
		modelmap.addAttribute("entity",entity);
		
		/*
		 * 得到所有的字段，根据tableid
		List<XmField> fields = xmFieldService.getFieldsByTabid(entity.getTabid());
		if(fields.size()>0){
			for(int i=0;i<fields.size();i++){
				fields.get(i).setFieldHtml(HtmlUtil.getFieldHtml(fields.get(i).getColumnname(),fields.get(i).getTypeofdata()));
			}
		}
		modelmap.addAttribute("fields",fields);
		*/
		
		
		//得到block，
		List<XmBlocks> blocks = xmBlocksService.getFieldBlocksByTabId(entity.getTabid());
		
		List<Object> blockArray = new ArrayList<Object>();
		for(int i=0;i<blocks.size();i++){
			blockArray.add(blocks.get(i).getBlockid());
		}
		String blockstr = ArrayUtil.arrayToJoinStr(blockArray,",",true);
		
		List<XmField> fields = this.xmFieldService.getEditFields(entity.getTabid(),blockstr);
		Set setblock = new HashSet();
		
		if(fields.size()>0){
			for(int i=0;i<fields.size();i++){
				fields.get(i).setFieldHtml(HtmlUtil.getFieldHtml(fields.get(i),this.xmPicklistService,this.xmUsersService));
				setblock.add(fields.get(i).getBlock());
			}
		}
		modelmap.addAttribute("fields",fields);
		
		//整理后的block modelmap.addAttribute("blocks",blocks);
		List<XmBlocks> arrangeBlock = new ArrayList<XmBlocks>();
		for(int i=0;i<blocks.size();i++){
			if(setblock.contains(blocks.get(i).getBlockid())){
				arrangeBlock.add(blocks.get(i));
			}
		}
		modelmap.addAttribute("blocks",arrangeBlock);
		
		return "public/showedit";
	}
	
	/**
	 * 根据视图ID，获取视图的column
	 * 
	 * @param cvid 视图ID
	 * @return
	 */
	@RequestMapping(value = "/getDView", method = RequestMethod.GET)
	@ResponseBody
	public String getDView(int cvid){
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(cvid);
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
			return arrayToJson(reset);
		} catch (net.sf.json.JSONException e) {
			return "";
		}
	}
	
	

}
