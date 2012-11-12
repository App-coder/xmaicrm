package com.crm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.easyui.ListBean;
import com.crm.model.XmSendsmsbox;
import com.crm.model.XmUsers;
import com.crm.service.XmSendsmsboxService;
import com.crm.util.Constant;
import com.crm.util.DateUtil;

/** 
 *
 * 手机短信
 * 
 * User: zhujun
 * Date: 2012-8-6
 * Time: 下午10:39:37
 */
@Controller
@RequestMapping(value = "crm/sendsmsbox")
@SessionAttributes(Constant.USER)
public class XmSendsmsboxController {
	
	XmSendsmsboxService xmSendsmsboxService;
	@Resource(name="xmSendsmsboxService")
	public void setXmSendsmsboxService(XmSendsmsboxService xmSendsmsboxService) {
		this.xmSendsmsboxService = xmSendsmsboxService;
	}


	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public String list(@RequestParam("page") int page,@RequestParam("rows") int rows,@ModelAttribute(Constant.USER) XmUsers user){
		
		int total = this.xmSendsmsboxService.getTotal(user.getId());
		List<XmSendsmsbox> sendsms = this.xmSendsmsboxService.loadList(page,rows,user.getId());
		ListBean bean = new ListBean();
		bean.setRows(sendsms);
		bean.setTotal(total);
		
		return JSON.toJSONStringWithDateFormat(bean,DateUtil.C_DATE_PATTON_DEFAULT);
	}
	
}
