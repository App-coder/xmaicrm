package com.crm.report.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCangkuInfo;
import com.crm.model.XmStaffMonthly;
import com.crm.model.XmUsersalesinforeport;
import com.crm.report.service.XmIntegradedreportsService;
import com.crm.util.JsonUtil;
/**
 * 
 * 综合报表控制器
 * 
 * User: zhangjun
 * Date: 2012-9-02
 * Time: 上午9:57:15
 */
@Controller
@RequestMapping(value = "integradedreports")
public class XmIntegradedreportsController extends BaseController {
	
	private static final String[] CANGKU_EXCLUDES = new String[] { "cangkusid"};
	private static final String[] USERSALES_EXCLUDES = new String[] { "salesorderid"};
	
	@Autowired
	XmIntegradedreportsService xmIntegradedreportsService;
	
	
	@RequestMapping(value = "/index/{year}", method = RequestMethod.GET)
	public String index(ModelMap modelMap,@PathVariable("year") Integer year){
		modelMap.addAttribute("year", year);
		return "report/integradedreports";
	}
	
	@RequestMapping(value = "/salestotal/index", method = RequestMethod.GET)
	public String salestotal(ModelMap modelMap){
		return "report/salestotal";
	}
	
	@RequestMapping(value = "/cangkuinfo/index", method = RequestMethod.GET)
	public String cangkuinfo_index(ModelMap modelMap){
		return "report/cangkuinfo";
	}
	
	//综合报表公共模版
	@RequestMapping(value = "/modelreports/index/{params}", method = RequestMethod.GET)
	public String usersalesinforeport_index(ModelMap modelMap,@PathVariable("params") String params) throws UnsupportedEncodingException{
		JSONObject job=JSONObject.fromObject(params);
		modelMap.addAttribute("duedate", job.get("duedate"));
		modelMap.addAttribute("id", job.get("id"));
		return "report/modelreports";
	}
	
	//销售汇总
	@RequestMapping(value = "/salestotal/staffMonthly", method = RequestMethod.POST)
	@ResponseBody
	public String staffMonthly(ModelMap modelMap){
		List<XmStaffMonthly> list=xmIntegradedreportsService.staffMonthly();
		return JSONArray.fromObject(list).toString();
	}
	
	//当前库存资产
	@RequestMapping(value = "/cangkuinfo", method = RequestMethod.POST)
	@ResponseBody
	public String cangkuinfo(ModelMap modelMap){
		List<XmCangkuInfo> list=this.xmIntegradedreportsService.queryCangkuTotal();
		List<XmCangkuInfo> footer=this.xmIntegradedreportsService.getCangkuFooter();
		ListBean ls = new ListBean();
		ls.setRows(list);
//		ls.setFooter(footer);
		return objToJson(ls, JsonUtil.configJson(CANGKU_EXCLUDES));
	}
	
	//人员签署订单明细
	@RequestMapping(value = "/modelreports/{id}/{duedate}", method = RequestMethod.POST)
	@ResponseBody
	public String usersalesinforeport(int page,int rows,@PathVariable("id") int id,@PathVariable("duedate") String duedate,ModelMap modelMap){
		page = (page -1)*rows;
		List<XmUsersalesinforeport> ls=this.xmIntegradedreportsService.queryUsersalesinforeport(page,rows,id,duedate);
		int total=this.xmIntegradedreportsService.getTotal(id,duedate);
		ListBean list = new ListBean();
		list.setTotal(total);
		list.setRows(ls);
		return objToJson(list, JsonUtil.configJson(USERSALES_EXCLUDES));
	}
	
	
}
