$(function() {
    setTimeout(loadMsg,2000);
});



function loadMsg() {
    $.messager.show({
	title : '系统提示',
	msg : '你有四条短信息。【详细…】<span id=\'tipmsg\'></span>',
	timeout:5000,
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
function getResultStr(resultnum)
{
	if ( resultnum == 0 )
	{
		return "尚未审批";
	}
	if ( resultnum == -1 )
	{
		return "选择审批流程";
	}
	if ( resultnum == 1 )
	{
		return "不通过，返回上一步";
	}
	if ( resultnum == 2 )
	{
		return "不通过，返回负责人";
	}
	if ( resultnum == 3 )
	{
		return "通过，继续下一步";
	}
	if ( resultnum == 4 )
	{
		return "审批成功，结束流程";
	}
	if ( resultnum == 5 )
	{
		return "审批失败，结束流程";
	}
	return "false";
}

function approveWind() {
    $("#wind_approve").window("open");

    var cols = [ {
			field : 'crmid',
			title : '审批对象'			
	    }, {
			field : 'approvename',
			title : '审批流程',
			formatter: function(value,row,index){
				if(row.approveid==-1)
					return "负责人提交审批流程";
				else
					return row.approvename;
			}
	    }, {
			field : 'approvestepname',
			title : '审批步骤',
			formatter: function(value,row,index){
				if(row.stepid==-1)
					return "负责人提交";
				else
					return row.approvestepname;
			}
	    },{
			field : 'user_name',
			title : '审批人'
	    },{
			field : 'approveresult',
			title : '审批结果',
			formatter: function(value,row,index){
				return getResultStr(value);
			}
	    },{
		field : 'memo',
		title : '审批备注'
	    },{
		field : 'updated_at',
		title : '审批时间'
    }  ];
    cols = setDefWidth(cols, 120);
    
    $('#willapprove').datagrid({
		url : 'crm/approvelog/approveStatus',
		collapsible : false,
		idField : 'id',
		queryParams:{folder:"unremind"},
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		pageSize:10,
		fitColumns:true,
		fit:true,
		
		columns : [ cols ],
		onLoadSuccess:function(data){
			$('#hasapprove').datagrid({
				url : 'crm/approvelog/approveStatus',
				collapsible : false,
				idField : 'id',
				queryParams:{folder:"reminded"},
				singleSelect : true,
				rownumbers : true,
				pagination:true,
				pageSize:10,
				fitColumns:true,
				fit:true,
				
				columns : [ cols ]
		    });
		}
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