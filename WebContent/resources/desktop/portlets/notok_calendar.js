$(function(){
    init_notok_calendar();
});
function init_notok_calendar(){
    var cols = [ {
	field : 'subject',
	title : '主题'
    },{
	field : 'dueDate',
	title : '开始时间'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_notok_calendar').datagrid({
	url:'crm/portlets/notok_calendar/getJson',
	collapsible : false,
	idField : 'cvid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	fit:true,
	border:false,
	columns : [ cols ]
    });
}