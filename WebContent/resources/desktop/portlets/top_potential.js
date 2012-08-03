$(function(){
    init_toppotential();
});
function init_toppotential(){
    var cols = [ {
	field : 'potentialname',
	title : '销售机会'
    },{
	field : 'amount',
	title : '金额'
    },{
	field : 'createdtime',
	title : '预计成交日期'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_toppotential').datagrid({
	url:'crm/portlets/top_potential/getJson',
	collapsible : false,
	idField : 'cvid',
	rownumbers : true,
	pagination : false,
	fitColumns : true,
	singleSelect : true,
	border:false,
	fit:true,
	columns : [ cols ]
    });
}