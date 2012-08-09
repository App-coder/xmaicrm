$(function(){
    init_todayaccount();
});
function init_todayaccount(){
    var cols = [ {
	field : 'accountname',
	title : '客户名称'
    },{
	field : 'phone',
	title : '电话'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_todayaccount').datagrid({
	url:'crm/portlets/today_account/getJson',
	collapsible : false,
	idField : 'cvid',
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