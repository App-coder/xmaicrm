$(function(){
    initPage();
});
//初始化
function initPage(){
    
    var cols = [ {
	    field : 'last_name',
	    title : '姓名'
	},{
	    field : 'user_name',
	    title : '用户名'
	},{
	    field : 'rolename',
	    title : '角色'
	},{
	    field : 'groupname',
	    title : '部门'
	},{
	    field : 'status',
	    title : '状态'
	},{
	    field : 'is_admin',
	    title : '管理员'
	},{
	    field : 'phone_work',
	    title : '电话'
	},{
	    field : 'email1',
	    title : 'Email'
    }];
    cols = setDefWidth(cols,80);
    
    $('#user_list').datagrid({
	url : 'settings/users/list',
	collapsible : false,
	idField : '',
	singleSelect : true,
	rownumbers : true,
	pagination:true,
	fitColumns:true,
	height:362,
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