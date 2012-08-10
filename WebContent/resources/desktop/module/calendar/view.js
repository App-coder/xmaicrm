var oldevts = [];
$(function() {
    $('#calendar').fullCalendar({
	defaultView:'agendaDay',
	monthNames:['一月','二月', '三月', '四月', '五月', '六月', '七月','八月', '九月', '十月', '十一月', '十二月'],
	monthNamesShort:['一','二', '三', '四', '五', '六', '七', '八', '九', '十', '十一', '十二'],	
	dayNames:['星期日', '星期一', '星期二', '星期三','星期四', '星期五', '星期六'],
	dayNamesShort:['日', '一', '二', '三','四', '五', '六'],
	theme : true,
	allDaySlot:false,
	header : {
	    left : 'prev,next today',
	    center : 'title',
	    right : 'month,agendaWeek,agendaDay'
	},
	editable : false,
	buttonText:{
	    prev:     '昨天',
	    next:     '明天',
	    prevYear: '去年',
	    nextYear: '明年',
	    today:    '今天',
	    month:    '月',
	    week:     '周',
	    day:      '日'
	},
	viewDisplay : function(view) {
	    $.post('crm/module/calendar/getEvent',{start:view.start.toString('yyyy-MM-d'),end:view.end.toString('yyyy-MM-d')},function(evts){
		if(oldevts.length>0){
		    $('#calendar').fullCalendar('removeEventSource',oldevts);
		}
		oldevts = evts; 
		$('#calendar').fullCalendar('addEventSource', evts);
	    },'json');
	}
    });
});