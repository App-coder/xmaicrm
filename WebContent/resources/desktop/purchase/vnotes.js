//定义页面变量，需要前缀，防止多页面变量重复
var vnotes_entitytype = 'Vnotes';
var vnotes_id = 'vnotesid';

$(function() {
  //设置视图
	$('#vnotes_list').datagrid({
		url : 'vnotes/renderView',
		doSize:true,
		collapsible : false,
		idField : vnotes_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:vnotes_entitytype,viewid:vnotes_viewid},
		columns : [vnotes_columns],
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
		    $('#vnotes_list').datagrid('fixColumnSize'); 
		}
	    });
    
});