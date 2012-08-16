//定义页面变量，需要前缀，防止多页面变量重复
var tuihuos_entitytype = 'Tuihuos';
var tuihuos_id = 'tuihuosid';

$(function() {
  //设置视图
	$('#tuihuos_list').datagrid({
		url : 'tuihuos/renderView',
		doSize:true,
		collapsible : false,
		idField : tuihuos_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:tuihuos_entitytype,viewid:tuihuos_viewid},
		columns : [tuihuos_columns],
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