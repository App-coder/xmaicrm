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

    var cols = [ {
	field : '1',
	title : '审批对象'
    }, {
	field : '2',
	title : '审批流程'
    }, {
	field : '3',
	title : '审批步骤'
    },{
	field : '4',
	title : '审批人'
    },{
	field : '5',
	title : '审批结果'
    },{
	field : '6',
	title : '审批备注'
    },{
	field : '7',
	title : '审批时间'
    }  ];
    cols = setDefWidth(cols, 80);
    
    $('#willapprove').datagrid({
	url : 'crm/approvelog/willapprove',
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
    
    $('#hasapprove').datagrid({
	url : 'crm/approvelog/hasapprove',
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
// 自定义提醒
function remindWind() {
    $("#wind_remind").window("open");
    
    var cols = [ {
	field : '1',
	title : '提醒时间'
    }, {
	field : '2',
	title : '客户名称'
    }, {
	field : '3',
	title : '提醒内容'
    }, {
	field : '4',
	title : '创建时间'
    } ];
    cols = setDefWidth(cols, 80);
    
    $('#runremind').datagrid({
	url : 'crm/reminders/runremind',
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
    
    $('#overremind').datagrid({
	url : 'crm/reminders/overremind',
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