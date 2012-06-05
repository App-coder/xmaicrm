package com.crm.action.settings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 业务规则
 * 
 * User: zhujun
 * Date: 2012-8-30
 * Time: 下午10:52:21
 */
@Controller
@RequestMapping(value = "workflow")
public class XmWorkflowController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap){
		return "settings/workflow";
	}
}
