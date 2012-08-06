$(function() {
    loadMsg();
});
function loadMsg() {
    $.messager.show({
	title : '系统提示',
	msg : '你有四条短信息。【详细…】<span id=\'tipmsg\'></span>',
	timeout : 0,
	showType : 'slide'
    });
    $("#tipmsg").parent().parent(".window").css("bottom", "0").css("position",
	    "fixed");
}
// 短信窗口显示
function msgWind() {
    $("#wind_msg").window("open");

    var cols = [ {
	field : 'content',
	title : '短信内容'
    }, {
	field : 'lastname',
	title : '发送号码'
    }, {
	field : 'sendtime',
	title : '发送时间'
    } ];
    cols = setDefWidth(cols, 80);
    $('#messagelist').datagrid({
	url : 'crm/sendsmsbox/list',
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	fit:true,
	frozenColumns : [ [ {
	    field : 'ck',
	    checkbox : true
	} ] ],
	columns : [ cols ]
    });

}
// 审批中心
function approveWind() {
    $("#wind_approve").window("open");
}
// 自定义提醒
function remindWind() {
    $("#wind_remind").window("open");
}