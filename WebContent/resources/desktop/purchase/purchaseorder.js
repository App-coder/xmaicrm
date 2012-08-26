//定义页面变量，需要前缀，防止多页面变量重复
var purchaseorder_entitytype = 'PurchaseOrder';
var purchaseorder_id = 'purchaseorderid';

$(function() {
  //设置视图
	$('#purchaseorder_list').datagrid({
		url : 'purchaseorder/renderView',
		doSize:true,
		collapsible : false,
		idField : purchaseorder_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:purchaseorder_entitytype,viewid:purchaseorder_viewid},
		columns : [purchaseorder_columns],
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
		    $('#purchaseorder_list').datagrid('fixColumnSize'); 
		}
	    });
    
});