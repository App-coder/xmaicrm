$(function(){
    init_topsalesorder();
});
function init_topsalesorder(){
    var cols = [ {
	field : 'subject',
	title : '合同订单编号'
    },{
	field : 'total',
	title : '总计'
    },{
	field : 'currency',
	title : '货币'
    },{
	field : 'duedate',
	title : '签约日期'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_topsalesorder').datagrid({
	url:'crm/portlets/top_salesorder/getJson',
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