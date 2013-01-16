$(function(){
    init_expensesmonth();
});
function init_expensesmonth(){
    var cols = [ {
	field : 'expensename',
	title : '用途'
    },{
	field : 'accountname',
	title : '客户'
    },{
	field : 'expensecategory',
	title : '类别'
    },{
	field : 'expensebill',
	title : '凭证'
    },{
	field : 'expensestatus',
	title : '进度'
    },{
	field : 'expensedate',
	title : '日期'
    },{
	field : 'smowner',
	title : '负责人'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_expensesmonth').datagrid({
	url:'crm/portlets/expensesmonth/getJson',
	collapsible : false,
	idField : 'expensesid',
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