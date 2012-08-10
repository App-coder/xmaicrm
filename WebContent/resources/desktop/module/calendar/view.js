$(function() {
    var date = new Date();
    var d = date.getDate();
    var m = date.getMonth();
    var y = date.getFullYear();

    $('#calendar').fullCalendar({
	defaultView:'agendaDay',
	monthNames:['一月','二月', '三月', '四月', '五月', '六月', '七月','八月', '九月', '十月', '十一月', '十二月'],
	monthNamesShort:['一','二', '三', '四', '五', '六', '七', '八', '九', '十', '十一', '十二'],	
	dayNames:['星期日', '星期一', '星期二', '星期三','星期四', '星期五', '星期六'],
	dayNamesShort:['日', '一', '二', '三','四', '五', '六'],
	theme : true,
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
	events : [ {
	    title : 'All Day Event',
	    start : new Date(y, m, 1)
	}, {
	    title : 'Long Event',
	    start : new Date(y, m, d - 5),
	    end : new Date(y, m, d - 2)
	}, {
	    id : 999,
	    title : 'Repeating Event',
	    start : new Date(y, m, d - 3, 16, 0),
	    allDay : false
	}, {
	    id : 999,
	    title : 'Repeating Event',
	    start : new Date(y, m, d + 4, 16, 0),
	    allDay : false
	}, {
	    title : 'Meeting',
	    start : new Date(y, m, d, 10, 30),
	    allDay : false
	}, {
	    title : 'Lunch',
	    start : new Date(y, m, d, 12, 0),
	    end : new Date(y, m, d, 14, 0),
	    allDay : false
	}, {
	    title : 'Birthday Party',
	    start : new Date(y, m, d + 1, 19, 0),
	    end : new Date(y, m, d + 1, 22, 30),
	    allDay : false
	}, {
	    title : 'Click for Google',
	    start : new Date(y, m, 28),
	    end : new Date(y, m, 29)
	} ]
    });
});