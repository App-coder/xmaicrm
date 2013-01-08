$(function(){
    init_onlineusers();
});
function init_onlineusers(){
    var cols = [ {
	field : 'rolename',
	title : '角色'
    },{
	field : 'userName',
	title : '用户名'
    },{
	field : 'lastName',
	title : '姓名'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_online_users').datagrid({
	url:'crm/portlets/online_users/getJson',
	collapsible : false,
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	fit:true,
	border:false,
	columns : [ cols ]
    });
}