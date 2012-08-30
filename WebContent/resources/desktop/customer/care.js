//定义页面变量，需要前缀，防止多页面变量重复
var care_entitytype = 'Cares';
var care_id = 'careid';

$(function() {
  //设置视图
	$('#care_list').datagrid({
		url : 'care/renderView',
		doSize:true,
		collapsible : false,
		idField : care_id,
		singleSelect : true,
		rownumbers : true,
		pagination:true,
		queryParams:{entitytype:care_entitytype,viewid:care_viewid},
		columns : [care_columns],
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
		    $('#care_list').datagrid('fixColumnSize'); 
		}
	    });
    
});