$(function(){
    initPage();
});
//初始化
function initPage(){
    
    var cols = [ {
	    field : 'groupname',
	    title : '部门名称'
	},{
	    field : 'description',
	    title : '描述'
	}];
    cols = setDefWidth(cols,80);
    
    $('#grouplist').datagrid({
	url : 'settings/group/listAll',
	collapsible : false,
	idField : 'groupid',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	height : 362,
	toolbar : [ {
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