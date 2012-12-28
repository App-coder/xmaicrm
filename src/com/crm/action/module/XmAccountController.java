package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.Message;
import com.crm.bean.easyui.ComboTree;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmAccount;
import com.crm.model.XmCampaignaccountrel;
import com.crm.model.XmFreetags;
import com.crm.model.XmGroups;
import com.crm.model.XmTab;
import com.crm.model.XmUsers;
import com.crm.service.XmCampaignaccountrelService;
import com.crm.service.XmFreetagsService;
import com.crm.service.module.XmAccountService;
import com.crm.service.settings.basic.XmGroupsService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ActionUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CustomViewUtil;

@Controller
@RequestMapping(value = "crm/module/accounts")
public class XmAccountController extends BaseController{
	
	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
	}
	
	XmGroupsService xmGroupsService;
	@Resource(name="xmGroupsService")
	public void setXmGroupsService(XmGroupsService xmGroupsService) {
		this.xmGroupsService = xmGroupsService;
	}
	
	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	XmAccountService xmAccountService;
	@Resource(name="xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}
	
	XmUsersService xmUsersService;
	@Resource(name="xmUsersService")
	public void setXmUsersService(XmUsersService xmUsersService) {
		this.xmUsersService = xmUsersService;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle("Accounts", ptb, modelMap, this.moduleUtil);
		return "module/accounts/index";
	}
	
	XmCampaignaccountrelService xmCampaignaccountrelService;
	@Resource(name="xmCampaignaccountrelService")
	public void setXmCampaignaccountrelService(
			XmCampaignaccountrelService xmCampaignaccountrelService) {
		this.xmCampaignaccountrelService = xmCampaignaccountrelService;
	}
	
	XmFreetagsService xmFreetagsService;
	@Resource(name="xmFreetagsService")
	public void setXmFreetagsService(XmFreetagsService xmFreetagsService) {
		this.xmFreetagsService = xmFreetagsService;
	}

	@RequestMapping(value = "/getCondition")
	@ResponseBody
	public String getCondition(){
		
		List<ComboTree> cbos = new ArrayList<ComboTree>();
		
		ComboTree all = new ComboTree();
		all.setId("0");
		all.setText("所有客户");
		cbos.add(all);
		
		ComboTree  myaccount = new ComboTree();
		myaccount.setId("-1");
		myaccount.setText("我的客户");
		cbos.add(myaccount);
		
		ComboTree  mycreate = new ComboTree();
		mycreate.setId("-2");
		mycreate.setText("我创建的客户");
		cbos.add(mycreate);
		
		ComboTree  mybranch = new ComboTree();
		mybranch.setId("-3");
		mybranch.setText("下属的客户");
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
					u.setText(users.get(j).getUserName());
					u.setIconCls("icon-user");
					childs.add(u);
				}
			}
			group.setChildren(childs);
			cbos.add(group);
		}
		
		return JSON.toJSONString(cbos);
	}
	
	
	/**
	 * 营销活动 - 相关信息，得到用户
	 * 
	 * @param campaignid
	 * @return
	 */
	@RequestMapping(value = "/getCampaignAccount")
	@ResponseBody
	public String getCampaignAccount(int campaignid,int page,int rows){
		
		ListBean bean = new ListBean();
		
		int total = this.xmAccountService.getTotalAccount(campaignid);
		List<XmAccount> accounts = this.xmAccountService.getAccount(campaignid,page,rows);
		bean.setTotal(total);
		bean.setRows(accounts);
		
		return JSON.toJSONString(bean);
	}
	
	/**
	 * 营销活动 - 相关信息，用户列表
	 * 
	 * @param campaignid
	 * @return
	 */
	@RequestMapping(value = "/related/campaign")
	public String getAccountForCampaign(int campaignid,ModelMap modelMap){
		List<XmAccount> exists = this.xmAccountService.getAccountsExist(campaignid);
		String existsstr = "";
		for(int i=0;i<exists.size();i++){
			if(i==0){
				existsstr +=exists.get(i).getAccountid();
			}else{
				existsstr +=","+exists.get(i).getAccountid();
			}
		}
		modelMap.addAttribute("exists",existsstr);
		modelMap.addAttribute("campaignid",campaignid);
		ActionUtil.showList("Accounts", modelMap, this.moduleUtil);
		return "module/accounts/related/campaign";
	}
	
	@RequestMapping(value = "/related/campaignAccountAdd")
	@ResponseBody
	public String addAccountForCampaign(int campaignid,String selects){
		String[] sels = selects.split(",");
		for(int i=0;i<sels.length;i++){
			XmCampaignaccountrel rel = new XmCampaignaccountrel();
			rel.setAccountid(Integer.parseInt(sels[i]));
			rel.setCampaignid(campaignid);
			this.xmCampaignaccountrelService.insert(rel);
		}
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("客户添加成功！");
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/related/campaignAccountdelete")
	@ResponseBody
	public String deletedAccountForCampaign(int campaignid,String selects){
		this.xmCampaignaccountrelService.delete(campaignid,selects);
		Message msg = new Message();
		msg.setType(true);
		msg.setMessage("客户删除成功！");
		return JSON.toJSONString(msg);
	}
	
	@RequestMapping(value = "/showedit")
	public String showedit(int recordid,String module,int ptb,ModelMap modelmap){
		
		this.actionCls.showEdit(ptb, module, modelmap,recordid);
		
		return "module/accounts/edit";
	}
	
	@RequestMapping(value = "/view")
	public String view(int recordid,String module,int ptb,ModelMap modelmap){
		
		XmTab tab = CustomViewUtil.getTabByName(module);
		this.actionCls.showView(ptb, module, modelmap,recordid,tab);
		this.actionCls.setRelatedlist(tab, modelmap);
		List<XmFreetags> freetags = this.xmFreetagsService.getModuleTags(module,recordid); 
		modelmap.addAttribute("freetags",freetags);
		
		return "module/accounts/view";
	}
	
	
	
}
