package com.crm.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.crm.Message;
import com.crm.bean.easyui.Column;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmCustomview;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmCvadvfilterService;
import com.crm.service.XmCvcolumnlistService;
import com.crm.service.XmCvstdfilterService;

@Controller
@RequestMapping(value = "customview")
public class XmCustomViewController extends BaseController {
	
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
	
	XmCvadvfilterService xmCvadvfilterService;
	@Resource(name="xmCvadvfilterService")
	public void setXmCvadvfilterService(XmCvadvfilterService xmCvadvfilterService) {
		this.xmCvadvfilterService = xmCvadvfilterService;
	}

	XmCvstdfilterService xmCvstdfilterService;
	@Resource(name="xmCvstdfilterService")
	public void setXmCvstdfilterService(XmCvstdfilterService xmCvstdfilterService) {
		this.xmCvstdfilterService = xmCvstdfilterService;
	}


	@RequestMapping(value = "/queryByEntityType", method = RequestMethod.GET)
	public String getViewList(@RequestParam("entitytype") String entitytype){
		List<XmCustomview> list=this.xmCustomViewService.queryByEntityType(entitytype);
		return this.arrayToJson(list);
	}
	

	/**
	 * 
	 * 取得COLUMN的JSON字符串
	 * @param entitytype 实体类型
	 * @param viewid 视图ID
	 * @return 
	 */
	@RequestMapping(value = "/getViewColumn", method = RequestMethod.GET)
	@ResponseBody
	public String getViewColumn(String entitytype,int viewid){
		
		XmCustomview customview = this.xmCustomViewService.selectByPrimaryKey(entitytype,viewid);
		List<Column> cols = this.xmCvcolumnlistService.getViewColumn(customview);
		
		return arrayToJson(cols);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@Param("entitytype") String entitytype,ModelMap modelmap){
		
		modelmap.addAttribute("entitytype", entitytype);
		
		return "public/customview";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(@Param("entitytype") String entitytype){
		
		List<XmCustomview> list = this.xmCustomViewService.loadCViewByEntitytype(entitytype);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/load", method = RequestMethod.POST)
	@ResponseBody
	public String load(@Param("entitytype") String entitytype){
		List<XmCustomview> list = this.xmCustomViewService.loadList(entitytype);
		ListBean bean = new ListBean();
		bean.setRows(list);
		bean.setTotal(list.size());
		return objToJson(bean);
	}
	
	@RequestMapping(value = "/setDef", method = RequestMethod.POST)
	@ResponseBody
	public String setDef(@Param("cvid") int cvid,@Param("entitytype") String entitytype){
		boolean result = this.xmCustomViewService.setDef(cvid,entitytype);
		Message msg = new Message();
		if(result){
			msg.setMessage("默认设置成功！");
			msg.setType(true);
		}else{
			msg.setMessage("默认设置失败！");
			msg.setType(true);
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value = "/deleteCv", method = RequestMethod.POST)
	@ResponseBody
	public String deleteCv(@Param("cvid") int cvid){
		boolean result = this.xmCustomViewService.deleteCv(cvid);
		this.xmCvcolumnlistService.deleteCv(cvid);
		this.xmCvadvfilterService.deleteCv(cvid);
		this.xmCvstdfilterService.deleteCv(cvid);
		
		Message msg = new Message();
		if(result){
			msg.setMessage("视图删除成功！");
			msg.setType(true);
		}else{
			msg.setMessage("视图删除失败！");
			msg.setType(true);
		}
		return objToJson(msg);
	}
	
	
}
