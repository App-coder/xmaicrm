$(function() {
    init();
});
function init(){
    initGrid();
}
function initGrid(){
    $('#qunfa_list').datagrid({
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
	    title : '方案名称',
	    sortable : true
	}, {
	    field : '',
	    title : '备注',
	    sortable : true
	},{
	    field : '',
	    title : '短信内容',
	    sortable : true
	} ] ],
	toolbar : [ {
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
	}]]
    });
}