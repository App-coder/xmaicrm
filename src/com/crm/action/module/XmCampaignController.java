package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.Message;
import com.crm.bean.crm.UserPermission;
import com.crm.service.XmCustomViewService;
import com.crm.service.module.XmCampaignService;
import com.crm.util.ActionUtil;
import com.crm.util.Constant;
import com.crm.util.actionutil.ActionCls;

/**
 * 
 * 营销-营销活动
 * 
 * User: zhujun
 * Date: 2012-8-23
 * Time: 下午10:24:58
 */
@Controller
@RequestMapping(value = "crm/module/campaigns")
@SessionAttributes({Constant.USERPERMISSION})
public class XmCampaignController extends BaseController {
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmCampaignService xmCampaignService;
	@Resource(name="xmCampaignService")
	public void setXmCampaignService(XmCampaignService xmCampaignService) {
		this.xmCampaignService = xmCampaignService;
	}
	
	XmCustomViewService xmCustomViewService;
	@Resource(name = "xmCustomViewService")
	public void setXmCustomViewService(XmCustomViewService xmCustomViewService) {
		this.xmCustomViewService = xmCustomViewService;
	}
	
	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle("Campaigns", ptb, modelMap, this.moduleUtil);

		return "module/campaigns/index";
	}
	
	@RequestMapping(value = "/showedit")
	public String showedit(int recordid,String module,int ptb,ModelMap modelmap){
		
		this.actionCls.showEdit(ptb, module, modelmap,recordid);
		
		return "module/campaigns/edit";
	}
	
	@RequestMapping(value = "/edit")
	@ResponseBody
	public String edit(HttpServletRequest request,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		Message msg = new Message();
		Boolean res = false;
		
		//修改
		if(request.getParameter("recordid")!=null){
			res = this.actionCls.update(request,Integer.parseInt(request.getParameter("recordid")));
		}else{
			int insertid = this.xmCampaignService.getMaxId()+1;
			res = this.actionCls.add(request,insertid,userPermission.getUser().getId());
		}
		
		if(res){
			msg.setMessage("编辑成功！");
			msg.setType(true);
		}else{
			msg.setMessage("编辑失败！");
			msg.setType(false);
		}
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/view")
	public String view(int recordid,String module,int ptb,ModelMap modelmap){
		
		this.actionCls.showView(ptb, module, modelmap,recordid);
		
		return "module/campaigns/view";
	}
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.POST)
	@ResponseBody
	public String deleteById(int recordid){
		boolean res = this.xmCampaignService.delete(recordid);
		Message msg = new Message();
		if(res == true){
			msg.setType(true);
			msg.setMessage("删除成功！");
		}else{
			msg.setType(false);
			msg.setMessage("删除失败！");
		}
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/deleteRecords", method = RequestMethod.POST)
	@ResponseBody
	public String deleteRecords(String recordids){
		boolean res = this.xmCampaignService.deleteRecords(recordids);
		Message msg = new Message();
		if(res == true){
			msg.setType(true);
			msg.setMessage("删除成功！");
		}else{
			msg.setType(false);
			msg.setMessage("删除失败！");
		}
		return JSON.toJSONString(msg);
	}
	
	
	
}
