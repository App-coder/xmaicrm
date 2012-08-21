package com.crm.action.module;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

@Controller
@RequestMapping(value = "crm/module/events")
@SessionAttributes(Constant.USERPERMISSION)
public class XmEventsController extends BaseController{

	XmFreetagsService xmFreetagsService;
	@Resource(name="xmFreetagsService")
	public void setXmFreetagsService(XmFreetagsService xmFreetagsService) {
		this.xmFreetagsService = xmFreetagsService;
	}
	
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
	
	XmInviteesService xmInviteesService;
	@Resource(name="xmInviteesService")
	public void setXmInviteesService(XmInviteesService xmInviteesService) {
		this.xmInviteesService = xmInviteesService;
	}
	
	XmActivityReminderService xmActivityReminderService;
	@Resource(name="xmActivityReminderService")
	public void setXmActivityReminderService(
			XmActivityReminderService xmActivityReminderService) {
		this.xmActivityReminderService = xmActivityReminderService;
	}
	
	XmRecurringeventsService xmRecurringeventsService;
	@Resource(name="com.crm.service.module.impl.xmRecurringeventsService")
	public void setXmRecurringeventsService(
			XmRecurringeventsService xmRecurringeventsService) {
		this.xmRecurringeventsService = xmRecurringeventsService;
	}

	@RequestMapping(value = "/index")
	public String index(int ptb,ModelMap modelMap) throws UnsupportedEncodingException{
		ActionUtil.setTitle("Events", ptb, modelMap, this.moduleUtil);
		modelMap.addAttribute("rd",MathUtil.getRd());
		
		this.setBar(new String[]{"scope","insert","edit","deleteRecord","batchUpdate","view","smowerUpdate"}, modelMap);
		
		return "module/calendar/index";
	}
	
	/**
	 * @param recordid
	 * @param module
	 * @param ptb
	 * @param modelmap
	 * @return
	 */
	@RequestMapping(value = "/showedit")
	public String showedit(int recordid,String module,int ptb,ModelMap modelmap){
		
		this.actionCls.showEdit(ptb, module, modelmap,recordid);
		
		//相关信息
		if(recordid!=0){
			
			XmSeactivityrel seactivityrel = this.xmSeactivityrelService.getRelAccount(recordid);
			modelmap.addAttribute("seactivityrel",seactivityrel);
			
			List<XmInvitees> invitees = this.xmInviteesService.getInvitees(recordid);
			List vitees = new ArrayList();
			for(int i=0;i<invitees.size();i++){
				vitees.add(invitees.get(i).getInviteeid());
			}
			modelmap.addAttribute("invitees",vitees);
			

			//相关信息 - 提醒
			List<XmActivityReminder> reminders = this.xmActivityReminderService.getActivityReminder(recordid);
			modelmap.addAttribute("reminders",reminders);
			
			if(reminders.size()>0){
				//提醒时间
				int reminderTime = reminders.get(0).getReminderTime();
				int recurringid = reminders.get(0).getRecurringid();
				
				modelmap.addAttribute("remindersTime",reminderTime);
				modelmap.addAttribute("recurring",recurringid==0?false:true);
				
				int re_day = reminderTime/3600;
				modelmap.addAttribute("re_day",re_day);
				int re_hour = (reminderTime-(re_day*3600))/60;
				modelmap.addAttribute("re_hour",re_hour);
				int re_min = reminderTime%60;
				modelmap.addAttribute("re_min",re_min);
				
				if(recurringid!=0){
					//存在重复日程
					XmRecurringevents rec = this.xmRecurringeventsService.getById(recurringid);
					modelmap.addAttribute("recurringtype",rec.getRecurringtype());
					modelmap.addAttribute("recurringinfo",rec.getRecurringinfo());
					
				}
				
			}
			
			
			
		}else{
			modelmap.addAttribute("invitees","[]");
		}
		
		
		return "module/calendar/edit";
	}
	
	XmSeactivityrelService xmSeactivityrelService;
	@Resource(name="xmSeactivityrelService")
	public void setXmSeactivityrelService(
			XmSeactivityrelService xmSeactivityrelService) {
		this.xmSeactivityrelService = xmSeactivityrelService;
	}


	@RequestMapping(value = "/viewcalendar")
	public String viewcalendar(ModelMap modelmap){
		return "module/calendar/viewcalendar";
	}
	
	@RequestMapping(value = "/view")
	public String view(int recordid,String module,int ptb,ModelMap modelmap){
		
		XmTab tab = CustomViewUtil.getTabByName(module);
		this.actionCls.showView(ptb, module, modelmap,recordid,tab);
		
		return "module/calendar/view";
	}
	
	
	@RequestMapping(value = "/edit")
	@ResponseBody
	public String edit(HttpServletRequest request,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		Message msg = new Message();
		Boolean res = false;
		
		int activityid = 0;
		//修改
		if(!request.getParameter("recordid").equals("0")&&request.getParameter("recordid")!=""){
			activityid = Integer.parseInt(request.getParameter("recordid"));
			res = this.actionCls.update(request,activityid);
			
		}else{
			activityid = this.xmActivityService.getMaxId()+1;
			res = this.actionCls.add(request,activityid,userPermission.getUser().getId());
		}
		
		//关联客户
		String relAccount = request.getParameter("rel_accountid");
		if(!"".equals(relAccount)&&relAccount!=null){
			this.xmSeactivityrelService.deleteRel(activityid);
			this.xmSeactivityrelService.insert(activityid,relAccount);
		}else{
			this.xmSeactivityrelService.deleteRel(activityid);
		}
		
		//关联同事
		String rel_invitees = request.getParameter("rel_invitees");
		if(!"".equals(rel_invitees)&&rel_invitees!=null){
			this.xmInviteesService.clearInvitees(activityid);
			this.xmInviteesService.insertList(activityid,rel_invitees);
		}else{
			this.xmInviteesService.clearInvitees(activityid);
		}
		
		//设置提醒
		String cfgreminders = request.getParameter("cfgreminders");
		if("1".equals(cfgreminders)){
			
			this.xmActivityReminderService.clearReminder(activityid);
			
			int re_day = Integer.parseInt(request.getParameter("re_day"));
			int re_hour = Integer.parseInt(request.getParameter("re_hour"));
			int re_min = Integer.parseInt(request.getParameter("re_min"));
			int remindtime = re_day*3600+re_hour*60+re_min;
			
			String recurring = request.getParameter("recurring");
			if("1".equals(recurring)){
				//设置重复
				String recType = request.getParameter("recType");
				if(recType.equals("Daily")){
					
					String date_start = request.getParameter("date_start");
					String due_date = request.getParameter("due_date");
					
					Date dt_start = DateUtil.parseDate(date_start);
					Calendar cal_dt = Calendar.getInstance();
					cal_dt.setTime(dt_start);
					
					Date du_date = DateUtil.parseDate(due_date);
					Calendar cal_du = Calendar.getInstance();
					cal_du.setTime(du_date);
					cal_du.add(Calendar.DAY_OF_YEAR, 1);
					
					while(!DateUtil.format(cal_dt.getTime(), DateUtil.C_DATE_PATTON_DEFAULT).equals(DateUtil.format(cal_du.getTime(), DateUtil.C_DATE_PATTON_DEFAULT))){
						
						//添加
						XmRecurringevents rec = new XmRecurringevents();
						rec.setActivityid(activityid);
						rec.setRecurringdate(cal_dt.getTime());
						rec.setRecurringfreq(1);
						rec.setRecurringinfo("Daily");
						rec.setRecurringtype("Daily");
						
						int recid = this.xmRecurringeventsService.insert(rec);
						
						XmActivityReminder ar = new XmActivityReminder();
						ar.setActivityId(activityid);
						ar.setRecurringid(recid);
						ar.setReminderSent(0);
						ar.setReminderTime(remindtime);
						
						this.xmActivityReminderService.insert(ar);
						
						cal_dt.add(Calendar.DAY_OF_YEAR, 1);
					}
					
				}else if(recType.equals("Weekly")){
					
					String date_start = request.getParameter("date_start");
					String due_date = request.getParameter("due_date");
					
					Date dt_start = DateUtil.parseDate(date_start);
					Calendar cal_dt = Calendar.getInstance();
					cal_dt.setTime(dt_start);
					
					Date du_date = DateUtil.parseDate(due_date);
					Calendar cal_du = Calendar.getInstance();
					cal_du.setTime(du_date);
					cal_du.add(Calendar.DAY_OF_YEAR, 1);						

					String[] recurringweeks = request.getParameterValues("recurring_week");
					HashMap wkmap = generateWeekMap(recurringweeks);
					StringBuffer recurringtypeinfo = new StringBuffer();
					recurringtypeinfo.append("Weekly");
					Iterator its = wkmap.keySet().iterator();
					while(its.hasNext()){
						recurringtypeinfo.append("::"+(Integer.parseInt(its.next().toString())-1));
					}
					
					
					while(!DateUtil.format(cal_dt.getTime(), DateUtil.C_DATE_PATTON_DEFAULT).equals(DateUtil.format(cal_du.getTime(), DateUtil.C_DATE_PATTON_DEFAULT))){
						
						if(wkmap.containsKey(cal_dt.get(Calendar.DAY_OF_WEEK))){
							//添加
							XmRecurringevents rec = new XmRecurringevents();
							rec.setActivityid(activityid);
							rec.setRecurringdate(cal_dt.getTime());
							rec.setRecurringfreq(1);
							rec.setRecurringinfo(recurringtypeinfo.toString());
							rec.setRecurringtype("Weekly");
							
							int recid = this.xmRecurringeventsService.insert(rec);
							
							XmActivityReminder ar = new XmActivityReminder();
							ar.setActivityId(activityid);
							ar.setRecurringid(recid);
							ar.setReminderSent(0);
							ar.setReminderTime(remindtime);
							
							this.xmActivityReminderService.insert(ar);
						}
						
						cal_dt.add(Calendar.DAY_OF_YEAR, 1);
					}
					
				}else if(recType.equals("Monthly")){
					
					String date_start = request.getParameter("date_start");
					String due_date = request.getParameter("due_date");
					
					Date dt_start = DateUtil.parseDate(date_start);
					Calendar cal_dt = Calendar.getInstance();
					cal_dt.setTime(dt_start);
					
					Date du_date = DateUtil.parseDate(due_date);
					Calendar cal_du = Calendar.getInstance();
					cal_du.setTime(du_date);
					cal_du.add(Calendar.DAY_OF_YEAR, 1);
					
					String recurringmonth = request.getParameter("month_day");
					List monthdays = generateMonthdays(cal_dt,cal_du,recurringmonth);
					
					if(monthdays.size()>0){
						for(int i=0;i<monthdays.size();i++){
							//添加
							XmRecurringevents rec = new XmRecurringevents();
							rec.setActivityid(activityid);
							rec.setRecurringdate(DateUtil.parseDate(monthdays.get(i).toString()));
							rec.setRecurringfreq(1);
							rec.setRecurringinfo("Monthly::date::"+recurringmonth);
							rec.setRecurringtype("Monthly");
							
							int recid = this.xmRecurringeventsService.insert(rec);
							
							XmActivityReminder ar = new XmActivityReminder();
							ar.setActivityId(activityid);
							ar.setRecurringid(recid);
							ar.setReminderSent(0);
							ar.setReminderTime(remindtime);
							
							this.xmActivityReminderService.insert(ar);
						}
					}
					
				}
				
			}else{
				//不设置重复
				XmActivityReminder ar = new XmActivityReminder();
				ar.setActivityId(activityid);
				ar.setRecurringid(0);
				ar.setReminderSent(0);
				ar.setReminderTime(remindtime);
				
				this.xmActivityReminderService.insert(ar);
			
			}
		}else{
			this.xmActivityReminderService.clearReminder(activityid);
		}
		
		if(res){
			msg.setMessage(activityid+"");
			msg.setType(true);
		}else{
			msg.setMessage(activityid+"");
			msg.setType(false);
		}
		return JSON.toJSONString(msg);
	}
	
	private List generateMonthdays(Calendar cal_dt, Calendar cal_du,
			String recurringmonth) {
		List monthdays = new ArrayList();
		
		Calendar recday = Calendar.getInstance();
		recday.setTime(cal_dt.getTime());
		recday.set(Calendar.DATE,Integer.parseInt(recurringmonth));
		
		if(recday.before(cal_du)){
			recday.add(Calendar.MONTH, 1);
			recday.set(Calendar.DATE,Integer.parseInt(recurringmonth));
			
			while(recday.after(cal_dt)&&recday.before(cal_du)){
				monthdays.add(DateUtil.format(recday.getTime(),DateUtil.C_DATE_PATTON_DEFAULT));
				recday.add(Calendar.MONTH, 1);
				recday.set(Calendar.DATE,Integer.parseInt(recurringmonth));
			}
		}
		
		return monthdays;
	}

	public HashMap generateWeekMap(String[] wklist){
		
		HashMap wkmap = new HashMap();
		
		HashMap wkhm = new HashMap();
		wkhm.put("sunday",1);
		wkhm.put("monday",2);
		wkhm.put("tuesday",3);
		wkhm.put("wednesday",4);
		wkhm.put("thursday",5);
		wkhm.put("friday",6);
		wkhm.put("saturday",7);
		
		for(int i=0;i<wklist.length;i++){
			wkmap.put(wkhm.get(wklist[i]), wklist[i]);
		}
		return wkmap;
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
	public String getEvent(String start,String end,ModelMap modelmap,String smowner,HttpServletRequest request,@ModelAttribute(Constant.USERPERMISSION) UserPermission userPermission){
		List<Event> events = new ArrayList<Event>();
		//默认视图是天，得到当天的事件
		List<XmActivity> activitys = this.xmActivityService.getActivity(start,end,smowner,userPermission);
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
