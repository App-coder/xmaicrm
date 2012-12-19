package com.crm.action.settings.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmApprove;
import com.crm.model.XmApprovestep;
import com.crm.model.XmTab;
import com.crm.service.XmTabService;
import com.crm.service.settings.system.XmApproveService;
import com.crm.util.JsonUtil;
/**
 * 
 * 系统设置-审批流程
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/multiapprove")
public class XmMultiApproveController extends BaseController {
	
	XmTabService xmTabService;
	@Resource(name="xmTabService")
	public void setXmTabService(XmTabService xmTabService) {
		this.xmTabService = xmTabService;
	}

	XmApproveService xmApproveService;
	@Resource(name="xmApproveService")
	public void setXmApproveService(XmApproveService xmApproveService) {
		this.xmApproveService = xmApproveService;
	}


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		
		List<XmTab> modules = this.xmTabService.getMultiApproveModule();
		modelMap.addAttribute("modules",modules);
		
		return "settings/system/multiapprove";
	}
	
	
	/**
	 * @param tabid 
	 * @return
	 */
	@RequestMapping(value = "/getApproveList", method = RequestMethod.POST)
	@ResponseBody
	public String getApproveList(int tabid){
		
		ListBean bean = new ListBean();
		List<XmApprove> approves = this.xmApproveService.getApproveList(tabid); 
		bean.setRows(approves);
		bean.setTotal(approves.size());
		
		return JSON.toJSONString(approves);
	}
	
	
	@RequestMapping(value = "/getApproveRole", method = RequestMethod.GET)
	@ResponseBody
	public String getApproveRole(int approveid){
		return JSON.toJSONString(this.xmApproveService.getApproveRole(approveid));
	}
	
	/*
	 * @RequestMapping(value="/submit",method=RequestMethod.POST)
	@ResponseBody
	public String execute(ModelMap modelMap,XmBlocks xmBlocks,String action,int blockid){
		int affectrows  = 0;
		if(action.equals("add"))
			affectrows=this.xmCustomBlockService.insert(xmBlocks);
		else if(action.equals("update"))
			affectrows=this.xmCustomBlockService.updateByPrimaryKey(xmBlocks);
		else 
			affectrows=this.xmCustomBlockService.deleteByPrimaryKey(blockid);
		
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}else{
			msg.setMessage("编辑时发生异常！");
			msg.setType(false);
		}
		return objToJson(msg);
	}
	 */
	
	
	@RequestMapping(value="/doMultiApprove",method=RequestMethod.POST)
	@ResponseBody
	public String doMultiApprove(String xmApprove,int approveid,String userArr,String action){
		XmApprove approve=(XmApprove)JsonUtil.getObject4JsonString(xmApprove,XmApprove.class);
		int affectrows  = 0;
		if(action.equals("update"))
			affectrows=this.xmApproveService.updateMultiApprove(approve, approveid, userArr);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}else{
			msg.setMessage("编辑时发生异常！");
			msg.setType(false);
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value="/isApproveUsed",method=RequestMethod.GET)
	@ResponseBody
	public String isApproveUsed(int approveid){
		int affectrows  = 0;
		affectrows=this.xmApproveService.getApproveUsed(approveid);
		Message msg = new Message();
		if(affectrows>=1){
			msg.setMessage("该流程正在使用！");
			msg.setType(true);
		}else{
			msg.setMessage("该流程不再使用！");
			msg.setType(false);
		}
		return objToJson(msg);
	}
	
	@RequestMapping(value="/showApproveStep",method=RequestMethod.GET)
	public String showApproveStep(ModelMap modelMap,int approveid){
		XmApprove xmApprove=this.xmApproveService.getApproveListById(approveid);
		modelMap.addAttribute("approveid", approveid);
		modelMap.addAttribute("xmApprove", xmApprove);
		return "settings/system/multiapprovestep";
	}
	
	@RequestMapping(value="/editApproveStep",method=RequestMethod.GET)
	public String editApproveStep(ModelMap modelMap,int id){
		XmApprovestep xmApprove=this.xmApproveService.getApproveStepById(id);
		//modelMap.addAttribute("approveid", approveid);
		//modelMap.addAttribute("xmApprove", xmApprove);
		return "settings/system/editApprovestep";
	}
	
	@RequestMapping(value="/getApproveStepList",method=RequestMethod.POST)
	@ResponseBody
	public String getApproveStepList(int approveid){
		return JSON.toJSONString(this.xmApproveService.getApproveStepList(approveid));
	}
	
	@RequestMapping(value="/getApproveStepUsers",method=RequestMethod.GET)
	@ResponseBody
	public String getApproveStepUsers(){
		return JSON.toJSONString(this.xmApproveService.getApproveStepUsers());
	}
	
	
	
	
	
	
	
}
