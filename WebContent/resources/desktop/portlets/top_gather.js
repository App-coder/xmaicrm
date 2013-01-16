$(function(){
    init_topgather();
});
function init_topgather(){
    var cols = [{
	field:'gathername',
	title:'应收款编号'
    }, {
	field : 'planamount',
	title : '应收金额'
    },{
	field : 'accountname',
	title : '客户'
    },{
	field : 'plandate',
	title : '应收日期'
    },{
	field:'gathertimes',
	title:'期次',
	formatter:function(val,row,idx){
	    var zh = ['一','二','三','四','五','六','七','八','九','十'];
	    return zh[Number(val)-1]+"期";
	}
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_topgather').datagrid({
	url:'crm/portlets/top_gather/getJson',
	collapsible : false,
	idField : 'crmid',
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