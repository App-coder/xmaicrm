package com.crm.action.module;

import java.io.UnsupportedEncodingException;

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
import com.crm.bean.easyui.ComboTree;
import com.crm.model.XmBlocks;
import com.crm.model.XmField;
import com.crm.model.XmFreetags;
import com.crm.model.XmGroups;
import com.crm.model.XmRelatedlists;
import com.crm.model.XmTab;
import com.crm.model.XmUsers;
import com.crm.service.XmCustomViewService;
import com.crm.service.XmFreetagsService;
import com.crm.service.module.XmCampaignService;
import com.crm.service.module.XmRelatedlistsServie;
import com.crm.service.settings.basic.XmGroupsService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ActionUtil;
import com.crm.util.Constant;
import com.crm.util.HtmlUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CustomViewUtil;

import java.util.*;

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
	
	XmGroupsService xmGroupsService;
	@Resource(name="xmGroupsService")
	public void setXmGroupsService(XmGroupsService xmGroupsService) {
		this.xmGroupsService = xmGroupsService;
	}
	
	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}
	
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
	
	XmFreetagsService xmFreetagsService;
	@Resource(name="xmFreetagsService")
	public void setXmFreetagsService(XmFreetagsService xmFreetagsService) {
		this.xmFreetagsService = xmFreetagsService;
	}

	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		
		ActionUtil.setTitle("Campaigns", ptb, modelMap, this.moduleUtil);
		this.xmCustomViewService.getAdvSearchFilter("Campaigns",modelMap);
		
		
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
		
		int crmid = 0;
		//修改
		if(request.getParameter("recordid")!=null&&request.getParameter("recordid")!=""){
			crmid = Integer.parseInt(request.getParameter("recordid"));
			res = this.actionCls.update(request,crmid);
		}else{
			crmid = this.xmCampaignService.getMaxId()+1;
			res = this.actionCls.add(request,crmid,userPermission.getUser().getId());
		}
		
		if(res){
			msg.setMessage(crmid+"");
			msg.setType(true);
		}else{
			msg.setMessage(crmid+"");
			msg.setType(false);
		}
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/view")
	public String view(int recordid,String module,int ptb,ModelMap modelmap){
		
		XmTab tab = CustomViewUtil.getTabByName(module);
		this.actionCls.showView(ptb, module, modelmap,recordid,tab);
		this.actionCls.setRelatedlist(tab, modelmap);
		List<XmFreetags> freetags = this.xmFreetagsService.getModuleTags(module,recordid); 
		modelmap.addAttribute("freetags",freetags);
		
		return "module/campaigns/view";
	}
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.GET)
	public String deleteById(int recordid,int ptb){
		boolean res = this.xmCampaignService.delete(recordid);
		return "redirect:/crm/module/campaigns/index?ptb="+ptb;
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
	
	@RequestMapping(value = "/getCondition")
	@ResponseBody
	public String getCondition(){
		
		List<ComboTree> cbos = new ArrayList<ComboTree>();
		
		ComboTree all = new ComboTree();
		all.setId("0");
		all.setText("所有营销活动");
		cbos.add(all);
		
		ComboTree  myaccount = new ComboTree();
		myaccount.setId("-1");
		myaccount.setText("我的营销活动");
		cbos.add(myaccount);
		
		ComboTree  mycreate = new ComboTree();
		mycreate.setId("-2");
		mycreate.setText("我创建的营销活动");
		cbos.add(mycreate);
		
		ComboTree  mybranch = new ComboTree();
		mybranch.setId("-3");
		mybranch.setText("下属的营销活动");
		cbos.add(mybranch);
		
		List<XmGroups> groups = this.xmGroupsService.loadAll();
		List<XmUsers> users = this.xmUsersService.loadAll();
		
		for(int i=0;i<groups.size();i++){
			ComboTree group = new ComboTree();
			group.setId(groups.get(i).getGroupid()+"");
			group.setText(groups.get(i).getGroupname());
			group.setIconCls("icon-group");
			List<ComboTree> childs = new ArrayList();
			for(int j=0;j<users.size();j++){
				if(users.get(j).getGroupid().equals(group.getId())){
					ComboTree u = new ComboTree();
					u.setId(users.get(j).getId()+"");
					u.setText(users.get(j).getLastName());
					u.setIconCls("icon-user");
					childs.add(u);
				}
			}
			group.setChildren(childs);
			cbos.add(group);
		}
		
		return JSON.toJSONString(cbos);
	}
	
}
