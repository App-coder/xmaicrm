$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : 'qunfaname',
	title : '方案名称'
    }, {
	field : 'description',
	title : '备注'
    },{
	field : 'qunfamsg',
	title : '短信内容'
    } ];
    cols = setDefWidth(cols, 80);
    $('#tablist').datagrid({
	url:'crm/module/qunfas/list',
	collapsible : false,
	idField : 'ruleid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	toolbar : [{
	    text : '添加',
	    iconCls:'icon-add',
	    handler : function() {
		
	    }
	},{
	    text : '修改',
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