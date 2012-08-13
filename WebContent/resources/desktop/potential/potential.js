//定义页面变量，需要前缀，防止多页面变量重复
var potential_entitytype = 'Potentials';
var potential_id = 'potentialid';

$(function() {
  //设置视图
	$('#potential_list').datagrid({
		url : 'potential/renderView',
		doSize:true,
		collapsible : false,
		idField : potential_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:potential_entitytype,viewid:potential_viewid},
		columns : [potential_columns],
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
		    $('#potential_list').datagrid('fixColumnSize'); 
		}
	    });
    
});