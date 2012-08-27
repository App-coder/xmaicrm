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
import com.crm.action.util.ModuleUtil;
import com.crm.bean.easyui.ComboTree;
import com.crm.model.XmGroups;
import com.crm.model.XmUsers;
import com.crm.service.settings.basic.XmGroupsService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ActionUtil;

/**
 * 
 * 日报
 * 
 * User: zhujun
 * Date: 2012-8-28
 * Time: 上午10:27:34
 */
@Controller
@RequestMapping(value = "crm/module/dailylogs")
public class XmDailylogsController {

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle2("Dailylogs", ptb, modelMap, this.moduleUtil);
		return "module/dailylogs/index";
	}
	
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
	
	@RequestMapping(value = "/getCondition")
	@ResponseBody
	public String getCondition(){
		
		List<ComboTree> cbos = new ArrayList<ComboTree>();
		
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
	
}
