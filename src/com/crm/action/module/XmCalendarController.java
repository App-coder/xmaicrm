package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.crm.action.BaseController;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.Message;
import com.crm.bean.crm.UserPermission;
import com.crm.bean.crm.module.calendar.Event;
import com.crm.bean.easyui.ComboTree;
import com.crm.model.XmActivity;
import com.crm.model.XmActivityReminder;
import com.crm.model.XmGroups;
import com.crm.model.XmInvitees;
import com.crm.model.XmRecurringevents;
import com.crm.model.XmSeactivityrel;
import com.crm.model.XmTab;
import com.crm.model.XmUsers;
import com.crm.service.XmActivityReminderService;
import com.crm.service.XmFreetagsService;
import com.crm.service.XmInviteesService;
import com.crm.service.XmSeactivityrelService;
import com.crm.service.module.XmActivityService;
import com.crm.service.module.XmRecurringeventsService;
import com.crm.service.settings.basic.XmGroupsService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ActionUtil;
import com.crm.util.Constant;
import com.crm.util.DateUtil;
import com.crm.util.MathUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CalendarUtil;
import com.crm.util.crm.CustomViewUtil;

/**
 * 
 * 日程安排
 * 
 * User: zhujun
 * Date: 2012-8-25
 * Time: 上午10:13:17
 */
@Controller
@RequestMapping(value = "crm/module/calendar")
public class XmCalendarController extends BaseController{
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		return "forward:/crm/module/events/index";
	}
}
