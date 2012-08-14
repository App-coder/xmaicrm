//定义页面变量，需要前缀，防止多页面变量重复
var duishous_entitytype = 'Duishous';
var duishous_id = 'duishousid';

$(function() {
  //设置视图
	$('#duishous_list').datagrid({
		url : 'duishous/renderView',
		doSize:true,
		collapsible : false,
		idField : duishous_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:duishous_entitytype,viewid:duishous_viewid},
		columns : [duishous_columns],
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