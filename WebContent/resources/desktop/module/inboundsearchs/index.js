$(function(){
    initPage();
});
function initPage(){
    var cols = [ {
	field : 'serialname',
	title : '客户名称'
    }, {
	field : 'productname',
	title : '客户编号'
    },{
	field : 'cangku',
	title : '公司电话'
    },{
	field : 'setype',
	title : '客户行业'
    }];
    cols = setDefWidth(cols, 80);
    $('#tablist').datagrid({
	collapsible : false,
	idField : '',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	pageSize:10,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols ],
    });
    
    
    
    var cols_faq = [ {
	field : 'serialname',
	title : '问题 '
    }];
    cols_faq = setDefWidth(cols_faq, 80);
    $('#tablist_faq').datagrid({
	collapsible : false,
	idField : '',
	singleSelect : true,
	rownumbers : true,
	fitColumns:true,
	pagination : true,
	pageSize:10,
	frozenColumns : [[{
		field : 'ck',
		checkbox : true
	}]],
	columns : [ cols_faq ],
    });
    
    
}