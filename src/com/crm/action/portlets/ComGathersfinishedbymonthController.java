package com.crm.action.portlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公司最近6个月回款任务完成情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午5:23:39
 */
@Controller
@RequestMapping(value = "crm/portlets/com_gathersfinishedbymonth")
public class ComGathersfinishedbymonthController {

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/comgathersfinishedbymonth";
	}
	
}
