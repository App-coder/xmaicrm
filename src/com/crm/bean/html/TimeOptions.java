package com.crm.bean.html;

import java.util.Calendar;
import com.crm.util.time.TimeGet;

public class TimeOptions {

	//上财年
	String start_prevfy;
	String end_prevfy;
	
	//本财年
	String start_thisfy;
	String end_thisfy;
	
	//下财年
	String start_nextfy;
	String end_nextfy;
	
	//上季度
	String start_prevfq;
	String end_prevfq;
	
	//本季度
	String start_thisfq;
	String end_thisfq;
	
	//下季度
	String start_nextfq;
	String end_nextfq;
	
	//昨天
	String start_yesterday;
	String end_yesterday;
	
	//今天
	String start_today;
	String end_today;
	
	String start_tomorrow;
	String end_tomorrow;
	
	//上星期
	String start_lastweek;
	String end_lastweek;
	
	//本星期
	String start_thisweek;
	String end_thisweek;
	
	//下星期
	String start_nextweek;
	String end_nextweek;
	
	//上个月
	String start_lastmonth;
	String end_lastmonth;
	
	//这个月
	String start_thismonth;
	String end_thismonth;
	
	//下个月
	String start_nextmonth;
	String end_nextmonth;
	
	//3天前
	String start_before3days = "1900-01-01";
	String end_before3days;
	
	//7天前
	String start_before7days = "1900-01-01";
	String end_before7days;
	
	String start_before15days = "1900-01-01";
	String end_before15days;
	
	String start_before30days = "1900-01-01";
	String end_before30days ;
	
	String start_before60days = "1900-01-01";
	String end_before60days;
	
	String start_before100days = "1900-01-01";
	String end_before100days;
	
	String start_before180days = "1900-01-01";
	String end_before180days ;
	
	String start_after3days;
	String end_after3days = new TimeGet().getFuture(100);
	
	String start_after7days;
	String end_after7days= new TimeGet().getFuture(100);
	
	String start_after15days;
	String end_after15days= new TimeGet().getFuture(100);
	
	String start_after30days;
	String end_after30days= new TimeGet().getFuture(100);
	
	String start_after60days;
	String end_after60days= new TimeGet().getFuture(100);
	
	String start_after100days;
	String end_after100days= new TimeGet().getFuture(100);
	
	String start_after180days;
	String end_after180days= new TimeGet().getFuture(100);
	
	String start_last3days= new TimeGet().getTime(-3);
	String end_last3days = new TimeGet().getToday();
	
	String start_last7days = new TimeGet().getTime(-7);
	String end_last7days= new TimeGet().getToday();
	
	String start_last15days = new TimeGet().getTime(-15);
	String end_last15days= new TimeGet().getToday();
	
	String start_last30days = new TimeGet().getTime(-30);
	String end_last30days= new TimeGet().getToday();
	
	String start_last60days = new TimeGet().getTime(-60);
	String end_last60days= new TimeGet().getToday();
	
	String start_last90days = new TimeGet().getTime(-90);
	String end_last90days= new TimeGet().getToday();
	
	String start_last180days = new TimeGet().getTime(-180);
	String end_last180days= new TimeGet().getToday();
	
	String start_next3days = new TimeGet().getToday(); 
	String end_next3days = new TimeGet().getTime(3);
	
	String start_next7days = new TimeGet().getToday(); 
	String end_next7days= new TimeGet().getTime(7);
	
	String start_next15days = new TimeGet().getToday(); 
	String end_next15days = new TimeGet().getTime(15);
	
	String start_next30days = new TimeGet().getToday(); 
	String end_next30days = new TimeGet().getTime(30);
	
	String start_next60days = new TimeGet().getToday(); 
	String end_next60days = new TimeGet().getTime(60);
	
	String start_next90days = new TimeGet().getToday(); 
	String end_next90days = new TimeGet().getTime(90);
	
	String start_next180days = new TimeGet().getToday(); 
	String end_next180days = new TimeGet().getTime(180);
	
	public TimeOptions() {
		Calendar c_now = Calendar.getInstance();
		TimeGet tt = new TimeGet();
		
		start_prevfy = tt.getPreviousYearFirst();
		end_prevfy = tt.getPreviousYearEnd();
		
		start_thisfy = tt.getCurrentYearFirst();
		end_thisfy = tt.getCurrentYearEnd();
		
		start_nextfy = tt.getNextYearFirst();
		end_nextfy  = tt.getNextYearEnd();
	
		start_prevfq = tt.getPrevfqStartDay();
		end_prevfq = tt.getPrevfqEndDay();
		
		String thisfq = tt.getThisSeasonTime(c_now.MONTH);
		start_thisfq = thisfq.split(";")[0];
		end_thisfq = thisfq.split(";")[1];
		
		start_nextfq = tt.getNextfqStartDay();
		end_nextfq = tt.getNextfqEndDay();
		
		start_yesterday = tt.getYesterday();
		end_yesterday = tt.getYesterday();
				
		start_today = tt.getToday();
		end_today = tt.getToday();
		
		start_tomorrow = tt.getTomorrow();
		end_tomorrow = tt.getTomorrow();
		
		start_lastweek =tt.getPreviousWeekday();
		end_lastweek = tt.getPreviousWeekSunday();
		
		start_thisweek = tt.getMondayOFWeek();
		end_thisweek = tt.getCurrentWeekday();
		
		start_nextweek = tt.getNextMonday();
		end_nextweek = tt.getNextSunday();
		
		start_lastmonth =  tt.getPreviousMonthFirst();
		end_lastmonth =  tt.getPreviousMonthEnd();
		
		start_thismonth = tt.getFirstDayOfMonth();
		end_thismonth = tt.getDefaultDay();
		
		start_nextmonth = tt.getNextMonthFirst();
		end_nextmonth = tt.getNextMonthEnd();
		
		end_before3days = tt.getTime(-3);
		
		end_before7days = tt.getTime(-7);
		
		end_before15days = tt.getTime(-15);
		
		end_before30days = tt.getTime(-30);
		
		end_before60days = tt.getTime(-60);
		
		end_before100days = tt.getTime(-100);
		
		end_before180days = tt.getTime(-180);
		
		start_after3days = tt.getTime(3);
		
		start_after7days = tt.getTime(7);
		
		start_after15days = tt.getTime(15);
		
		start_after30days = tt.getTime(30);
		
		start_after60days = tt.getTime(60);
		
		start_after100days = tt.getTime(100);
		
		start_after180days = tt.getTime(180);
		
	}
	
	
	
	public String getStart_prevfy() {
		return start_prevfy;
	}



	public void setStart_prevfy(String start_prevfy) {
		this.start_prevfy = start_prevfy;
	}



	public String getEnd_prevfy() {
		return end_prevfy;
	}



	public void setEnd_prevfy(String end_prevfy) {
		this.end_prevfy = end_prevfy;
	}



	public String getStart_thisfy() {
		return start_thisfy;
	}



	public void setStart_thisfy(String start_thisfy) {
		this.start_thisfy = start_thisfy;
	}



	public String getEnd_thisfy() {
		return end_thisfy;
	}



	public void setEnd_thisfy(String end_thisfy) {
		this.end_thisfy = end_thisfy;
	}



	public String getStart_nextfy() {
		return start_nextfy;
	}



	public void setStart_nextfy(String start_nextfy) {
		this.start_nextfy = start_nextfy;
	}



	public String getEnd_nextfy() {
		return end_nextfy;
	}



	public void setEnd_nextfy(String end_nextfy) {
		this.end_nextfy = end_nextfy;
	}



	public String getStart_prevfq() {
		return start_prevfq;
	}



	public void setStart_prevfq(String start_prevfq) {
		this.start_prevfq = start_prevfq;
	}



	public String getEnd_prevfq() {
		return end_prevfq;
	}



	public void setEnd_prevfq(String end_prevfq) {
		this.end_prevfq = end_prevfq;
	}



	public String getStart_thisfq() {
		return start_thisfq;
	}



	public void setStart_thisfq(String start_thisfq) {
		this.start_thisfq = start_thisfq;
	}



	public String getEnd_thisfq() {
		return end_thisfq;
	}



	public void setEnd_thisfq(String end_thisfq) {
		this.end_thisfq = end_thisfq;
	}



	public String getStart_nextfq() {
		return start_nextfq;
	}



	public void setStart_nextfq(String start_nextfq) {
		this.start_nextfq = start_nextfq;
	}



	public String getEnd_nextfq() {
		return end_nextfq;
	}



	public void setEnd_nextfq(String end_nextfq) {
		this.end_nextfq = end_nextfq;
	}



	public String getStart_yesterday() {
		return start_yesterday;
	}



	public void setStart_yesterday(String start_yesterday) {
		this.start_yesterday = start_yesterday;
	}



	public String getEnd_yesterday() {
		return end_yesterday;
	}



	public void setEnd_yesterday(String end_yesterday) {
		this.end_yesterday = end_yesterday;
	}



	public String getStart_today() {
		return start_today;
	}



	public void setStart_today(String start_today) {
		this.start_today = start_today;
	}



	public String getEnd_today() {
		return end_today;
	}



	public void setEnd_today(String end_today) {
		this.end_today = end_today;
	}



	public String getStart_tomorrow() {
		return start_tomorrow;
	}



	public void setStart_tomorrow(String start_tomorrow) {
		this.start_tomorrow = start_tomorrow;
	}



	public String getEnd_tomorrow() {
		return end_tomorrow;
	}



	public void setEnd_tomorrow(String end_tomorrow) {
		this.end_tomorrow = end_tomorrow;
	}



	public String getStart_lastweek() {
		return start_lastweek;
	}



	public void setStart_lastweek(String start_lastweek) {
		this.start_lastweek = start_lastweek;
	}



	public String getEnd_lastweek() {
		return end_lastweek;
	}



	public void setEnd_lastweek(String end_lastweek) {
		this.end_lastweek = end_lastweek;
	}



	public String getStart_thisweek() {
		return start_thisweek;
	}



	public void setStart_thisweek(String start_thisweek) {
		this.start_thisweek = start_thisweek;
	}



	public String getEnd_thisweek() {
		return end_thisweek;
	}



	public void setEnd_thisweek(String end_thisweek) {
		this.end_thisweek = end_thisweek;
	}



	public String getStart_nextweek() {
		return start_nextweek;
	}



	public void setStart_nextweek(String start_nextweek) {
		this.start_nextweek = start_nextweek;
	}



	public String getEnd_nextweek() {
		return end_nextweek;
	}



	public void setEnd_nextweek(String end_nextweek) {
		this.end_nextweek = end_nextweek;
	}



	public String getStart_lastmonth() {
		return start_lastmonth;
	}



	public void setStart_lastmonth(String start_lastmonth) {
		this.start_lastmonth = start_lastmonth;
	}



	public String getEnd_lastmonth() {
		return end_lastmonth;
	}



	public void setEnd_lastmonth(String end_lastmonth) {
		this.end_lastmonth = end_lastmonth;
	}



	public String getStart_thismonth() {
		return start_thismonth;
	}



	public void setStart_thismonth(String start_thismonth) {
		this.start_thismonth = start_thismonth;
	}



	public String getEnd_thismonth() {
		return end_thismonth;
	}



	public void setEnd_thismonth(String end_thismonth) {
		this.end_thismonth = end_thismonth;
	}



	public String getStart_nextmonth() {
		return start_nextmonth;
	}



	public void setStart_nextmonth(String start_nextmonth) {
		this.start_nextmonth = start_nextmonth;
	}



	public String getEnd_nextmonth() {
		return end_nextmonth;
	}



	public void setEnd_nextmonth(String end_nextmonth) {
		this.end_nextmonth = end_nextmonth;
	}



	public String getStart_before3days() {
		return start_before3days;
	}



	public void setStart_before3days(String start_before3days) {
		this.start_before3days = start_before3days;
	}



	public String getEnd_before3days() {
		return end_before3days;
	}



	public void setEnd_before3days(String end_before3days) {
		this.end_before3days = end_before3days;
	}



	public String getStart_before7days() {
		return start_before7days;
	}



	public void setStart_before7days(String start_before7days) {
		this.start_before7days = start_before7days;
	}



	public String getEnd_before7days() {
		return end_before7days;
	}



	public void setEnd_before7days(String end_before7days) {
		this.end_before7days = end_before7days;
	}



	public String getStart_before15days() {
		return start_before15days;
	}



	public void setStart_before15days(String start_before15days) {
		this.start_before15days = start_before15days;
	}



	public String getEnd_before15days() {
		return end_before15days;
	}



	public void setEnd_before15days(String end_before15days) {
		this.end_before15days = end_before15days;
	}



	public String getStart_before30days() {
		return start_before30days;
	}



	public void setStart_before30days(String start_before30days) {
		this.start_before30days = start_before30days;
	}



	public String getEnd_before30days() {
		return end_before30days;
	}



	public void setEnd_before30days(String end_before30days) {
		this.end_before30days = end_before30days;
	}



	public String getStart_before60days() {
		return start_before60days;
	}



	public void setStart_before60days(String start_before60days) {
		this.start_before60days = start_before60days;
	}



	public String getEnd_before60days() {
		return end_before60days;
	}



	public void setEnd_before60days(String end_before60days) {
		this.end_before60days = end_before60days;
	}



	public String getStart_before100days() {
		return start_before100days;
	}



	public void setStart_before100days(String start_before100days) {
		this.start_before100days = start_before100days;
	}



	public String getEnd_before100days() {
		return end_before100days;
	}



	public void setEnd_before100days(String end_before100days) {
		this.end_before100days = end_before100days;
	}



	public String getStart_before180days() {
		return start_before180days;
	}



	public void setStart_before180days(String start_before180days) {
		this.start_before180days = start_before180days;
	}



	public String getEnd_before180days() {
		return end_before180days;
	}



	public void setEnd_before180days(String end_before180days) {
		this.end_before180days = end_before180days;
	}



	public String getStart_after3days() {
		return start_after3days;
	}



	public void setStart_after3days(String start_after3days) {
		this.start_after3days = start_after3days;
	}



	public String getEnd_after3days() {
		return end_after3days;
	}



	public void setEnd_after3days(String end_after3days) {
		this.end_after3days = end_after3days;
	}



	public String getStart_after7days() {
		return start_after7days;
	}



	public void setStart_after7days(String start_after7days) {
		this.start_after7days = start_after7days;
	}



	public String getEnd_after7days() {
		return end_after7days;
	}



	public void setEnd_after7days(String end_after7days) {
		this.end_after7days = end_after7days;
	}



	public String getStart_after15days() {
		return start_after15days;
	}



	public void setStart_after15days(String start_after15days) {
		this.start_after15days = start_after15days;
	}



	public String getEnd_after15days() {
		return end_after15days;
	}



	public void setEnd_after15days(String end_after15days) {
		this.end_after15days = end_after15days;
	}



	public String getStart_after30days() {
		return start_after30days;
	}



	public void setStart_after30days(String start_after30days) {
		this.start_after30days = start_after30days;
	}



	public String getEnd_after30days() {
		return end_after30days;
	}



	public void setEnd_after30days(String end_after30days) {
		this.end_after30days = end_after30days;
	}



	public String getStart_after60days() {
		return start_after60days;
	}



	public void setStart_after60days(String start_after60days) {
		this.start_after60days = start_after60days;
	}



	public String getEnd_after60days() {
		return end_after60days;
	}



	public void setEnd_after60days(String end_after60days) {
		this.end_after60days = end_after60days;
	}



	public String getStart_after100days() {
		return start_after100days;
	}



	public void setStart_after100days(String start_after100days) {
		this.start_after100days = start_after100days;
	}



	public String getEnd_after100days() {
		return end_after100days;
	}



	public void setEnd_after100days(String end_after100days) {
		this.end_after100days = end_after100days;
	}



	public String getStart_after180days() {
		return start_after180days;
	}



	public void setStart_after180days(String start_after180days) {
		this.start_after180days = start_after180days;
	}



	public String getEnd_after180days() {
		return end_after180days;
	}



	public void setEnd_after180days(String end_after180days) {
		this.end_after180days = end_after180days;
	}



	public String getStart_last3days() {
		return start_last3days;
	}



	public void setStart_last3days(String start_last3days) {
		this.start_last3days = start_last3days;
	}



	public String getEnd_last3days() {
		return end_last3days;
	}



	public void setEnd_last3days(String end_last3days) {
		this.end_last3days = end_last3days;
	}



	public String getStart_last7days() {
		return start_last7days;
	}



	public void setStart_last7days(String start_last7days) {
		this.start_last7days = start_last7days;
	}



	public String getEnd_last7days() {
		return end_last7days;
	}



	public void setEnd_last7days(String end_last7days) {
		this.end_last7days = end_last7days;
	}



	public String getStart_last15days() {
		return start_last15days;
	}



	public void setStart_last15days(String start_last15days) {
		this.start_last15days = start_last15days;
	}



	public String getEnd_last15days() {
		return end_last15days;
	}



	public void setEnd_last15days(String end_last15days) {
		this.end_last15days = end_last15days;
	}



	public String getStart_last30days() {
		return start_last30days;
	}



	public void setStart_last30days(String start_last30days) {
		this.start_last30days = start_last30days;
	}



	public String getEnd_last30days() {
		return end_last30days;
	}



	public void setEnd_last30days(String end_last30days) {
		this.end_last30days = end_last30days;
	}



	public String getStart_last60days() {
		return start_last60days;
	}



	public void setStart_last60days(String start_last60days) {
		this.start_last60days = start_last60days;
	}



	public String getEnd_last60days() {
		return end_last60days;
	}



	public void setEnd_last60days(String end_last60days) {
		this.end_last60days = end_last60days;
	}



	public String getStart_last90days() {
		return start_last90days;
	}



	public void setStart_last90days(String start_last90days) {
		this.start_last90days = start_last90days;
	}



	public String getEnd_last90days() {
		return end_last90days;
	}



	public void setEnd_last90days(String end_last90days) {
		this.end_last90days = end_last90days;
	}



	public String getStart_last180days() {
		return start_last180days;
	}



	public void setStart_last180days(String start_last180days) {
		this.start_last180days = start_last180days;
	}



	public String getEnd_last180days() {
		return end_last180days;
	}



	public void setEnd_last180days(String end_last180days) {
		this.end_last180days = end_last180days;
	}



	public String getStart_next3days() {
		return start_next3days;
	}



	public void setStart_next3days(String start_next3days) {
		this.start_next3days = start_next3days;
	}



	public String getEnd_next3days() {
		return end_next3days;
	}



	public void setEnd_next3days(String end_next3days) {
		this.end_next3days = end_next3days;
	}



	public String getStart_next7days() {
		return start_next7days;
	}



	public void setStart_next7days(String start_next7days) {
		this.start_next7days = start_next7days;
	}



	public String getEnd_next7days() {
		return end_next7days;
	}



	public void setEnd_next7days(String end_next7days) {
		this.end_next7days = end_next7days;
	}



	public String getStart_next15days() {
		return start_next15days;
	}



	public void setStart_next15days(String start_next15days) {
		this.start_next15days = start_next15days;
	}



	public String getEnd_next15days() {
		return end_next15days;
	}



	public void setEnd_next15days(String end_next15days) {
		this.end_next15days = end_next15days;
	}



	public String getStart_next30days() {
		return start_next30days;
	}



	public void setStart_next30days(String start_next30days) {
		this.start_next30days = start_next30days;
	}



	public String getEnd_next30days() {
		return end_next30days;
	}



	public void setEnd_next30days(String end_next30days) {
		this.end_next30days = end_next30days;
	}



	public String getStart_next60days() {
		return start_next60days;
	}



	public void setStart_next60days(String start_next60days) {
		this.start_next60days = start_next60days;
	}



	public String getEnd_next60days() {
		return end_next60days;
	}



	public void setEnd_next60days(String end_next60days) {
		this.end_next60days = end_next60days;
	}



	public String getStart_next90days() {
		return start_next90days;
	}



	public void setStart_next90days(String start_next90days) {
		this.start_next90days = start_next90days;
	}



	public String getEnd_next90days() {
		return end_next90days;
	}



	public void setEnd_next90days(String end_next90days) {
		this.end_next90days = end_next90days;
	}



	public String getStart_next180days() {
		return start_next180days;
	}



	public void setStart_next180days(String start_next180days) {
		this.start_next180days = start_next180days;
	}



	public String getEnd_next180days() {
		return end_next180days;
	}



	public void setEnd_next180days(String end_next180days) {
		this.end_next180days = end_next180days;
	}



	public static void main(String[] args) {
		TimeOptions t = new TimeOptions();
		
	}
	
	
}
