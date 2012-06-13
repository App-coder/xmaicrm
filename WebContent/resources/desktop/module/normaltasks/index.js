$(function() {
    initList();
});
function initList(){
    
    var cols = [ {
	field : 'accountname',
	title : '客户名称 '
    }, {
	field : 'noteplanname',
	title : '任务计划'
    },{
	field : 'planstatus',
	title : '计划状态'
    },{
	field : 'startdate',
	title : '开始日期'
    },{
	field : 'enddate',
	title : '结束日期'
    },{
	field : 'taskstatus',
	title : '任务状态'
    },{
	field : 'ownername',
	title : '负责人'
    },{
	field : 'creator',
	title : '创建人'
    },{
	field : 'modifiedtime',
	title : '修改时间'
    }];	
    cols = setDefWidth(cols, 80);
    
    $('#view_list').datagrid({
	url : 'crm/module/normaltasks/loadList',
	collapsible : false,
	idField : "",
	rownumbers : true,
	pagination:true,
	queryParams:{taskstatus:0},
	columns : [cols],
	pageSize:20,
	toolbar : [{
	    text : '删除',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	}, {
	    text : '随机领取任务',
	    iconCls:'icon-task',
	    handler : function() {
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]]
    });
}
function loadNormalTask(taskstatus,obj){
    $("#tasksstatus").find(".easyui-linkbutton").removeClass("lb_ck");
    $(obj).addClass("lb_ck");
    
    $('#view_list').datagrid("options").pageNumber = 1;
    $('#view_list').datagrid("options").queryParams = {taskstatus:taskstatus};
    $('#view_list').datagrid("reload");
}