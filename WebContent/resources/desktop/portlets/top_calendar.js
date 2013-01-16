$(function(){
    init_topcalendar();
});
function init_topcalendar(){
    var cols = [ {
	field : 'calendartype',
	title : '事件类型'
    },{
	field : 'subject',
	title : '主题'
    },
    {
	field : 'createdtime',
	title : '创建时间'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_topcalendar').datagrid({
	url:'crm/portlets/top_calendar/getJson',
	collapsible : false,
	idField : 'cvid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	columns : [ cols ]
    });
}