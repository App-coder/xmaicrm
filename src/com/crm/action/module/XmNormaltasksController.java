package com.crm.action.module;

import java.io.UnsupportedEncodingException;

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
import com.crm.bean.easyui.ListBean;
import com.crm.service.module.XmNormaltasksService;
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
			
	
	
}
