package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.easyui.ComboTree;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmGroups;
import com.crm.model.XmUsers;
import com.crm.service.module.XmNormaltasksService;
import com.crm.service.settings.basic.XmGroupsService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ActionUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/**
 * 
 * 客户任务
 * 
 * User: zhujun
 * Date: 2012-8-4
 * Time: 下午2:34:11
 */
@Controller
@SessionAttributes({Constant.USERPERMISSION})
@RequestMapping(value = "crm/module/normaltasks")
public class XmNormaltasksController {

	XmNormaltasksService xmNormaltasksService;
	@Resource(name="xmNormaltasksService")
	public void setXmNormaltasksService(XmNormaltasksService xmNormaltasksService) {
		this.xmNormaltasksService = xmNormaltasksService;
	}

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
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

	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission) throws UnsupportedEncodingException{
		ActionUtil.setTitle2("Normaltasks", ptb, modelMap, this.moduleUtil);
		
		int notdo = this.xmNormaltasksService.getCountByStatus(0);
		modelMap.addAttribute("notdo",notdo);
		int finished = this.xmNormaltasksService.getCountByStatus(1);
		modelMap.addAttribute("finished",finished);
		int follow = this.xmNormaltasksService.getCountByStatus(2);
		modelMap.addAttribute("follow",follow);
		int change = this.xmNormaltasksService.getCountByStatus(3);
		modelMap.addAttribute("change",change);
		int overtime = this.xmNormaltasksService.getCountOfOverTime();
		modelMap.addAttribute("overtime",overtime);
		int outtimefinished = this.xmNormaltasksService.getCountOfOutTimeFinished();
		modelMap.addAttribute("outtimefinished",outtimefinished);
		int rollout = this.xmNormaltasksService.getCountOfRollOut();
		modelMap.addAttribute("rollout",rollout);
		
		return "module/normaltasks/index";
	}
	
	@RequestMapping(value = "/loadList")
	@ResponseBody
	public String loadList(int page, int rows,int taskstatus){
		ListBean bean = new ListBean();
		if(taskstatus == 0){
			bean.setTotal(this.xmNormaltasksService.getCountByStatus(0));
			bean.setRows(this.xmNormaltasksService.loadListNotDo(page,rows));
		}else if(taskstatus == 2){
			bean.setTotal(this.xmNormaltasksService.getCountByStatus(2));
			bean.setRows(this.xmNormaltasksService.loadListFollow(page,rows));
		}else if(taskstatus == 3){
			bean.setTotal(this.xmNormaltasksService.getCountByStatus(3));
			bean.setRows(this.xmNormaltasksService.loadListChange(page,rows));
		}else if(taskstatus == 5){
			//已经过期
			bean.setTotal(this.xmNormaltasksService.getCountOfOverTime());
			bean.setRows(this.xmNormaltasksService.loadListOverTime(page,rows));
		}else if(taskstatus == 1){
			//已经完成
			bean.setTotal(this.xmNormaltasksService.getCountByStatus(1));
			bean.setRows(this.xmNormaltasksService.loadListFinished(page,rows));
		}else if(taskstatus== 6){
			//过期完成
			bean.setTotal(this.xmNormaltasksService.getCountOfOutTimeFinished());
			bean.setRows(this.xmNormaltasksService.loadListOutTimeFinished(page,rows));
		}else if(taskstatus == 7){
			bean.setTotal(this.xmNormaltasksService.getCountOfRollOut());
			bean.setRows(this.xmNormaltasksService.loadListRollOut(page,rows));			
		}
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
	}
			
	@RequestMapping(value = "/getCondition")
	@ResponseBody
	public String getCondition(){
		
		List<ComboTree> cbos = new ArrayList<ComboTree>();
		
		ComboTree all = new ComboTree();
		all.setId("0");
		all.setText("所有客户任务");
		cbos.add(all);
		
		ComboTree  myaccount = new ComboTree();
		myaccount.setId("-1");
		myaccount.setText("我的客户任务");
		cbos.add(myaccount);
		
		ComboTree  mycreate = new ComboTree();
		mycreate.setId("-2");
		mycreate.setText("我创建的客户任务");
		cbos.add(mycreate);
		
		ComboTree  mybranch = new ComboTree();
		mybranch.setId("-3");
		mybranch.setText("下属的客户任务");
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
