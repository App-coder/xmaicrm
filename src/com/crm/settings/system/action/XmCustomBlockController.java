package com.crm.settings.system.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
import com.crm.bean.crm.Message;
import com.crm.model.XmBlocks;
import com.crm.settings.system.service.XmCustomBlockService;

/**
 * 系统定制-显示区域
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:30:12
 */
@Controller
@RequestMapping(value = "settings/customblock")
public class XmCustomBlockController extends BaseController {
	
	@Autowired
	XmCustomBlockService xmCustomBlockService;
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/system/customblock";
	}
	
	@RequestMapping(value = "/getBlockList", method = RequestMethod.GET)
	@ResponseBody
	public String getBlockList(ModelMap modelMap){
		List<Object> list=this.xmCustomBlockService.getBlockList();
		return arrayToJson(list);
	}
	
	@RequestMapping(value="/getFieldBlocksByTabId",method=RequestMethod.POST)
	@ResponseBody
	public String getFieldBlocksByTabId(ModelMap modelMap,int tabid,int page,int rows){
		List<XmBlocks> list=this.xmCustomBlockService.getFieldBlocksByTabId(tabid,page,rows);
		return arrayToJson(list);
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
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
}
