package com.crm.util.crm;

import com.crm.bean.crm.module.calendar.Event;
import com.crm.model.XmActivity;

public class CalendarUtil {
	
	public static void setStyle(Event e,XmActivity a){
		
		//灰色
		if(a.getStatus().equals("尚未开始")){
			e.setBackgroundColor("#d2dbd8");
		}else if(a.getStatus().equals("处理中")){
			//绿色
			e.setBackgroundColor("#04fd96");
			
		}else if(a.getStatus().equals("暂停")){
			//黄色
			e.setBackgroundColor("#fafd04");
			
		}else if(a.getStatus().equals("已完成")){
			//橙色
			e.setBackgroundColor("#fdb404");
			
		}else if(a.getStatus().equals("延期")){
			//红色
			e.setBackgroundColor("#fd041b");
		}
	}
	
	
	
	
}
