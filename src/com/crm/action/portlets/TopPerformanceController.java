package com.crm.action.portlets;

import java.util.Calendar;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.crm.portlets.TopPerformance;
import com.crm.service.module.XmAccountService;
import com.crm.service.module.XmNoteService;
import com.crm.service.module.XmPotentialService;
import com.crm.service.module.XmSalesorderService;
import com.crm.service.portlets.XmGathersService;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.time.TimeGet;

@Controller
@SessionAttributes(Constant.USERPERMISSION)
@RequestMapping(value = "crm/portlets/top_performance")
public class TopPerformanceController {

	XmAccountService xmAccountService;
	@Resource(name = "xmAccountService")
	public void setXmAccountService(XmAccountService xmAccountService) {
		this.xmAccountService = xmAccountService;
	}

	XmNoteService xmNoteService;
	@Resource(name = "xmNoteService")
	public void setXmNoteService(XmNoteService xmNoteService) {
		this.xmNoteService = xmNoteService;
	}

	XmPotentialService xmPotentialService;
	@Resource(name = "xmPotentialService")
	public void setXmPotentialService(XmPotentialService xmPotentialService) {
		this.xmPotentialService = xmPotentialService;
	}

	XmSalesorderService xmSalesorderService;
	@Resource(name = "xmSalesorderService")
	public void setXmSalesorderService(XmSalesorderService xmSalesorderService) {
		this.xmSalesorderService = xmSalesorderService;
	}

	XmGathersService xmGathersService;
	@Resource(name = "com.crm.service.portlets.impl.xmGathersService")
	public void setXmGathersService(XmGathersService xmGathersService) {
		this.xmGathersService = xmGathersService;
	}

	@RequestMapping(value = "/index")
	public String index(ModelMap modelMap) {
		return "portlets/topperformance";
	}

	@RequestMapping(value = "/getJson")
	@ResponseBody
	public String getJson(
			@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission) {

		TimeGet tg = new TimeGet();

		Calendar calendar = Calendar.getInstance();

		String start = tg.getDefaultDay();
		String end = DateUtil.format(calendar.getTime(),
				DateUtil.C_DATE_PATTON_DEFAULT);

		// 新客户
		int newaccount = this.xmAccountService.getNewAccountOfUserAndLast(
				userPermission.getUser().getId(), start, end);
		int newnote = this.xmNoteService.getNoteOfUserAndLast(userPermission
				.getUser().getId(), start, end);
		int newpotential = this.xmPotentialService.getPotentialOfUserAndLast(
				userPermission.getUser().getId(), start, end);
		int newsalesorder = this.xmSalesorderService.getSaleOrderOfUserAndLast(
				userPermission.getUser().getId(), start, end);
		String sumoforder = this.xmSalesorderService
				.getSumOfOrderByUserAndLast(userPermission.getUser().getId(),
						start, end);
		String sumofgather = this.xmGathersService.getSumOfGatherByUserAndLast(
				userPermission.getUser().getId(), start, end);

		TopPerformance performance = new TopPerformance();
		performance.setNewaccount(newaccount);
		performance.setNewnote(newnote);
		performance.setNewpotential(newpotential);
		performance.setNewsalesorder(newsalesorder);
		performance.setSumofgather(sumofgather == null ? 0 + "" : sumofgather);
		performance.setSumoforder(sumoforder == null ? 0 + "" : sumoforder);

		return JSON.toJSONString(performance);
	}

}
