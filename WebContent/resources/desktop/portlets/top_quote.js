$(function(){
    init_topquote();
});
function init_topquote(){
    var cols = [ {
	field : 'subject',
	title : '编号'
    },{
	field : 'total',
	title : '总计'
    },{
	field:'currency',
	title:'货币'
    },{
	field:'validtill',
	title:'报价日期'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_topquote').datagrid({
	url:'crm/portlets/top_quote/getJson',
	collapsible : false,
	idField : 'quoteid',
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