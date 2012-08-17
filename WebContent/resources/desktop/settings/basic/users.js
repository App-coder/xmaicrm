$(function(){
    initPage();
});
//初始化
function initPage(){
    
    $('#user_list').datagrid({
	url : 'settings/users/list',
	collapsible : false,
	idField : '',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
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
	columns : [ [ {
	    field : 'name',
	    title : '姓名',
	},{
	    field : 'name',
	    title : '用户名',
	},{
	    field : 'name',
	    title : '角色',
	},{
	    field : 'name',
	    title : '部门',
	},{
	    field : 'name',
	    title : '状态',
	},{
	    field : 'name',
	    title : '管理员',
	},{
	    field : 'name',
	    title : '电话',
	},{
	    field : 'name',
	    title : 'Email',
	}] ],
    });
    
}