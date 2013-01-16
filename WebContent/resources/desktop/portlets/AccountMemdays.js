$(function(){
    init_AccountMemdays();
});
function init_AccountMemdays(){
    var cols = [ {
	field : 'memdayname',
	title : '主题'
    },{
	field : 'accountname',
	title : '客户'
    },{
	field : 'memday938',
	title : '类型'
    },{
	field : 'memday1004',
	title : '日历'
    },{
	field : 'memday940',
	title : '纪念日'
    },{
	field : 'memday946',
	title : '下次提醒'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_AccountMemdays').datagrid({
	url:'crm/portlets/AccountMemdays/getJson',
	collapsible : false,
	idField : 'memdaysid',
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