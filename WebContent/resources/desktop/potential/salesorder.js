//定义页面变量，需要前缀，防止多页面变量重复
var salesorder_entitytype = 'Salesorder';
var salesorder_id = 'salesorderid';

$(function() {
  //设置视图
	$('#salesorder_list').datagrid({
		url : 'salesorder/renderView',
		doSize:true,
		collapsible : false,
		idField : salesorder_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:salesorder_entitytype,viewid:salesorder_viewid},
		columns : [salesorder_columns],
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