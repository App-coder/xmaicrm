$(function(){
    init_topnotes();
});
function init_topnotes(){
    var cols = [ {
	field : 'title',
	title : '主题'
    },{
	field : 'accountname',
	title : '客户'
    },{
	field:'contactDate',
	title:'联系日期'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_topnotes').datagrid({
	url:'crm/portlets/top_notes/getJson',
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