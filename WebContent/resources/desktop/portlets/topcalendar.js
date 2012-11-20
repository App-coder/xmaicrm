$(function(){
    loadPage();
});
function loadPage(){
    var cols = [ {
	field : 'accountname',
	title : '客户名称'
    },{
	field : 'phone',
	title : '电话'
    }];
    cols = setDefWidth(cols, 80);
    $('#tablist').datagrid({
	url:'crm/portlets/top_account/getJson',
	collapsible : false,
	idField : 'cvid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	columns : [ cols ]
    });
}