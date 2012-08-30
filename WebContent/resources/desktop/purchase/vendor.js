//定义页面变量，需要前缀，防止多页面变量重复
var vendor_entitytype = 'Vendors';
var vendor_id = 'vendorid';

$(function() {
  //设置视图
	$('#vendor_list').datagrid({
		url : 'vendor/renderView',
		doSize:true,
		collapsible : false,
		idField : vendor_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:vendor_entitytype,viewid:vendor_viewid},
		columns : [vendor_columns],
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
		    $('#vendor_list').datagrid('fixColumnSize'); 
		}
	    });
    
});