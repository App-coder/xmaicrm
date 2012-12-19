$(function(){
    initGrid();
});
function initGrid(){
    for(var i=0;i<relateds.length;i++){
	//附件模块
	if(relateds[i]=='get_attachments'){
	    rel_attachments();
	}else if(relateds[i] == 'get_accounts'){
	    //客户
	    rel_accounts();
	}else if(relateds[i] == 'get_contacts'){
	    //联系人
	    rel_contacts();
	}else if(relateds[i] == 'get_opportunities'){
	    //销售机会
	    rel_opportunities();
	}else if(relateds[i] == 'get_activities'){
	    rel_activities();
	}
    }
}
function rel_attachments(){
    var cols = [ {
	field : 'serialname',
	title : '附件'
    }, {
	field : 'productname',
	title : '描述'
    },{
	field : 'cangku',
	title : '负责人'
    },{
	field : 'setype',
	title : '工具'
    },{
	field : 'ismakeup',
	title : '创建时间'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_get_attachments').datagrid({
	title:'附件',
	url:'crm/attachments/getRelAttachments',
	collapsible : false,
	idField : 'attachmentsid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	queryParams:{module:module,crmid:crmid},
	toolbar : [{
	    text : '新增',
	    iconCls:'icon-add',
	    handler : function() {
		
	    }
	},{
	    text : '删除',
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
function rel_accounts(){
    var cols = [ {
	field : '1',
	title : '客户名称'
    }, {
	field : '2',
	title : '客户编号'
    },{
	field : '3',
	title : '首要联系人'
    },{
	field : '4',
	title : '手机'
    },{
	field : '5',
	title : '电话'
    },{
	field : '6',
	title : 'Email'
    },{
	field : '7',
	title : '客户状态'
    },{
	field : '8',
	title : '最新进展'
    },{
	field : '9',
	title : '负责人'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_get_accounts').datagrid({
	title:'客户',
	url:'crm/attachments/getRelAttachments',
	collapsible : false,
	idField : 'accountid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	queryParams:{module:module,crmid:crmid},
	toolbar : [{
	    text : '选择',
	    iconCls:'icon-ok',
	    handler : function() {
		
	    }
	},{
	    text : '新增',
	    iconCls:'icon-add',
	    handler : function() {
	    }
	},{
	    text : '编辑',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '删除',
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
function rel_contacts(){
    var cols = [ {
	field : '1',
	title : '姓名'
    }, {
	field : '2',
	title : '首要联系人'
    },{
	field : '3',
	title : '职位'
    },{
	field : '4',
	title : '电话'
    },{
	field : '5',
	title : '手机'
    },{
	field : '6',
	title : '传真'
    },{
	field : '7',
	title : 'Email'
    },{
	field : '9',
	title : '负责人'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_get_contacts').datagrid({
	title:'联系人',
	url:'',
	collapsible : false,
	idField : 'accountid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	queryParams:{module:module,crmid:crmid},
	toolbar : [{
	    text : '选择',
	    iconCls:'icon-ok',
	    handler : function() {
		
	    }
	},{
	    text : '新增',
	    iconCls:'icon-add',
	    handler : function() {
	    }
	},{
	    text : '编辑',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '删除',
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
function rel_opportunities(){
    var cols = [ {
	field : '1',
	title : '销售机会名称'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_get_opportunities').datagrid({
	title:'销售机会',
	url:'',
	collapsible : false,
	idField : 'accountid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	queryParams:{module:module,crmid:crmid},
	toolbar : [{
	    text : '选择',
	    iconCls:'icon-ok',
	    handler : function() {
		
	    }
	},{
	    text : '新增',
	    iconCls:'icon-add',
	    handler : function() {
	    }
	},{
	    text : '编辑',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '删除',
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
function rel_activities(){
    var cols = [ {
	field : '1',
	title : '事件类型'
    },{
	field : '2',
	title : '主题'
    },{
	field : '3',
	title : '开始日期'
    },{
	field : '4',
	title : '结束日期'
    },{
	field : '5',
	title : '状态'
    },{
	field : '6',
	title : '优先级'
    },{
	field : '7',
	title : '负责人'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_get_activities').datagrid({
	title:'日程安排',
	url:'',
	collapsible : false,
	idField : 'accountid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	queryParams:{module:module,crmid:crmid},
	toolbar : [{
	    text : '新增',
	    iconCls:'icon-add',
	    handler : function() {
	    }
	},{
	    text : '编辑',
	    iconCls:'icon-edit',
	    handler : function() {
	    }
	},{
	    text : '删除',
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