//定义页面变量，需要前缀，防止多页面变量重复
var quotes_entitytype = 'Quotes';
var quotes_id = 'quoteid';

$(function() {
  //设置视图
	$('#quotes_list').datagrid({
		url : 'quotes/renderView',
		doSize:true,
		collapsible : false,
		idField : potential_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:quotes_entitytype,viewid:quotes_viewid},
		columns : [quotes_columns],
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
		    $('#quotes_list').datagrid('fixColumnSize'); 
		}
	    });
    
});