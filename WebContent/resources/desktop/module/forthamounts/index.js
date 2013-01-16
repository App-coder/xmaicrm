$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : 'serialname',
	title : '订单'
    }, {
	field : 'productname',
	title : '账单'
    },{
	field : 'cangku',
	title : '摘要'
    },{
	field : 'setype',
	title : '日期'
    },{
	field : 'ismakeup',
	title : '应收款'
    },{
	field:'1',
	title:'应付款'
    },{
	field:'2',
	title:'收款金额'
    },{
	field:'3',
	title:'付款金额'
    },{
	field:'4',
	title:'操作人'
    },{
	field:'5',
	title:'操作时间'
    }];
    cols = setDefWidth(cols, 80);
    $('#tab_list').datagrid({
	url:'',
	collapsible : false,
	idField : 'serialid',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
}