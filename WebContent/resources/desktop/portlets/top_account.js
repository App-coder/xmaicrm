$(function(){
    init_topaccount();
});
function init_topaccount(){
    var cols = [ {
	field : 'accountname',
	title : '客户名称'
    },{
	field : 'phone',
	title : '电话'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_topaccount').datagrid({
	url:'crm/portlets/top_account/getJson',
	collapsible : false,
	idField : 'accountid',
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