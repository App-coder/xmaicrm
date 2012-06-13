package com.crm.action.settings.other;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.action.BaseController;
/**
 * 
 * 其他设置-数据库备份
 * 
 * User: zhujun
 * Date: 2012-8-19
 * Time: 上午10:54:14
 */
@Controller
@RequestMapping(value = "crm/settings/dbbackup")
public class XmDbbackupController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/other/dbbackup";
	}
	
	/**
	 * 获取备份的列表
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(){
		return "";
	}
	
	/**
	 * 进行备份操作
	 * @return
	 */
	@RequestMapping(value = "/bak", method = RequestMethod.GET)
	@ResponseBody
	public String bak(){
		return "";
	}
	
}
