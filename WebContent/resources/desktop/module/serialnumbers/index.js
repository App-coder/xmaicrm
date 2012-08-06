$(function() {
    init();
});
function init(){
    
    var cols = [ {
	field : 'serialname',
	title : '序列号',
	sortable:true
    }, {
	field : 'productname',
	title : '产品名称'
    },{
	field : 'cangku',
	title : '仓库'
    },{
	field : 'setype',
	title : '状态'
    },{
	field : 'ismakeup',
	title : '是否补录'
    }];
    cols = setDefWidth(cols, 80);
    $('#view_list').datagrid({
	url:'crm/module/serialnumbers/loadlist',
	collapsible : false,
	idField : 'serialid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	pageSize:20,
	toolbar : [{
	    text : '查看历史',
	    iconCls:'icon-add',
	    handler : function() {
		
	    }
	},{
	    text : '编辑序列号',
	    iconCls:'icon-edit',
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
