package com.crm.action.portlets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crm.bean.crm.UserPermission;
import com.crm.bean.crm.portlets.UserSalesbymonth;
import com.crm.service.portlets.XmSalesorderService;
import com.crm.util.Constant;

/**
 * 
 * 本人最近6个月销售情况
 * 
 * User: zhujun
 * Date: 2012-8-9
 * Time: 下午2:20:45
 */
@Controller
@RequestMapping(value = "crm/portlets/user_salesbymonth")
@SessionAttributes(Constant.USERPERMISSION)
public class UserSalesbymonthController {
	
	XmSalesorderService xmSalesorderService;
	@Resource(name="xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}


	@RequestMapping(value = "/getXml")
	@ResponseBody
	public String getXml(@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		
		List<UserSalesbymonth> usm = this.xmSalesorderService.getUserSalesbymonth(userPermission.getUser().getId());
		
		return "";
	}
	
	
}
