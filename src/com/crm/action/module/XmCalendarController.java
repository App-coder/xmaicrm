package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.crm.action.util.ModuleUtil;
import com.crm.bean.crm.module.calendar.Event;
import com.crm.bean.easyui.ComboTree;
import com.crm.model.XmActivity;
import com.crm.model.XmGroups;
import com.crm.model.XmUsers;
import com.crm.service.module.XmActivityService;
import com.crm.service.settings.basic.XmGroupsService;
import com.crm.service.settings.basic.XmUsersService;
import com.crm.util.ActionUtil;
import com.crm.util.DateUtil;
import com.crm.util.MathUtil;
import com.crm.util.actionutil.ActionCls;
import com.crm.util.crm.CalendarUtil;

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
public class XmCalendarController {
	
	XmActivityService xmActivityService;
	@Resource(name="xmActivityService")
	public void setXmActivityService(XmActivityService xmActivityService) {
		this.xmActivityService = xmActivityService;
	}

	ActionCls actionCls;
	@Resource(name="actionCls")
	public void setActionCls(ActionCls actionCls) {
		this.actionCls = actionCls;
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

	ModuleUtil moduleUtil;
	@Resource(name = "moduleUtil")
	public void setModuleUtil(ModuleUtil moduleUtil) {
		this.moduleUtil = moduleUtil;
	}
	
	
	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle("Events", ptb, modelMap, this.moduleUtil);
		modelMap.addAttribute("rd",MathUtil.getRd());
		return "module/calendar/index";
	}
	
	@RequestMapping(value = "/showedit")
	public String showedit(int recordid,String module,int ptb,ModelMap modelmap){
		
		this.actionCls.showEdit(ptb, module, modelmap,recordid);
		
		return "module/calendar/edit";
	}
	
	@RequestMapping(value = "/view")
	public String view(ModelMap modelmap){
		
//		List<Event> events = new ArrayList<Event>();
//		//默认视图是天，得到当天的事件
//		List<XmActivity> activitys = this.xmActivityService.getDayActivity();
//		if(activitys.size()>0){
//			for(int i=0;i<activitys.size();i++){
//				Event e = new Event();
//				e.setId(activitys.get(i).getAccountid()+"");
//				e.setTitle(activitys.get(i).getSubject());
//				e.setStart( DateUtil.getDateFromDayAndTime(DateUtil.format(activitys.get(i).getDateStart(),DateUtil.C_DATE_PATTON_DEFAULT), activitys.get(i).getTimeStart()));
//				e.setEnd(DateUtil.getDateFromDayAndTime(DateUtil.format(activitys.get(i).getDueDate(),DateUtil.C_DATE_PATTON_DEFAULT), activitys.get(i).getTimeEnd()));
//				if(activitys.get(i).getStatus() == ""){
//					CalendarUtil.setStyle(e, activitys.get(i));
//				}
//				events.add(e);
//			}
//		}
//		modelmap.addAttribute("events",JSON.toJSONStringWithDateFormat(events, DateUtil.C_TIME_PATTON_DEFAULT));
		
		return "module/calendar/view";
	}
	
	/**
	 * 
	 * 根据开始时间和结束时间取得事件
	 * 
	 * @param start 开始时间
	 * @param end 结束时间
	 * @return
	 */
	@RequestMapping(value = "/getEvent")
	@ResponseBody
	public String getEvent(String start,String end,ModelMap modelmap){
		List<Event> events = new ArrayList<Event>();
		//默认视图是天，得到当天的事件
		List<XmActivity> activitys = this.xmActivityService.getActivity(start,end);
		if(activitys.size()>0){
			for(int i=0;i<activitys.size();i++){
				Event e = new Event();
				e.setId(activitys.get(i).getAccountid()+"");
				e.setTitle(activitys.get(i).getSubject());
				e.setStart( DateUtil.getDateFromDayAndTime(DateUtil.format(activitys.get(i).getDateStart(),DateUtil.C_DATE_PATTON_DEFAULT), activitys.get(i).getTimeStart()));
				e.setEnd(DateUtil.getDateFromDayAndTime(DateUtil.format(activitys.get(i).getDueDate(),DateUtil.C_DATE_PATTON_DEFAULT), activitys.get(i).getTimeEnd()));
				if(activitys.get(i).getStatus() == ""){
					CalendarUtil.setStyle(e, activitys.get(i));
				}
				events.add(e);
			}
		}
		
		return JSON.toJSONStringWithDateFormat(events, DateUtil.C_TIME_PATTON_DEFAULT);
	}
	
	/**
	 * 周报参考
	 * 
	 * @return
	 */
	@RequestMapping(value = "/week")
	public String week(){
		return "module/calendar/weeklylogs/week";
	}
	
	
	/**
	 * 月报参考
	 * 
	 * @return
	 */
	@RequestMapping(value = "/month")
	public String month(){
		return "module/calendar/monthlylogs/month";
	}
	
	@RequestMapping(value = "/getCondition")
	@ResponseBody
	public String getCondition(){
		
		List<ComboTree> cbos = new ArrayList<ComboTree>();
		
		ComboTree all = new ComboTree();
		all.setId("0");
		all.setText("所有日程安排");
		cbos.add(all);
		
		ComboTree  myaccount = new ComboTree();
		myaccount.setId("-1");
		myaccount.setText("我的日程安排");
		cbos.add(myaccount);
		
		ComboTree  mycreate = new ComboTree();
		mycreate.setId("-2");
		mycreate.setText("我创建的日程安排");
		cbos.add(mycreate);
		
		ComboTree  mybranch = new ComboTree();
		mybranch.setId("-3");
		mybranch.setText("下属的日程安排");
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
