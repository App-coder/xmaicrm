//定义页面变量，需要前缀，防止多页面变量重复
var noteplans_entitytype = 'Noteplans';
var noteplans_id = 'noteplansid';

$(function() {
  //设置视图
	$('#noteplans_list').datagrid({
		url : 'noteplans/renderView',
		doSize:true,
		collapsible : false,
		idField : noteplans_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:noteplans_entitytype,viewid:noteplans_viewid},
		columns : [noteplans_columns],
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
		    $('#noteplans_list').datagrid('fixColumnSize'); 
		}
	    });
    
});