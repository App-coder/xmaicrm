//定义页面变量，需要前缀，防止多页面变量重复
var invoice_entitytype = 'Invoice';
var invoice_id = 'invoiceid';

$(function() {
  //设置视图
	$('#invoice_list').datagrid({
		url : 'invoice/renderView',
		doSize:true,
		collapsible : false,
		idField : invoice_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:invoice_entitytype,viewid:invoice_viewid},
		columns : [invoice_columns],
		toolbar : [ {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]]
	    });
    
});