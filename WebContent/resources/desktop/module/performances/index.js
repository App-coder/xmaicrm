$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : '1',
	title : '员工姓名'
    }, {
	field : '2',
	title : '部门'
    },{
	field : '3',
	title : '期初客户'
    },{
	field : '4',
	title : '新客户'
    },{
	field : '5',
	title : '日程安排'
    },{
	field : '6',
	title : '销售机会'
    },{
	field : '7',
	title : '机会金额'
    },{
	field : '8',
	title : '报价单'
    },{
	field : '9',
	title : '报价金额'
    },{
	field : '10',
	title : '合同订单'
    },{
	field : '11',
	title : '合同金额'
    },{
	field : '12',
	title : '已收款'
    }];
    cols = setDefWidth(cols, 80);
    
    $('#tab_list').datagrid({
	url:'',
	collapsible : false,
	idField : '',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	pageSize:20,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
    
}