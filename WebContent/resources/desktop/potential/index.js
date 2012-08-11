//定义页面变量，需要前缀，防止多页面变量重复
var potential_columns;
var potential_viewid = -1;
var potential_entitytype = 'Potentials';
var potential_id = 'potentialid';

$(function() {
    $.get('customview/getViewColumn',{entitytype:potential_entitytype,viewid:potential_viewid},function(data){
	potential_columns = data;
	
	//设置视图
	$('#potential_list').datagrid({
		url : 'potential/renderView',
		fit : 'true',
		nowrap : true,
		striped : true,
		collapsible : false,
		idField : potential_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		fitColumns:true,
		queryParams:{entitytype:potential_entitytype,viewid:potential_viewid},
		toolbar : [ {
		    text : '预览',
		    iconCls:'icon-view',
		    handler : function() {

		    }
		}],
		frozenColumns : [[{
			field : 'ck',
			checkbox : true
		}]],
		columns : [potential_columns],
	    });
	
    },'json');
});