//定义页面变量，需要前缀，防止多页面变量重复
var account_entitytype = 'Accounts';
var account_id = 'accountid';

$(function() {
  //设置视图
	$('#account_list').datagrid({
		url : 'customer/renderView',
		doSize:true,
		collapsible : false,
		idField : account_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:account_entitytype,viewid:account_viewid},
		columns : [account_columns],
		toolbar : [ {
		    text : '编辑',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		onLoadSuccess:function(data){
		    $('#account_list').datagrid('fixColumnSize'); 
		}
	    });
    
});