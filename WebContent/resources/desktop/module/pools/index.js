$(function(){
    initPage();
});
function initPage(){
    initUnabsorbed();
    initAssigned();
}
function initUnabsorbed(){
    var cols = [ {
	field : 'accountname',
	title : '客户名称',
	formatter:showTip
    }, {
	field : 'rating',
	title : '客户状态'
    },{
	field : 'grade',
	title : '客户级别'
    },{
	field : 'leadsource',
	title : '客户来源'
    },{
	field : 'phone',
	title : '电话'
    },{
	field : 'bill_city',
	title : '城市'
    },{
	field : 'description',
	title : '描述',
	formatter:showTip
    },{
	field : 'modifiedtime',
	title : '最新修改时间'
    },{
	field : 'smownerid',
	title : '负责人'
    }];
    cols = setDefWidth(cols, 80);
    $('#tb_unabsorbed').datagrid({
	url:'crm/module/pools/loadUnabsorbed',
	collapsible : false,
	idField : 'accountid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	pageSize:20,
	toolbar : [{
	    text : '分配',
	    iconCls:'icon-add',
	    handler : function() {
		
	    }
	},{
	    text : '领取',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '批量分配',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	},{
	    text : '放入客户池',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	},{
	    text : '移除客户池',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}
function initAssigned(){
    var cols = [ {
	field : 'maillistname',
	title : '客户名称'
    }, {
	field : 'description',
	title : '客户状态'
    },{
	field : 'description',
	title : '客户级别'
    },{
	field : 'description',
	title : '客户来源'
    },{
	field : 'description',
	title : '电话'
    },{
	field : 'description',
	title : '城市'
    },{
	field : 'description',
	title : '描述'
    },{
	field : 'description',
	title : '分配时间'
    },{
	field : 'description',
	title : '到期时间'
    },{
	field : 'description',
	title : '负责人'
    }];
    cols = setDefWidth(cols, 80);
    $('#tb_assigned').datagrid({
	url:'crm/module/maillists/list',
	collapsible : false,
	idField : 'maillistid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	toolbar : [{
	    text : '延期',
	    iconCls:'icon-add',
	    handler : function() {
		
	    }
	},{
	    text : '释放',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '批量释放',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	},{
	    text : '批量修改',
	    iconCls:'icon-remove',
	    handler : function() {
	    }
	}],
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}