$(function(){
init();
});
function init(){
    $('#performances_list').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '员工姓名',
	    sortable : true
	}, {
	    field : '',
	    title : '部门',
	    sortable : true
	},{
	    field : '',
	    title : '期初客户',
	    sortable : true
	},{
	    field : '',
	    title : '新客户',
	    sortable : true
	},{
	    field : '',
	    title : '日程安排',
	    sortable : true
	} ,{
	    field : '',
	    title : '联系记录',
	    sortable : true
	},{
	    field : '',
	    title : '销售机会',
	    sortable : true
	},{
	    field : '',
	    title : '机会金额',
	    sortable : true
	},{
	    field : '',
	    title : '报价单',
	    sortable : true
	},{
	    field : '',
	    title : '报价金额',
	    sortable : true
	},{
	    field : '',
	    title : '合同订单',
	    sortable : true
	},{
	    field : '',
	    title : '合同金额',
	    sortable : true
	} ,{
	    field : '',
	    title : '已收款',
	    sortable : true
	} ] ]
    });
    
    
    $('#performances_customer').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '客户名称',
	    sortable : true
	}, {
	    field : '',
	    title : '客户编号',
	    sortable : true
	},{
	    field : '',
	    title : '城市',
	    sortable : true
	},{
	    field : '',
	    title : '电话',
	    sortable : true
	},{
	    field : '',
	    title : 'Email',
	    sortable : true
	} ,{
	    field : '',
	    title : '客户状态',
	    sortable : true
	},{
	    field : '',
	    title : '负责人',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    });
    
    $('#performances_schedule').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '类型',
	    sortable : true
	}, {
	    field : '',
	    title : '主题',
	    sortable : true
	},{
	    field : '',
	    title : '优先级',
	    sortable : true
	},{
	    field : '',
	    title : '开始日期',
	    sortable : true
	},{
	    field : '',
	    title : '开始时间',
	    sortable : true
	} ,{
	    field : '',
	    title : '结束日期',
	    sortable : true
	},{
	    field : '',
	    title : '结束时间',
	    sortable : true
	},{
	    field : '',
	    title : '备注',
	    sortable : true
	},{
	    field : '',
	    title : '负责人',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    });
    
    $('#performances_contact').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '主题',
	    sortable : true
	}, {
	    field : '',
	    title : '客户',
	    sortable : true
	},{
	    field : '',
	    title : '联系类型',
	    sortable : true
	},{
	    field : '',
	    title : '联系时间',
	    sortable : true
	},{
	    field : '',
	    title : '内容',
	    sortable : true
	} ,{
	    field : '',
	    title : '负责人',
	    sortable : true
	},{
	    field : '',
	    title : '操作',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    });
    
    
    $('#performances_sale').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '销售机会名称',
	    sortable : true
	}, {
	    field : '',
	    title : '客户名称',
	    sortable : true
	},{
	    field : '',
	    title : '销售阶段',
	    sortable : true
	},{
	    field : '',
	    title : '客户来源',
	    sortable : true
	},{
	    field : '',
	    title : '预计成交日期',
	    sortable : true
	} ,{
	    field : '',
	    title : '可能性 (%)',
	    sortable : true
	},{
	    field : '',
	    title : '金额',
	    sortable : true
	},{
	    field : '',
	    title : '负责人',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    });
    
    $('#performances_quote').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '报价单编号',
	    sortable : true
	}, {
	    field : '',
	    title : '报价单阶段',
	    sortable : true
	},{
	    field : '',
	    title : '客户名称',
	    sortable : true
	},{
	    field : '',
	    title : '报价日期',
	    sortable : true
	},{
	    field : '',
	    title : '总计',
	    sortable : true
	} ,{
	    field : '',
	    title : '负责人',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    });    
    
    $('#performances_order').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '合同订单编号',
	    sortable : true
	}, {
	    field : '',
	    title : '客户名称',
	    sortable : true
	},{
	    field : '',
	    title : '状态',
	    sortable : true
	},{
	    field : '',
	    title : '签约日期',
	    sortable : true
	},{
	    field : '',
	    title : '总计',
	    sortable : true
	} ,{
	    field : '',
	    title : '负责人',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    }); 
    
    $('#performances_account').datagrid({
	url:'',
	nowrap : true,
	striped : true,
	collapsible : false,
	idField : 'id',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	doSize:false,
	columns : [ [ {
	    field : '方案',
	    title : '期次',
	    sortable : true
	}, {
	    field : '',
	    title : '应收款编号',
	    sortable : true
	},{
	    field : '',
	    title : '应收金额',
	    sortable : true
	},{
	    field : '',
	    title : '实收金额',
	    sortable : true
	},{
	    field : '',
	    title : '应收日期',
	    sortable : true
	} ,{
	    field : '',
	    title : '收款日期',
	    sortable : true
	},{
	    field : '',
	    title : '客户',
	    sortable : true
	},{
	    field : '',
	    title : '合同订单',
	    sortable : true
	},{
	    field : '',
	    title : '负责人',
	    sortable : true
	}] ],
	toolbar : [ {
	    text : '编辑',
	    iconCls:'icon-view',
	    handler : function() {

	    }
	}]
    }); 
    
    
}